package com.demo;

import java.util.HashMap;
import java.util.Map;

public class API_Logic {

    Map<Integer, API_Db>  userMap = new HashMap<>();
    int id = 1;

    API_Ui apiUi = new API_Ui();

    public void addUser(String name, String email, String address, String phoneNumber) throws InterruptedException {
        API_Db user = new API_Db(id, name, email, address, phoneNumber);
        userMap.put(id, user);
        System.out.println("added");
        id++;

        apiUi.display();
    }

    public void readAllUsers() throws InterruptedException {
        if (userMap.isEmpty()) {
            System.out.println("No users found.");
        } else {
            System.out.println("ID | Name | Email | Address | Phone Number");
            for (API_Db user : userMap.values()) {
                System.out.println(user);
            }
        }
        apiUi.display();
    }
    public void readUser(int userId) throws InterruptedException {
        API_Db user = userMap.get(userId);
        if (user != null) {
            System.out.println("User Details: " + user);
        } else {
            System.out.println("User not found with ID: " + userId);
        }
        apiUi.display();
    }
    public void updateUser(int userId, String name, String email, String address, String phoneNumber) throws InterruptedException {
        API_Db user = userMap.get(userId);
        if (user != null) {
            user.setName(name);
            user.setEmail(email);
            user.setAddress(address);
            user.setPhoneNumber(phoneNumber);
            System.out.println("User updated successfully.");
        } else {
            System.out.println("User not found with ID: " + userId);
        }
        apiUi.display();
    }
    public void deleteUser(int userId) throws InterruptedException {
        if (userMap.remove(userId) != null) {
            System.out.println("User deleted successfully.");
        } else {
            System.out.println("User not found with ID: " + userId);
        }
        apiUi.display();
    }
}
