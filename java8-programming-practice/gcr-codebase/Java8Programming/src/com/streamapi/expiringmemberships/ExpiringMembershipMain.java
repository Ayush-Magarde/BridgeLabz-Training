package com.streamapi.expiringmemberships;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ExpiringMembershipMain {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        List<GymMember> members = Arrays.asList(
                new GymMember("Ayush", today.plusDays(10)),
                new GymMember("Riya", today.plusDays(45)),
                new GymMember("Rahul", today.plusDays(25)),
                new GymMember("Sneha", today.plusDays(5))
        );

        System.out.println("Memberships expiring within 30 days:");

        members.stream()
                .filter(member ->
                        member.getExpiryDate().isAfter(today) &&
                        member.getExpiryDate().isBefore(today.plusDays(30))
                )
                .forEach(System.out::println);
    }
}
