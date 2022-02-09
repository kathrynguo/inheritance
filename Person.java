public class Person {
	
	public String name; 
	public int birthYear; 
	
	public Person (String name, int birthYear) {
		this.name = name; 
		this.birthYear = birthYear; 
	}
	
	public String toString() {
		return("Name: " + name + "\nBirth Year: " + birthYear); 
	}
}


