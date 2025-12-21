package com.aitrich.bookmyshowclone.Domain;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Authentication auth = new Authentication();
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO BOOKYOURSHOW!");
        System.out.println("------------------------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine(); 

        switch (choice) {

            case 1:
                // -------- LOGIN --------
                System.out.print("Enter your username: ");
                String loginUser = sc.nextLine();

                System.out.print("Enter your password: ");
                String loginPass = sc.nextLine();

                AuthUser loggedUser = auth.login(loginUser, loginPass);

                if (loggedUser == null) {
                    System.out.println("Invalid username or password ");
                    break;
                }

                if (loggedUser.getRole() == Role.ADMIN) {
                    System.out.println("Welcome ADMIN: " + loginUser);
                    System.out.println("Admin Dashboard Loaded");
                } else {
                    System.out.println("Welcome USER: " + loginUser);
                    System.out.println("User Dashboard Loaded");
                }
                break;

            case 2:
                // -------- REGISTRATION --------
                System.out.print("Enter your username: ");
                String regUser = sc.nextLine();

                System.out.print("Enter your password: ");
                String regPass = sc.nextLine();

                System.out.print("Enter your role (ADMIN / USER): ");
                Role role;

                try {
                    role = Role.valueOf(sc.nextLine().trim().toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("Invalid role! Use ADMIN or USER ");
                    break;
                }

                boolean registered = auth.register(regUser, regPass, role);

                if (registered) {
                    System.out.println("Registration successful ");
                } else {
                    System.out.println("Registration failed ");
                }
                break;

            default:
                System.out.println("Enter a valid choice ");
        }

        sc.close(); 
    }
}
