package com.hashmapsandhashfunctions.CustomHashMap;

public class CustomHashMapMain {

    public static void main(String[] args) {

        CustomHashMap map = new CustomHashMap();

        map.put(1, 10);
        map.put(2, 20);
        map.put(11, 110); // collision with key 1
        map.put(3, 30);

        System.out.println("Value for key 2: " + map.get(2));
        System.out.println("Value for key 11: " + map.get(11));

        map.remove(2);
        map.remove(5); // non-existing key

        map.display();
    }
}
