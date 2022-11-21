package com.simple.hr;

public class Contractor implements Payable{

    private int hoursWorked;
    private double partsCosts;



    @Override
    public double calculatePay() {
        return this.hoursWorked; //Todo: needs implementation
    }

    @Override
    public String generatePayStub() {
        return null;
    }
}
