package java3;

public class stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb1 =new StringBuffer("String Buffer");
		StringBuffer sb2 =new StringBuffer(" is a peer class of string");
		StringBuffer sb3 =new StringBuffer(" that provide much of");
		StringBuffer sb4 =new StringBuffer(" the functionality of strings");
		
		StringBuffer sba1 =new StringBuffer(sb1.append(sb2));
		StringBuffer sba2 =new StringBuffer(sba1.append(sb3));
		StringBuffer sba3 =new StringBuffer(sba2.append(sb4));
		System.out.println(sba3);
		
		StringBuffer sb5 =new StringBuffer(" it is used to specified index position");
		System.out.println(sb5.insert(14, "insert text"));
		
		StringBuffer sb6 =new StringBuffer(" the method returns a object on which it was called");
		System.out.println(sb6.reverse());
		
	}

}
