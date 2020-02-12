import java.util.Scanner;

public class ModOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Input on non-negative digits");
		int num = input.nextInt();
		while (num > 0) {
			for (int i = 0; i < num; i++) {
				System.out.print(num % 10 + " ");
				num = num / 10;
			}
		}
	}

}
