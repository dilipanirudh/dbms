package deloittecore;

public class AccountApp {

	public static void main ( String[] args)
	{
		Account account = new Account();
		account.setAccountnumber(1);
		account.setBalance(222333);
		account.setName("deloitte");
		System.out.println(account.getName());
		System.out.println(account.getBalance());
		System.out.println(account.getName());
	}
}
