import java.util.Scanner;

public class ContactSearch {
    public static void main(String[] args) {
        String[] contacts = getContacts( );
        Boolean keepGoing = true;
        while( keepGoing ){
            String[] fields = { "First", "Last", "Email", "Quit"};
            String showFields = String.join(",", fields);
            String msg = String.format( "Enter field to Search (%s)", showFields);
            String field = getFieldFromUser( msg, fields );
            if ( field.equals("Quit")) {
                System.out.printf("\n Thank you for using our search");
                keepGoing = false;
            } else {
                msg = "Enter String to Search for->";
                String token = getItemFromUser(msg);
                System.out.printf("\n --- searching for %s in %s", token, field);
                String[] matchRecords = getMatchingContact(token, field, contacts);
                showMatchingContact(matchRecords, field, token);
            }
        }
    }
    private static String[] getMatchingContact(String token, String field, String[] contacts) {
        int loc = 0;
        String[] myList = new String[10];
        if ( field.equals("First")) loc = 0;
        else if ( field.equals("Last")) loc = 1;
        else if ( field.equals("Email")) loc = 2;
        else System.out.printf("\n IlJohnlegal input field=%s", field);
        int ct = 0;
        for( int i=0; i<contacts.length; i++){
            String[] items = contacts[i].split(";");
            if ( items[loc].toUpperCase().contains(token.toUpperCase())){
                myList[ct++] = contacts[i];
            }
        }
        return myList;
    }
    private static void showMatchingContact(String[] matchRecords, String field, String token ) {
        for (int i = 0; i < matchRecords.length; i++) {
            if ( matchRecords[i] != null ){
                String[] items = matchRecords[i].split(";");
                System.out.printf("\n First:%s Last:%s Email:%s", items[0], items[1], items[2]);
            }
        }
    }
    private static String getFieldFromUser(String msg, String[] fields) {
        boolean keepLooping = true;
        Scanner s = new Scanner(System.in);
        String tok = "";
        while( keepLooping ){
            System.out.printf("\n%s", msg);
            tok = s.next();
            if ( tok.equals('q')) return tok;
            if ( gotThisTok( tok, fields )){
                keepLooping = false;
            } else {
                System.out.printf("Sorry must be one of %s", String.join(",", fields));
            }
        }
        return tok;
    }
    private static boolean gotThisTok(String tok, String[] fields) {
        for( String item : fields ){
            if ( tok.equals(item)){
                return true;
            }
        }
        return false;
    }
    private static String getItemFromUser(String msg) {
        System.out.printf("\n%s", msg);
        Scanner s = new Scanner(System.in);
        return s.next();
    }
    private static String[] getContacts() {
        String[] contacts = {
                "Emily;Johnson; emily.johnson@email.com",
                "Alex;Turner; alex.turner@gmail.com",
                "Olivia;Martinez; olivia.martinez@aurora.edu",
                "Benjamin;Sonworth;benjamin.sonworthh@niu.edu",
                "Sophia;Johnson; sophia.davis@niu.edu",
                "John;White; jackson.white@aurora.edu",
                "Lily;Johns;lily.brown@gmail.com",
                "Noah;Aurora; noah.miller@email.com",
                "Ava;Wilson;ava.wilson@gmail.com",
                "Johns;Lataylor;liam.harriSmith@email.com",
                "Tom;Taylor;tom.taylor@niu.com",
                "Lius;Tompson;lucas.anderson@email.com"
        };
        return  contacts;
    }
}
