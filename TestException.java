package test;

public class TestException {
	public static void main(String[] args) {
		int x=7;
		int y=0;
		int a[]={5,6,7,8,9,2};
		try{
			int r=x/y;
			System.out.println("result= "+r);
			System.out.println("value ="+a[4]);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e){
			e.printStackTrace();

		}
		System.out.println("success");
	}

}
