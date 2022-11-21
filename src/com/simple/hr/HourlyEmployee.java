package com.simple.hr;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HourlyEmployee extends Employee{

    private int hoursWorked;

    public HourlyEmployee(String name) {
        super(name);
    }

    public HourlyEmployee(String name, int  hours) {
        super(name);
        this.hoursWorked = hours;
    }

    @Override
    public double calculatePay() {
        return this.hoursWorked * getPayRate();
    }

    @Override
    public String generatePayStub() {
        return null;
    }
}
