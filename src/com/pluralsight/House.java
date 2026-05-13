package com.pluralsight;

public class House extends Asset
{
    // 'House' specific properties
    String address;
    int condition; // (1 -excellent, 2-good, 3-fair, 4-poor)
    int squareFoot;
    int lotSize;
    // String yearBuilt

    // Constructor
    public House(String desription, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize)
    {
        super(desription, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    // Getters
    public String getAddress() { return address; }
    public int getCondition() { return condition; }
    public int getSquareFoot() { return squareFoot; }
    public int getLotSize() { return lotSize; }

    // Setters
    public void setAddress(String address) {this.address = address; }
    public void setCondition(int condition) { this.condition = condition; }
    public void setSquareFoot(int squareFoot) { this.squareFoot = squareFoot; }
    public void setLotSize(int lotSize) { this.lotSize = lotSize; }

    // Methods
    @Override
    public double getValue() // Change value getValue = sqaureFoot * (condition value)
    {
        double priceByCondition = 0;
        switch(condition)
        {
            case 1: priceByCondition = 180.00; break;
            case 2: priceByCondition = 130.00; break;
            case 3: priceByCondition = 90.00;  break;
            case 4: priceByCondition = 80.00;  break;
        }
        double sqftValue = priceByCondition * squareFoot;
        double lotSizeValue = lotSize * .25;
        return sqftValue + lotSizeValue;
    }
}

