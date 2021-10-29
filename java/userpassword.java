
import java.util.Scanner;

public class userpassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="shikha";
		String password="abcdef";
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter username");
		String inputUsername = input.next();
		
		System.out.println("Enter password");
		String inputPassword = input.next();
		
		if((inputUsername.equals(userName)) && (inputPassword.equals(password))) {
	        System.out.println("You are now logged in"); 
		}else {
		int count = 0;
		while (count <= 2) {            

		    if ((!inputUsername.equals(userName)) || (!inputPassword.equals(password))) {       
		        System.out.println("Wrong entry. try again");
		        System.out.println("Enter username");
		        inputUsername = input.next();

		        System.out.println("Enter password");
		        inputPassword = input.next();
		    }     

		    count++;

		}

		if (count > 2)
		 System.out.println("You have entered wrong three times. Please Contact Admin");
		 System.exit(0);
		}

	}

}