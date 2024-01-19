import java.util.Scanner;public class ContactSearchHW {
    public static void main(String[] args) {
        String[] contacts = getContacts( );
        Boolean keepGoing = true;
        while( keepGoing ){
            String[] fields = { "First", "Last", "Email", "Quit"};
            String showFields = String.join(",", fields);
            String msg = String.format( "Enter field to Search (%s)", showFields);
            //ToDo: Wirte this Method
            String field = getFieldFromUser( msg, fields );
            if ( field.equals("Quit")) {
                System.out.printf("\n Thank you for using our search");
                keepGoing = false;
            } else {
                msg = "Enter String to Search for->";
                //ToDo: Wirte this Method
                String token = getItemFromUser(msg);
                System.out.printf("\n --- searching for %s in %s", token, field);
                //ToDo: Wirte this Method
                String[] matchRecords = getMatchingContact(token, field, contacts);
                //ToDo: Write this method that outputs the results
                showMatchingContact(matchRecords);
            }
        }
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
