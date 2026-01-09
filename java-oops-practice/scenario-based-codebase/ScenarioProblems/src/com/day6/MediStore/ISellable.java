package com.day6.MediStore;

public interface ISellable {

    void sell(int quantity);
    boolean checkExpiry();
}
