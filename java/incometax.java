import java.util.Scanner;
public class incometax {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter CTC of Employee");
		long CTC=input.nextLong();
		
		if(CTC>=500001 && CTC<=1000000) {
			System.out.println("Tax Payable: 30%");
		}else if(CTC>=300001 && CTC<=500000) {
			System.out.println("Tax Payable: 20%");
		}else if(CTC>=181001 && CTC<=300000) {
			System.out.println("Tax Payable: 10%");
		}else if(CTC>=0 && CTC<=80000) {
			System.out.println("Tax Payable: Nill");
		}else {
			System.out.println("Tax Payable:----");
		}
	}

}