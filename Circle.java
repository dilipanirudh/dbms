package JavaAssignment1;

public class Circle extends Shape {
	
	public Circle(){
		
	}
	

	public Circle(double radius){
		super(radius);
	}
	final double pi =3.14;
	@Override
	void area() {
		double circleArea=pi*radius*radius;
		System.out.println(circleArea);
		
	}
	public static void main(String[] args) {
		
		double z = Double.parseDouble(args[0]);

		Shape shape1 = new Circle(z);
		shape1.area();
	}
	

}
