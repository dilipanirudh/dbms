package deloittecore;

public class TaskTwo {
	public static void main (String[] args)
	{
		String str=args[0];
		StringBuffer buff=new StringBuffer();
	    buff.append(str);
	    buff.reverse();
	    String str1=buff.toString();
	    System.out.println(buff);
	    if(str.equals(str1))
	    {
	    	System.out.println("palindrome");
	    }
	    else
	    {
	    	System.out.println("not palindrome");
	    }
	}

}
