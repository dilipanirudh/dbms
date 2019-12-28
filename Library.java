package deloittecore;

public class Library extends Student {
	
	protected int numberofbooks;

	public Library(int regno, String stdname, String group, int numberofbooks) {
		super(regno, stdname, group);
		this.numberofbooks = numberofbooks;
	}
	
	
	

}
