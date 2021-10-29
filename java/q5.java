import java.util.*;
public class q5 {

	String word;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List < String > wordList = Arrays.asList("Nilam","Billy","Shyam","Kirti");
		wordList.forEach((t) -> System.out.println(t));
		wordList.forEach((t) ->{
			StringBuilder sb=new StringBuilder();
			sb=sb.append(t.charAt(0));
			System.out.print(sb);
		});
		
	}

}