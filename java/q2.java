interface order
{
	void find_order(int order_price,String order_status);
}

public class q2 {
	public static void main(String[] args) {
		
		order o = (order_price,order_status)->{
			if((order_price>10000) && (order_status=="ACCEPTED")|| order_status=="COMPLETED") {
				System.out.println(order_price +" "+order_status);
			}
		};
		o.find_order(100000, "COMPLETED");
	
	}

	}
