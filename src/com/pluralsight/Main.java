package com.pluralsight;

import java.util.ArrayList;

public class Main
{
    static void main(String[] args)
    {
        ArrayList<Asset> allAssets = new ArrayList<Asset>();

        allAssets.add(new House("Main House", "July 2017", 650000, "123 NE ThisMyHouse St", 2, 3001, 2500 ));
        allAssets.add(new House("Vacation Home", "March 2023", 2000000, "123 SE YeahI'mLikeThat Ave.gov", 1, 4000, 2000 ));


        allAssets.add(new Vehicle("My Car", "August 2014", 20000, "Honda CRV", 2013, 120000));
        allAssets.add(new Vehicle("Tech-Bro's Tesla", "April 2025", 350, "(Bro's) Tesla", 2025, 20000));

        for(int i = 0; i < allAssets.size(); i++)
        {
            Asset asset = allAssets.get(i);
            System.out.println("------------------------");
            System.out.println();
            System.out.println(asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Purchase Price: $" + asset.getOriginalCost());
            System.out.println("Current Value:  $" + asset.getValue());
            System.out.println();
        }

    }

}

