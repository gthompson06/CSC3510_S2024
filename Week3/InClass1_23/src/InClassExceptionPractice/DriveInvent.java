package InClassExceptionPractice;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class DriveInvent {
    public static void main(String[] args)  {
        Inventory i = new Inventory("Blah.txt");

        try {
            i.readData();
        } catch (FileNotFoundException e) {
            System.out.printf("\n Wwow that was bad");
        }
        List<Integer> myList = Arrays.asList( 1, 2, 3);
//        try {
//            int res = i.getLastItem(myList);
//        } catch( ArrayIndexOutOfBoundsException aiob ){
//            System.out.printf("\n WOW out of bounds");
//        }
        try {
            int res2 = i.getLastItemV2(myList);
            System.out.printf("Get this far?");
        } catch ( InClassExceptionPractice.Inventory.NoSize3Exception e){
            System.out.printf("That was cool msg:%s", e.getMessage());
        }
    }
}
