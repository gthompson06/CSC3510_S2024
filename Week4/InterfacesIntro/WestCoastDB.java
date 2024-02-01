package InterfacesIntro;

import java.util.ArrayList;

public class WestCoastDB implements IWareHouseData {
    public ArrayList<String> getDataWestDBData() {
         ArrayList<String> westDB = new ArrayList<>();
         //String id, String item, int ct, String warehouseID
         westDB.add( new String ( "W101, Gaming Desktop, 200, WH001"));
         westDB.add( new String( "W102,Workstation PC,20,WH001"));
         westDB.add( new String( "W103,Ultrabook Laptop, 100, WH001"));
         westDB.add( new String( "W105,Desktop Tower, 400, WH001"));
         return westDB;
    }

    @Override
    public ArrayList<Inventory> getDataFromDB( ArrayList<Inventory> items) {
        items.add( new Inventory( "W101", "Gaming Desktop", 200, "WH001"));
        items.add( new Inventory( "W102", "Workstation PC", 20, "WH001"));
        items.add( new Inventory( "W103", "Ultrabook Laptop", 100, "WH001"));
        items.add( new Inventory( "W105", "Desktop Tower", 400, "WH001"));
        return items;
    }
}
