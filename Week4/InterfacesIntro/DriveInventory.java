package InterfacesIntro;

import java.util.ArrayList;

public class DriveInventory {
    public static void main(String[] args) {
        EastCoastDB eastCoastDB = new EastCoastDB();
        ArrayList<String> eastCostItems = eastCoastDB.getDataFromEasternDB();
        WestCoastDB westCoastDB = new WestCoastDB();
        ArrayList<String> westCostItems = westCoastDB.getDataWestDBData();
        // Write Some method that parses, maybe combines and standardized these data
        System.out.printf("\n Showing East Coast Report ");
        showWareHouseReportAsStrings( eastCostItems);
        System.out.printf("\n Showing West Coast Report ");
        showWareHouseReportAsStrings( westCostItems);
        // ----- Using an interface
        // ----- Using an interface
        // ----- Using an interface
        System.out.printf("\n===============");

        IWareHouseData iWest= new WestCoastDB();
         ArrayList<Inventory> items = new ArrayList<>();
        items = iWest.getDataFromDB( items);
        showWareHouseReport( items );
        System.out.printf("\n===============");
        IWareHouseData iEast = new EastCoastDB(  );
        items  = iEast.getDataFromDB( items );
        System.out.printf("\n ---- Showing All Warehouses ---- ");
        showWareHouseReport( items );
    }

    private static void showWareHouseReportAsStrings(ArrayList<String> items) {
        int ct = 0;
        for( String item : items ){
            System.out.printf("\nI:%s, item:%s", ++ct, item);
        }
    }

    private static void showWareHouseReport(ArrayList<Inventory> wareHouseData) {
        for( Inventory item : wareHouseData ){
            System.out.printf("\n Id:%s item:%s quantity:%s WareID:%s",
                    item.getId(), item.getItem(), item.getCt(), item.getWarehouseID());
        }
    }
}
