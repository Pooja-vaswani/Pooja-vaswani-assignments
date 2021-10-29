
import java.util.Scanner;
public class subjectavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 1st Subject Marks out of 100");
		int sub1=input.nextInt();
		
		System.out.println("Enter 2nd Subject Marks out of 100");
		int sub2=input.nextInt();
		
		System.out.println("Enter 3rd Subject Marks out of 100");
		int sub3=input.nextInt();
		
		if(sub1>=60 && sub2>=60 && sub3>=60) {
			System.out.println("Passed");
		}else if((sub1>=60 && sub2>=60) || (sub2>=60 && sub3>=60) || (sub1>=60 && sub3>=60)){
			System.out.println("Promoted");
		}else {
			System.out.println("Failed");
		}

	}

}