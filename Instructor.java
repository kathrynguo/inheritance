public class Instructor extends Person {
	
	public double salary; 
	
	public Instructor(String name, int birthYear, double salary) {
		super(name, birthYear); 
		salary = salary; 
	}
	
	public String toString() {
		return(super.toString() + "\nSalary:" + salary); 
	}
}
