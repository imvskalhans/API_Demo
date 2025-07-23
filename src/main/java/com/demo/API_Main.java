package com.demo;
public class  API_Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting the API application");
        API_Logic apiLogic = new API_Logic();
        API_Ui apiUi = new API_Ui(apiLogic);
        apiUi.display();
    }
}