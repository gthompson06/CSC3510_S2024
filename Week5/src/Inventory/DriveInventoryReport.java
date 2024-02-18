package Inventory;

import java.util.ArrayList;

public class DriveInventoryReport {
    public static void main(String[] args) {
        EastCoastDB eastCostDB = new EastCoastDB();
        ArrayList<Inventory> eastData = eastCostDB.getDataFromDB();
        WestCoastDB westCostDB = new WestCoastDB();
        ArrayList<Inventory> westData = westCostDB.getDataFromDB();


    }
}
