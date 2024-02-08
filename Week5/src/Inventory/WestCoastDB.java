package Inventory;

import java.util.ArrayList;

public class WestCoastDB {
    public ArrayList<Inventory> getDataFromDB(){
        // Connect to DB
        // fetch data ... pupulate the AL
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();
        inventory.add( new Inventory("W101", "Mouse", 900, "We01"));
        inventory.add( new Inventory("W102", "Monitor", 800, "We01"));
        inventory.add( new Inventory("W103", "Keyboard", 700, "We01"));
        return inventory;
    }
}
