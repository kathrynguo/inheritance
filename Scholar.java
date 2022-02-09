public class Scholar extends Person {
	
	public String major; 
	
	public Scholar(String name, int birthYear, String major1) {
		super(name, birthYear); 
		major = major1; 
	}
	
	public String toString() {
		return(super.toString() + "\nMajor: " + major); 
	}
}
