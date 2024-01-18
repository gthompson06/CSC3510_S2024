public class RevString {
    public static void main(String[] args) {
        String myString = "HEl THere";
        String first3 = myString.substring(0,3);
        System.out.printf("first3:%s", first3);
        char c = myString.charAt(2);
        System.out.printf("Char:%s", c);
        System.out.printf("Len:%s", myString.length());
    }
}
