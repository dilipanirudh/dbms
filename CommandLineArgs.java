package deloittecore;

public class CommandLineArgs {
	public static void main(String[] args)
	{
		int x =Integer.parseInt(args[0]);
		String str =args[1];
		double y=Double.parseDouble(args[2]);
		System.out.println(x +" "+ str +" "+ y);
		
	}

}
