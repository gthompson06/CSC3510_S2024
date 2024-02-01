package InterfacesIntro;

public class Inventory {
    private String id;
    private String item;
    private int ct;
    private String warehouseID;

    public Inventory(String id, String item, int ct, String warehouseID) {
        this.id = id;
        this.item = item;
        this.ct = ct;
        this.warehouseID = warehouseID;
    }

    public String getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public int getCt() {
        return ct;
    }

    public String getWarehouseID() {
        return warehouseID;
    }
}
