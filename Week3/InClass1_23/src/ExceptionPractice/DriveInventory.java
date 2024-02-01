package ExceptionPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DriveInventory {
    public static void main(String[] args) {
        Inventory inv = new Inventory( "Blah.txt");
//        inv.readInventoryData();
        List<Integer> myList =  Arrays.asList(3, 4, 5);
//       int res = inv.getLastItem( myList );
       int res = inv.getLastItemV2( myList );
        System.out.printf("Res:%s", res);
    }
}
