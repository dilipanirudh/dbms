package deloittecore;

public class StringOperations {
	public static void main(String[] args)
	{
		String str1="deliotte";
		System.out.println("length"+str1.length());
		System.out.println(str1.lastIndexOf('i'));
		System.out.println(str1.charAt(4));
		System.out.println(str1.isEmpty());
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.concat("hyderabad"));
		System.out.println(str1);
		System.out.println(str1.compareTo("deLoitte"));
		System.out.println(str1.equals("deloitte"));



		
	}

}
