import java.util.*;

public class RockClient {
	public static void main (String[]args) {
		Random randGen = new Random();

		int random = randGen.nextInt(10) + 1;
		System.out.println("rnum = " + random);
		
		if (random <= 3) {
			for (int i = 1; i <= 3; i++)
				new Rock();

		}
		else {
			for (int i = 1; i <= random; i++)
				new Rock(i);
		}
		System.out.println();
        System.out.println("Number of Rocks objects created = " + Rock.count);

	}
}
