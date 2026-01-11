package com.day1.ambulanceroute;

public class AmbulanceRouteMain {

    public static void main(String[] args) {

        AmbulanceRoute route = new AmbulanceRoute();

        route.addUnit("Emergency", false);
        route.addUnit("Radiology", false);
        route.addUnit("Surgery", true);
        route.addUnit("ICU", false);

        route.findAvailableUnit();

        route.removeUnit("Surgery");
        route.findAvailableUnit();
    }
}
