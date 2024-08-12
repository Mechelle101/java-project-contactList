
/**
 * @author mechellepresnell
 * This class stores the data for each contact
 * First name, Last name, email, phone
 */
public class Contact {
    private String fName;
    private String lName;
    private String email;
    private String phone;
    
    public Contact(String fName, String lName, String email, String phone) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.phone = phone;
    }
    public String getfName() {
        return fName;
    }    
    public void setßfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }   
    public void setPhone(String phone) {
        this.phone = phone;
    }   
    //i originally tried to put the getter methods in variables then 
    //concatenate variables. My mistake was "variable" so it printed variable. 
    public String displayContact() {
        String contact = "First Name:\t" + getfName() + "\n" +
                         "Last Name:\t" + getlName() + "\n" +
                         "Email:    \t" + getEmail() + "\n" +
                         "Phone:    \t" + getPhone();
        return contact;
    }
}
