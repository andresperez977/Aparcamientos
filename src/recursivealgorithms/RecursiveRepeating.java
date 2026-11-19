package recursivealgorithms;

public class RecursiveRepeating {
	public static void main(String[] args) {

		System.out.println("repeat job");
		System.out.println("repeat job");
		System.out.println("repeat job");
		System.out.println("repeat job");

		for (int i = 1; i < 5; i++) {
			System.out.println("repeat job " + i);
		}

		repeatJob(1);
	}

	private static void repeatJob(int i) {
		if (i < 5) {
			System.out.println("repeat job " + i);
			repeatJob(i + 1);
		}
	}

}
