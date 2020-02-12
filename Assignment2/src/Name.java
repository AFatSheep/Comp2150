import java.util.Scanner;
public class Name {
	private String firstName;
	private char middleName;
	private String lastName;
	
	
	//	Create a constructor that accepts First name, Middle Initial, and Last name as
	//	 parameters and initialize the object’s state according to the parameters
	Name(String firstName, char middleName, String lastName) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	//	Create a method to get the name in the normal order of 
	public String normalName() {
		System.out.println("Now printing from normal order method.");
		return firstName + " " + middleName + " " + lastName;
	}
	//	Create another method to get the name in a reverse order 
	public String reverseName() {
		System.out.println("Now printing from reverse order method.");
		return lastName + " " + middleName + " " + firstName;
	}

	//	Add a toString( ) method to the person class to display the attributes.
	public String toString() {
		return "First name: " + firstName+ ", Middle name: " + middleName + ", Last Name " + lastName;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Reads inputs (first name, middle name initial, and last name) from the keyboard
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter first Name");
		String firstName =input.next();
		System.out.println("Enter middle initial");
		char middleName = input.next().charAt(0); // charAt(0) for first character in "String"
		System.out.println("Enter last name");
		String lastName = input.next();
		
		Name yourName = new Name(firstName, middleName, lastName);
		System.out.println(yourName.normalName());
		System.out.println(yourName.reverseName());
		System.out.println(yourName.toString());
	}

}
