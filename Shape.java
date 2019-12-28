package JavaAssignment1;

public abstract class Shape {
	
	protected double length;
	protected double breadth;
	protected double radius;
	
	public Shape(){
		
	}

	public Shape(double length, double breadth) {  
		super();
		this.length = length;
		this.breadth = breadth;
		
	}
	public Shape(double radius){
		super();
		this.radius=radius;
	}
	abstract void area(); //abstract method

}
