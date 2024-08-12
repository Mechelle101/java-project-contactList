
/**
 * @author mechellepresnell
 * This is project working with OOP: classes and instantiation 
 * This application uses classes to 
 * store and display contact information
 */
public class ContactListApp {
    public static void main(String[] args) {
        //Application welcome message/entry point
        System.out.println("Welcome to the Contact List application");
        System.out.println();       
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
           //calling the Console class to get first ans last names
           String fName = Console.getString("Enter first name:  ");          
           String lName = Console.getString("Enter last name:  ");           

          String email;
            do {
               email = Console.getString("Enter email: ");
              if (!Console.patternMatches(email, "^(.+)@(\\S+)$")) {
               System.out.println("Email address not valid. Please try again!");
              }
            //call the Console class to get the email  
            } while (!Console.patternMatches(email, "^(.+)@(\\S+)$"));
           //call the Console class to get the phone
           String phone = Console.getString("Enter phone:  ");
           Contact c = new Contact(fName, lName, email, phone);
           System.out.println();
           System.out.println("----------------------------------------");
           System.out.println("----- Current Contact-------------------");
           System.out.println("----------------------------------------");
           System.out.println(c.displayContact());           
           System.out.println("----------------------------------------");
           System.out.println();
           
           //calling the getString() form the console class
          choice = Console.getString("Continue? (y/n): "); 
       }        
    }    
}
