package deloittecore;

public abstract  class ClassOne {
	protected int x;
	protected int y;
	public ClassOne(int x,int y){
		this.x=x;
		this.y=y;
		
	}
	void display(){
		System.out.println("concrete method");
	}
	abstract void output();
	
	

}
