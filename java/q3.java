import java.util.function.*;

//consumer class
class consumerr
{
	static void prrint(String s)
	{
		System.out.println("Hello "+ s);
	}
}
//functional class
class Functionn{  
static String show(String message){  
return"Hello "+message;
    }  
}
 public class q3  {

	public static void main(String[] args) {
		
		//consumer interface built in method accept
		Consumer<String>cs = consumerr::prrint;
		cs.accept("kriti");
		
		//function interface
		Function<String, String>fs = Functionn::show;
		System.out.println(fs.apply("Welcome to my this program"));
		
		//predicate interface
		Predicate<Integer>pr = a -> (a> 18); // Creating predicate  
	    System.out.println(pr.test(22));    // Calling Predicate method  
	
	//Supplier interface.....
	    Supplier<Double>randomValue = () ->Math.random();
// Print the random value using get()
        System.out.println(randomValue.get());
	}
}
