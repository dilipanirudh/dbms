package deloittecore;

public class CustomerApp {
	public static void main ( String[] args)
	{
	  Customer C=new Customer();
	 C.setCity("hyd");
	 C.setCustomerId(4);
	 C.setCustomerName("dilip");
	 System.out.println(C.getCity());
	 System.out.println(C.getCustomerName());
	 System.out.println(C.getCustomerId());
	}

}
