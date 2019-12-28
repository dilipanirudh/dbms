package deloittecore;

public class Account1App {
	public static void main (String[] args)
	{
		Account1 a =new Account1(1111,"dilip",22222);
		Account1 b=new Account1(2222,"anirudh",33333);
		Account1 c=new Account1();
		System.out.println(a.getAccountNumber()+" "+a.getBalance()+" "+a.getCustomerName());
		System.out.println(b.getAccountNumber()+" "+b.getBalance()+" "+b.getCustomerName());
		System.out.println(c.getAccountNumber()+" "+c.getBalance()+" "+c.getCustomerName());
	}

}
