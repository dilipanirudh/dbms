package deloittecore;

public class StudentExam extends Library {
	private int sub1;
	private int sub2;
	
	public StudentExam(int regno, String stdname, String group ,int sub1,int sub2,int numberofbooks) 
	{
		super(regno,stdname,group,numberofbooks);
		this.sub1=sub1;
		this.sub2=sub2;
	}
	
	public void output()
	{
		int total = sub1+sub2;
		System.out.println(regno+stdname+group+total+numberofbooks);
	}
	public void display()
	{
		System.out.println("subclass");
	}
	public static void main(String[] args) {
		Student student=new Student();
		StudentExam exam = new StudentExam(123,"asdfg","ece",50,90,5);
		/*exam.display();
		exam.output(); */
		student.display();
		student=exam;
		student.display();
		
		
		
	}
}
