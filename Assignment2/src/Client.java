import java.util.*;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randGen = new Random();

		int random = randGen.nextInt(10) + 1;
		System.out.println("random counts = " + random);
		DropC dropC = new DropC();
		
		if (random <= 3) {
			for (int i = 1; i <= 3; i++)
				dropC.increment();

		}
		else {
			for (int i = 1; i <= random; i++)
				dropC.increment();

		}
		dropC.print();

	}

}
