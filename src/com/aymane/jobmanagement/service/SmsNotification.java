package com.aymane.jobmanagement.service;

public class SmsNotification implements Notification {

    @Override
    public void send(String message) {

        System.out.println("Sending SMS");

        System.out.println("Message: " + message);
    }
}
