public class ListManager {
    int[] myList;

    public ListManager(int[] myList) {
        this.myList = myList;
    }
    public int getLargest() {
        int largest = myList[0];
        for( int item : myList ){
            if ( item > largest ){
                largest = item;
            }
        }
        return largest;
    }
}
