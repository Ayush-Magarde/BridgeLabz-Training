package com.day2.callcenter;

public class CallCenterMain {

    public static void main(String[] args) {

        CallCenter center = new CallCenter();

        center.addCall("Amit", false);
        center.addCall("Riya", true);
        center.addCall("Amit", false);
        center.addCall("Neha", true);

        center.serveCall();
        center.serveCall();
        center.serveCall();

        center.displayCallCount();
    }
}
