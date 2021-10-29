import java.util.*;

public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("Hello", " 000");
		map.put("Hii", " 007");
		
		for(Map.Entry m: map.entrySet())
		{
			/*String result = String.format(m.getKey() + "" +m.getValue());
			System.out.println(result);*/
			
			StringBuilder result = new StringBuilder(m.getKey() + " " +m.getValue());
			System.out.println(result);	
		}
		    
	}

}