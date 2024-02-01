package InClassExceptionPractice;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class Inventory {
    private String inFile;

    public Inventory(String inFile) {
        this.inFile = inFile;
    }

    public void readData() throws FileNotFoundException {
        File file = new File( inFile );
        FileInputStream stream = new FileInputStream( file );
    }
    public int getLastItem( List<Integer> inList ){
        int result = inList.get( inList.size());
        return result;
    }
    public int getLastItemV2( List<Integer> inList ){
        int result = inList.size();
        if ( result == 3 ){
            throw new NoSize3Exception( "Soory we dont allow 3 size");
        }
        result = inList.get( inList.size());
        return result;
    }


    public class NoSize3Exception extends RuntimeException {
        public NoSize3Exception(String msg) {
            super(msg);
        }
    }
}
