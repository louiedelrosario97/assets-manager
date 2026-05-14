package com.pluralsight;

import java.time.LocalDate;

public class Vehicle extends Asset
{
    // 'Vehicle' specific properties
    String makeModel;
    int year;
    int odometer;

    // Constructor
    public Vehicle(String desription, String dateAcquired, double originalCost, String makeModel, int year, int odometer)
    {
        super(desription, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    // Getters
    public String getMakeModel() { return makeModel; }
    public int getYear() { return year; }
    public int getOdometer() { return odometer; }

    // Setters
    public void setMakeModel(String makeModel) { this.makeModel = makeModel; }
    public void setYear(int year) { this.year = year; }
    public void setOdometer(int odometer) { this.odometer = odometer; }

    // Methods
    @Override
    public double getValue()
    {
        int currentYear = LocalDate.now().getYear();
        int vehicleAge = currentYear - year;
        double calculatedValue = 0;

        // Runs the first condition that is true
        if      (vehicleAge <= 3)  { calculatedValue = getOriginalCost() - (getOriginalCost() * .03 * vehicleAge); }
        else if (vehicleAge <= 6)  { calculatedValue = getOriginalCost() - (getOriginalCost() * .06 * vehicleAge); }
        else if (vehicleAge <= 10) { calculatedValue = getOriginalCost() - (getOriginalCost() * .08 * vehicleAge); }
        else /* (10+ years) */     { calculatedValue = 1000; }

        boolean makeFilter = makeModel.contains("Honda") || makeModel.contains("Toyota");
        if (odometer > 100000 && !makeFilter) { calculatedValue = calculatedValue - (calculatedValue)  *.75; }

        return calculatedValue;
    }
}
