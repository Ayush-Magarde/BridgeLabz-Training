package com.functionalinterface.backup;

public class BackupMain {

    public static void main(String[] args) {

        UserData user = new UserData("Ayush", "ayush@mail.com");
        String normalObject = "Just a String";

        BackupProcessor.performBackup(user);
        BackupProcessor.performBackup(normalObject);
    }
}
