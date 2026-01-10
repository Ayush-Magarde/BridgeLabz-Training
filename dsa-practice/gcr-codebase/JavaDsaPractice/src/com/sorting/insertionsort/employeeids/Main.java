package com.sorting.insertionsort.employeeids;

public class Main {

    public static void main(String[] args) {

        int[] idsArray = {1045, 1012, 1098, 1023, 1067};

        EmployeeIds employeeIds = new EmployeeIds(idsArray);

        System.out.println("Before Sorting:");
        employeeIds.displayEmployeeIds();

        InsertionSort.sort(employeeIds.getEmployeeIds());

        System.out.println("After Sorting:");
        employeeIds.displayEmployeeIds();
    }
}
