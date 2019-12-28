package JavaAssignment1;

public class Rectangle extends Shape{
	
	public Rectangle(){
		
	}

	public Rectangle(double length,double breadth){
		super(length,breadth);
	}

	@Override
	void area() {
		double rectangleArea = length*breadth;
		System.out.println(rectangleArea);
		
	}
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		double y = Double.parseDouble(args[1]);

		Shape shape2=new Rectangle(x,y);
		shape2.area();
	}

}
