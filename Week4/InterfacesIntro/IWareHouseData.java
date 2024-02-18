package InterfacesIntro;

import java.util.ArrayList;

public interface IWareHouseData {
    ArrayList<Inventory> getDataFromDB( ArrayList<Inventory> items );
}
