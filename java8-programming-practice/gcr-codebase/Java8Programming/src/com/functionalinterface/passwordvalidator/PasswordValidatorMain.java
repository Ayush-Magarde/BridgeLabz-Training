package com.functionalinterface.passwordvalidator;

public class PasswordValidatorMain {

    public static void main(String[] args) {

        String password = "Admin@123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
    }
}
