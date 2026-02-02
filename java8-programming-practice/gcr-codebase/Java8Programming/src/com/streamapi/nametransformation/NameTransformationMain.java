package com.streamapi.nametransformation;

import java.util.Arrays;
import java.util.List;

public class NameTransformationMain {

    public static void main(String[] args) {

        List<String> customerNames = Arrays.asList(
                "ayush",
                "riya",
                "rahul",
                "sneha",
                "amit"
        );

        System.out.println("Transformed customer names:");

        customerNames.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
