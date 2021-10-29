package java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
class Trader
{
	String name,city;

public Trader(String name, String city) {
	
	this.name = name;
	this.city = city;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Trader [name=" + name + ", city=" + city + "]";
}	
}

class Transaction{
	Trader trader;
	int year,value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	public Trader getTrader() {
		return trader;
	}
	public void setTrader(Trader trader) {
		this.trader = trader;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Transaction [trader=" + trader + ", year=" + year + ", value=" + value + "]";
	}
	
	
	
	
}

public class q4 {

	public static void main(String[] args) {
		List<Trader> list3 = new ArrayList<Trader>();
		List<Transaction> list4 = new ArrayList<>();
		list3.add(new Trader("jackkie","indore"));
		list3.add(new Trader("giant","luchnow"));
		list3.add(new Trader("sammie","indore"));
		list3.add(new Trader("watlon","luchnow"));
		list3.add(new Trader("susi","pune"));
		list3.add(new Trader("amy","delhi"));
		list3.add(new Trader("lakhan","pune"));
		list3.add(new Trader("jammer","delhi"));
		list3.add(new Trader("jacob","pune"));
		
		
		//COMMON USE DATA TO FETCH OTHERS DETAILS....
		List<Trader> datatrader=list3.stream().
				collect(Collectors.toList());
		
		
		
		System.out.println("\n=======Traders works on pune only=========");
		List<String> datatradername=datatrader.stream().
				filter((Trader)->Trader.getCity()=="pune").
				map(Trader::getName).sorted().
				collect(Collectors.toList());
		System.out.println(datatradername);
		
		
		System.out.println("\n=======Sorted name of all traders========");
		//Names of all traders sorted alphabetically
		List<String> data_all_name = datatrader.stream().
				map(Trader::getName).sorted().
				collect(Collectors.toList());
		System.out.println(data_all_name);
		
		//Traders name works on indore only
		System.out.println("\n=======Traders works on indore only=========");
		List<String> datatradername_indore=datatrader.stream().
				filter((Trader)->Trader.getCity()=="indore").
				map(Trader::getName).sorted().
				collect(Collectors.toList());
		System.out.println(datatradername_indore);


		list4.add(new Transaction (list3.get(0),2013, 23441441));
		list4.add(new Transaction (list3.get(1),2015, 3111111));
		list4.add(new Transaction (list3.get(2),2012, 123455555));
		list4.add(new Transaction (list3.get(3),2015, 6662312));
		list4.add(new Transaction (list3.get(4),2016, 666234));
		list4.add(new Transaction (list3.get(5),2011, 23441441));
		list4.add(new Transaction (list3.get(6),2019, 97453636));
		list4.add(new Transaction (list3.get(7),2012, 523425252));
		list4.add(new Transaction (list3.get(8),2011, 663424234));
		
//		System.out.println(list4);
		
		//this code is common, use for all queries,\..........
		List<Transaction> datatransaction=list4.stream().
				collect(Collectors.toList());
		System.out.println(datatransaction);
		
		
		
		//find transaction 2011...........
		System.out.println("\n Transaction occurs in 2011 year..............");
		List<Transaction> data_2012=datatransaction.stream().
				filter((Transaction)->Transaction.getYear()==2011).
				collect(Collectors.toList());
		System.out.println(data_2012);
		
		System.out.println("\n Transaction on delhi only............");
		List<Transaction> Transaction_delhi_city = datatransaction.stream().
				filter((Trader)->Trader.getTrader().getCity()=="delhi").
				collect(Collectors.toList());
		System.out.println(Transaction_delhi_city);
		

		System.out.println("\n Highest Transaction in Transaction class..............");
		Optional<Integer> data_Highest=datatransaction.stream().map(Transaction::getValue).max((t1,t2)->t1.compareTo(t2));
		System.out.println(data_Highest);
		
		System.out.println("\n Smallest Transaction in Transaction class..............");
		Optional<Integer> data_lowest=datatransaction.stream().map(Transaction::getValue).min((t1,t2)->t1.compareTo(t2));
		System.out.println(data_lowest);
	}
		
}
