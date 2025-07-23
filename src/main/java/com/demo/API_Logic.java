package com.demo;

import java.util.HashMap;
import java.util.Map;

public class API_Logic extends API_Util {

    Map<Integer, API_Db>  userMap = new HashMap<>();
    int id = 1;

    public void addUser(String name, String email, String address, String phoneNumber) throws InterruptedException {
        API_Db user = new API_Db(id, name, email, address, phoneNumber);
        userMap.put(id, user);
        System.out.println(Success);
        id++;
    }

    public void readAllUsers() throws InterruptedException {
        if (userMap.isEmpty()) {
            System.out.println(NotFound);
        } else {
            for (API_Db user : userMap.values()) {
                System.out.println(user);
            }
        }
    }
    public void readUser(int userId) throws InterruptedException {
        API_Db user = userMap.get(userId);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println(NotFound);
        }
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
            System.out.println(NotFound);
        }
    }
    public void deleteUser(int userId) throws InterruptedException {
        if (userMap.remove(userId) != null) {
            System.out.println("User deleted successfully.");
        } else {
            System.out.println(NotFound);
        }
    }
}
