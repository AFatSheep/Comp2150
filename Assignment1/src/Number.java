
public class Number {
	// Class Variable (Static Variable)
	static int num1 = 99;
	
	int num2;
	
	public Number(int num2) {
		this.num2 = num2;
		System.out.println("instance variable="+ this.num2);
	}
	public void print() {
		int localVar= 80;
		System.out.println("Local variable = " + localVar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number number = new Number(10);
		number.print();
		System.out.println("Class variable = " + Number.num1);
	}

}
