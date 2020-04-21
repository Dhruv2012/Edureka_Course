import java.util.regex.*;
import java.util.Scanner;  // Import the Scanner class

public class casestudy1 {
	public static boolean isValid(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input;
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter email id"); 
 		input = sc.nextLine();  
 		if (isValid(input)) 
            System.out.print("Yes it is valid email-id"); 
        else
            System.out.print("It is invalid id"); 
	}

}