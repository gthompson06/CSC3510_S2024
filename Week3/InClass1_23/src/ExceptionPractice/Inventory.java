package ExceptionPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    String inventoryFile;

    public Inventory(String inventoryFile) {
        this.inventoryFile = inventoryFile;
    }

    public void readInventoryData() {
        File file = new File( inventoryFile );
        try{
            FileInputStream stream = new FileInputStream(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public int getLastItem( List<Integer> inList  ) {
        int result = -1;
        try {
            result = inList.get(inList.size());
        } catch ( ArrayIndexOutOfBoundsException e ){
            System.out.printf("\n well that does not work msg=%s", e.getMessage());
        }
        return result;
    }
    public int getLastItemV2( List<Integer> inList  ) {
        int result = inList.size();
        if( result == 3){
            throw new NoSize3Exception("Sorry Array Cannot have 3 items");
        }
        return result;
    }
    public class NoSize3Exception extends RuntimeException {
        public NoSize3Exception(String message) {
            super(message);
        }
    }
}
