import java.util.*;
public class searchElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
	     int i,search,flag=0,n=15;
	 int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	 
	 System.out.println("Enter the element to be searched");
	 search = sc.nextInt();
	    
	     
	     for(i=0;i<n;i++)
	     {
	         if(a[i]==search)
	         {
	             System.out.println("Element "+search+" found at "+i+" position");
	             flag=1;
	             break;
	         }
	     }
	     if(flag==0)
	     {
	         System.out.println("Element "+search+" not found");
	     }
	}

}