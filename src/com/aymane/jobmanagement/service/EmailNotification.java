package com.aymane.jobmanagement.service;

public class EmailNotification implements Notification {

    @Override
    public void send(String message) {

        System.out.println("Sending EMAIL");

        System.out.println("Message: " + message);
    }
}
