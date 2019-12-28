package studentresult;

public class StudentResult {
	public static void main(String[] args)
	{
		int regno=1;
		int sub1=50;
		int sub2=60;
		int sub3=30;
		int sum=sub1+sub2+sub3;
		double average=sum/3;
		if(sub1<40||sub2<40||sub3<40)
		{
			System.out.println("fail");
		}
		else
		{
		System.out.println("pass");
		}
		System.out.println("sum="+sum);
		System.out.println("average="+average);
		
		
	}

}
