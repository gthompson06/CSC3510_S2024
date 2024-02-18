package InterfacesIntro;

import java.util.ArrayList;

public class EastCoastDB implements IWareHouseData {
    public ArrayList<String> getDataFromEasternDB() {
        ArrayList<String> eastDB = new ArrayList<>();
        //String id, String item, int ct, String warehouseID
        eastDB.add( new String( "E101,Gaming Mouse, 900, Ea001"));
        eastDB.add( new String( "E102,20Inch Monitor,30,EA001"));
        eastDB.add( new String( "E103,Wireless Mouse,100, EA001"));
        eastDB.add( new String( "E104,HDMI Adapter,400,EA001"));
        return eastDB;
    }
    @Override
    public ArrayList<Inventory> getDataFromDB( ArrayList<Inventory> items) {
         //String id, String item, int ct, String warehouseID
         items.add( new Inventory( "E101", "Gaming Mouse", 900, "Ea001"));
         items.add( new Inventory( "E102", "20Inch Monitor", 30, "EA001"));
         items.add( new Inventory( "E103", "Wireless Mouse", 100, "EA001"));
         items.add( new Inventory( "E104", "HDMI Adapter", 400, "EA001"));
         return items;
    }
}
