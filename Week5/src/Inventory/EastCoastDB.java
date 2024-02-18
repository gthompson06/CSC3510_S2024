package Inventory;

import java.util.ArrayList;

public class EastCoastDB {
    public ArrayList<Inventory> getDataFromDB(){
        // Connect to DB
        // fetch data ... pupulate the AL
        ArrayList<Inventory> inventory = new ArrayList<Inventory>();
        inventory.add( new Inventory("E101", "Mouse", 900, "Ea01"));
        inventory.add( new Inventory("E102", "Monitor", 800, "Ea01"));
        inventory.add( new Inventory("E103", "Keyboard", 700, "Ea01"));
        inventory.add( new Inventory("E104", "Mouse Pad", 600, "Ea01"));
        return inventory;
    }
}
