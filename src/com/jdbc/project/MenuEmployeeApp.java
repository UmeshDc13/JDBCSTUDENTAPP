package com.jdbc.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class MenuEmployeeApp {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n=== EMPLOYEE MENU ===");
            System.out.println("1. Insert Employee");
            System.out.println("2. Update Employee Salary");
            System.out.println("3. Delete Employee");
            System.out.println("4. View All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 ->
                    insertEmployee();
                case 2 ->
                    updateEmployee();
                case 3 ->
                    deleteEmployee();
                case 4 ->
                    viewEmployees();
                case 5 ->
                    System.out.println("Bye 👋");
                default ->
                    System.out.println("Invalid choice, try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    // INSERT EMPLOYEE
    private static void insertEmployee() {
        System.out.print("Enter EID: ");
        int eid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Dept: ");
        String dept = sc.nextLine();

        System.out.print("Enter Salary (ex: 50000 or 50k): ");
        String s = sc.next();
        s = s.replaceAll("[^0-9.]", "");
        double salary = Double.parseDouble(s);

        String sql = "INSERT INTO employee (eid, name, location, dept, salary) VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, eid);
            ps.setString(2, name);
            ps.setString(3, location);
            ps.setString(4, dept);
            ps.setDouble(5, salary);

            int rows = ps.executeUpdate();
            System.out.println("Inserted rows = " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE SALARY
    private static void updateEmployee() {
        System.out.print("Enter EID to update salary: ");
        int eid = sc.nextInt();

        System.out.print("Enter new salary: ");
        double salary = sc.nextDouble();

        String sql = "UPDATE employee SET salary = ? WHERE eid = ?";

        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, salary);
            ps.setInt(2, eid);

            int rows = ps.executeUpdate();
            System.out.println("Updated rows = " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE EMPLOYEE
    private static void deleteEmployee() {
        System.out.print("Enter EID to delete: ");
        int eid = sc.nextInt();

        String sql = "DELETE FROM employee WHERE eid = ?";

        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, eid);

            int rows = ps.executeUpdate();
            System.out.println("Deleted rows = " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // VIEW EMPLOYEES
    private static void viewEmployees() {

        String sql = "SELECT * FROM employee";

        try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            System.out.println("\nEID | Name | Location | Dept | Salary");
            System.out.println("---------------------------------------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("eid") + " | "
                        + rs.getString("name") + " | "
                        + rs.getString("location") + " | "
                        + rs.getString("dept") + " | "
                        + rs.getDouble("salary")
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
