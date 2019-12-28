package deloittecore;

public class Task {

	public static void main(String[] args) {
		String str= args[0];
		for(int i=0; i<str.length();i++)
		{
		System.out.println(str.charAt(i));
		
		}
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str.charAt(j) + " ");
			}
			System.out.println();
		}
		


		
		



		
		

	}

}
