package test;

public class EmployeeNotFoundException extends Exception {
	public EmployeeNotFoundException(){
		super("Employee not available");
	}

}
