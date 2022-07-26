
import java.util.ArrayList;
import java.util.Scanner;

public class EmailValidation {

    public static void main(String[] args) {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("vikas@gamil.com");
        emailID.add("dinga@abc.com");
        emailID.add("joker@yahoo.com");
        emailID.add("shreya@demo.com");
        emailID.add("ben10@mphasis.com");
        emailID.add("dinesh@abse.com");
        emailID.add("kritika@abse.com");
        
        
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter email id :");
        String email =sc.next();
        
        boolean temp = false;
        
                for(int i=0; i<emailID.size(); i++) {
                	
                	temp = emailID.contains(email);
                    
                }
                
                if(temp == true) {
                	System.out.println("Email id is : "+email + " found.");
                }
                else {
                	System.out.println("entered email not found");
                }
                
                
               
    }
}