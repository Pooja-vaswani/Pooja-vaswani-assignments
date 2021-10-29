package java3;

public class stringbulider {

	public static void main(String[] args) {
		StringBuilder sb1 =new StringBuilder("String Buffer");
		StringBuilder sb2 =new StringBuilder(" is a peer class of string");
		StringBuilder sb3 =new StringBuilder(" that provide much of");
		StringBuilder sb4 =new StringBuilder(" the functionality of strings");
		
		StringBuilder sba1 =new StringBuilder(sb1.append(sb2));
		StringBuilder sba2 =new StringBuilder(sba1.append(sb3));
		StringBuilder sba3 =new StringBuilder(sba2.append(sb4));
		System.out.println(sba3);
		
		StringBuilder sb5 =new StringBuilder(" it is used to specified index position");
		System.out.println(sb5.insert(14, "insert text"));
		
		StringBuilder sb6 =new StringBuilder(" the method returns a object on which it was called");
		System.out.println(sb6.reverse());
		

	}

}
