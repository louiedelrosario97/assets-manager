package com.pluralsight;

public class Asset
{
    // Properties
    String description;
    String dateAcquired;
    double originalCost;

    // Constructor
    public Asset(String desription, String dateAcquired, double originalCost)
    {
        this.description = desription;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    // Getters
    public String getDescription() { return description; }
    public String getDateAcquired() { return dateAcquired; }
    public double getOriginalCost() { return originalCost; }

    // Setters
    public void setDescription(String description) { this.description = description; }
    public void setDateAcquired(String dateAcquired) { this.dateAcquired = dateAcquired; }
    public void setOriginalCost(double originalCost) { this.originalCost = originalCost; }

    // Methods
    public double getValue() { return originalCost; }
}



