
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * @author mechellepresnell
 * This class is for getting and validation the user's entries
 */

public class Console {
    //instantiates the scanner class
    private static final Scanner sc = new Scanner(System.in);    
    //this is used to get a string from the user and return a blank line
    public static String getString(String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }    
    //this is a simple email pattern match for validation
    //String regexPattern = "^(.+)@(\\S+)$";
    public static boolean patternMatches(String email, String regexPattern) {
    return Pattern.compile(regexPattern)
      .matcher(email)
      .matches();
    }    
//    @Test
//    public void testUsingStrictRegex() {
//        emailAddress = "username@domain.com";
//        regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
//            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
//        assertTrue(EmailValidation.patternMatches(emailAddress, regexPattern));
//    }

//   @Test
//    public void testUsingStrictRegex() {
//        emailAddress = "username@domain.com";
//        regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
//            + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
//        assertTrue(EmailValidation.patternMatches(emailAddress, regexPattern));
//    } 
}
