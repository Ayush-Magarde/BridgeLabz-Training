package com.day10.hospitalavl;

public class HospitalMain {

    public static void main(String[] args) {

        HospitalAVL avl = new HospitalAVL();

        avl.root = avl.insert(avl.root, 10, "Patient A");
        avl.root = avl.insert(avl.root, 5, "Patient B");
        avl.root = avl.insert(avl.root, 20, "Patient C");

        System.out.println("Patients by Arrival Time:");
        avl.inorder(avl.root);
    }
}
