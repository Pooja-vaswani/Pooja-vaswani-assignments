package java9;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Fruit{  
    public static Object stream;
	int calories;  
    String name;  
    int price;  
    String colour;
    public  Fruit(int calories, String name,int price,String colour) {  
        this.calories = calories;  
        this.name = name;  
        this.price = price;  
        this.colour= colour;
    }  
    @Override
	public String toString() {
		return "fruits [name=" + name + ", colour=" + colour + "]";
	}
}  
public class q1 {  
    public static void main(String[] args) {  
        List<Fruit> FruitList = new ArrayList<Fruit>();  
        //Adding Products  
        FruitList.add(new Fruit(100,"Apple",250,"red"));  
        FruitList.add(new Fruit(120,"banana",120,"yellow"));  
        FruitList.add(new Fruit(30,"kiwi",280,"green"));  
        FruitList.add(new Fruit(80,"orange",280,"orange"));  
        FruitList.add(new Fruit(59,"pineapple",90,"yellow"));
        FruitList.add(new Fruit(70,"pomegranatte",90,"red"));
        // This is more compact approach for filtering data  
        FruitList.stream()  
                             .filter(Fruit -> Fruit.calories <= 100)  
                             .forEach(Fruit -> System.out.println(Fruit.name));   
        Map<String,String> FruitMap =   
                FruitList.stream()  
                            .collect(Collectors.toMap(p->p.name, p->p.colour));  
                  
            System.out.println(FruitMap);  
            List<Fruit> FruitList1 = FruitList.stream()
            		.filter(Fruit-> Fruit.colour.equals("red")).
            	    collect(Collectors.toList());
            System.out.println(FruitList1);
    }  
}  