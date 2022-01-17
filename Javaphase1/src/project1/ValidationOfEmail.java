package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 public class ValidationOfEmail {
			
	  public static boolean isValidEmail(String email) {
			   String regex = "^(.+)@(.+)$";
			  //initialize the Pattern object
		       Pattern pattern = Pattern.compile(regex);
		       Matcher matcher = pattern.matcher(email);
		       return matcher.matches();
              }

			   public static void main(String[] args) {
			       List<String> emails = new ArrayList<String>();
			     
			       // valid email addresses
			       emails.add("sheeb@example.com");
			       emails.add("sheeb70@example.com");
			       emails.add("sheeb@example.me.org");
			     
			       
			       //invalid email addresses
			       emails.add("zeba.example.com");

			       for (String value : emails) {
			           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid\n"));
			       }
			       
			        System.out.println("\n---- Welecome To ID Verfication app------ ");

			        
			       System.out.println("  \n  Enter Any Email Address To Check:");
			       Scanner sc = new Scanner(System.in);
			       String input = sc.nextLine();
			       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
			       
			   }
			   
	}

 
 

 
 
 
