package deloittecore;

public class Student {
	protected int regno;
	protected String stdname;
	protected String group;
	
	public Student()
	{
		
	}
	public void display()
	{
		System.out.println("superclass");
	}

	public Student(int regno, String stdname, String group) {
		super();
		this.regno = regno;
		this.stdname = stdname;
		this.group = group;
	}
	

}
