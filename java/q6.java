import java.util.function.UnaryOperator;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using unary operator....
		UnaryOperator<String> caseconversion = (String text) -> { 
			return text.toUpperCase();
			} ;
		String newText = caseconversion.apply("wanna learn  java wait for 4 months");
			    System.out.println(newText);
			    
			    
			    //by replace all() method.....

			    String s1="wanna learn  java wait for 4 months";  
			    String s2= s1.toLowerCase();
			    String s3 = s1.toUpperCase();

		    //replaces all small letter to capital   

		    String replaceString=s1.replaceAll(s2,s3);

			    System.out.println(replaceString);

	}

}