public class Rock {
	static int count = 0;

	Rock() { // This is the constructor
		System.out.print("Rock ");
		count++;
	}

	Rock(int i) {
		this();
		System.out.print("Rock " + i + " ");
		count++;
	}
}
