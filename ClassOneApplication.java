package deloittecore;

public class ClassOneApplication extends ClassOne {
	public ClassOneApplication(int x, int y){
		super(x,y);
	}


	@Override
	void output() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		ClassOne one=new ClassOneApplication(5,6);
				one.output();
		
	}

}
