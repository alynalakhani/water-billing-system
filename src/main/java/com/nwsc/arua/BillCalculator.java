package com.nwsc.arua;

public class BillCalculator {
    public static double calculateBill(int units, double ratePerUnit) {
        return units * ratePerUnit;
    }

    public static void main(String[] args) {
        System.out.println("Water bill: UGX " + calculateBill(20, 3500));
    }
}
