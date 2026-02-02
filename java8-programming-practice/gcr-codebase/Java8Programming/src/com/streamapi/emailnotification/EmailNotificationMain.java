package com.streamapi.emailnotification;

import java.util.Arrays;
import java.util.List;

public class EmailNotificationMain {

    public static void main(String[] args) {

        List<String> emails = Arrays.asList(
                "user1@mail.com",
                "user2@mail.com",
                "user3@mail.com"
        );

        emails.forEach(email ->
                sendEmailNotification(email)
        );
    }

    private static void sendEmailNotification(String email) {
        System.out.println("Notification sent to: " + email);
    }
}
