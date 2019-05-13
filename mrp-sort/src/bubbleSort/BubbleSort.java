package bubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] zahlen = { 4, 6, 1, 9, 2, 100 };
		//
		for (int i : zahlen)
			System.out.println(i);
		//
		System.out.println("---");
		//
		for (int n = zahlen.length; n > 1; n--) {
			for (int i = 0; i < n - 1; i++) {
				if (zahlen[i] > zahlen[i + 1]) {
					// tauschen;
					int temp = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = temp;
				}
			}
		}
		//
		for (int i : zahlen)
			System.out.println(i);
		//

	}

}
