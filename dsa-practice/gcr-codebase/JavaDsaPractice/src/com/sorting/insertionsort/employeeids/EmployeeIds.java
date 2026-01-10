package com.sorting.insertionsort.employeeids;

public class EmployeeIds {

    private int[] employeeIds;

    public EmployeeIds(int[] employeeIds) {
        this.employeeIds = employeeIds;
    }

    public int[] getEmployeeIds() {
        return employeeIds;
    }

    public void displayEmployeeIds() {
        for (int id : employeeIds) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}
