public class InhTester {
	public static void main(String args[])
    {
 
        Scholar s = new Scholar("Kathryn", 2004, "AP CompSci");
        System.out.println(s.toString());
        
        Instructor i = new Instructor("Kathryn", 2004, 10000000000.0); 
        System.out.println(i.toString()); 
        
        Scholar s1 = new Scholar("Harry Potter", 1980, "Wizardry");
        System.out.println(s1.toString());
        
        Instructor i1 = new Instructor("Harry Potter", 1980, 2); 
        System.out.println(i1.toString());
    }
}
