package com.demo;

import java.util.Scanner;

public class API_Ui {
    public void display() throws InterruptedException {

        API_Logic apiLogic = new API_Logic();

        System.out.println("This is User Management API");
        System.out.println("Choose any of below CRUD to perform:");
        System.out.println("1. Create User");
        System.out.println("2. Read All Users");
        System.out.println("3. Read User");
        System.out.println("4. Update User");
        System.out.println("5. Delete User");
        System.out.println("6. To Exit");
        System.out.println("Please select an option (1-5):");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter User Details");
                sc.nextLine();
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Email: ");
                String email = sc.nextLine();
                System.out.println("Address: ");
                String address = sc.nextLine();
                System.out.println("Phone Number: ");
                String phoneNumber = sc.nextLine();

                apiLogic.addUser(name, email, address, phoneNumber);
                break;
            case 2:
                System.out.println("Reading All Users");
                apiLogic.readAllUsers();
                break;
            case 3:
                System.out.println("Reading User");
                System.out.println("Enter User ID to read:");
                int userId = sc.nextInt();
                apiLogic.readUser(userId);
                break;
            case 4:
                System.out.println("Updating User");
                System.out.println("Enter User ID to update:");
                int updateId = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter New Name: ");
                String updateName = sc.nextLine();
                System.out.println("Enter New Email: ");
                String updateEmail = sc.nextLine();
                System.out.println("Enter New Address: ");
                String updateAddress = sc.nextLine();
                System.out.println("Enter New Phone Number: ");
                String updatePhoneNumber = sc.nextLine();

                apiLogic.updateUser(updateId, updateName, updateEmail, updateAddress, updatePhoneNumber);
                break;
            case 5:
                System.out.println("Deleting User");
                System.out.println("Enter User ID to delete:");
                int deleteId = sc.nextInt();
                apiLogic.deleteUser(deleteId);
                break;
            case 6:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Invalid choice. choose between(1-6).");
        }
    }
}
