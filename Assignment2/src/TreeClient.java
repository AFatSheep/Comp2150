import java.util.*;

public class TreeClient {

	public static void main(String[] args) {
		Random randGen = new Random();
		int random = randGen.nextInt(10) + 1;

		Tree tree = new Tree();
		tree.info();
		System.out.println("rnum = " + random);

		if (random <= 3) {
			for (int i = 1; i <= 3; i++) {
				Tree updateTree = new Tree(i); // updating tree heights for each of the Tree objects.
				updateTree.info();
				updateTree.info("Keep it growing ");
			}
		} else {
			for (int i = 1; i <= random; i++) {
				Tree updateTree = new Tree(i); // updating tree heights for each of the Tree objects.
				updateTree.info();
				updateTree.info("Keep it growing ");
			}

		}
	}
}