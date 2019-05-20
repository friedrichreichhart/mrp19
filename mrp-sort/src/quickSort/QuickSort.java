package quickSort;

public class QuickSort {
	//
	private static int[] zahlen = {10, 4, 1, 9, 5, 8, 3, 7};
	//
	public static void main(String[] args) {
		for (int i : zahlen)
			System.out.println(i);
		//
		System.out.println("----\nsorting\n----");
		quicksort(0, zahlen.length - 1);
		//
		for (int i : zahlen)
			System.out.println(i);
	}
	//
	private static void quicksort(int links, int rechts) {
		if (links < rechts) {
			int teiler = teile(links, rechts);
			quicksort(links, teiler-1);
			quicksort(teiler+1, rechts);
		}
		
	}
	private static int teile(int links, int rechts) {
		int i = links;
		int j = rechts -1;
		int pivot = zahlen[rechts];
		//
		do {
			// Suche von links ein Element,
			// welches größer oder gleich dem Pivotelement ist
			while (i < rechts && zahlen[i] < pivot)
				i++;
			//
			// Suche von rechts ein Element,
			// welches kleiner als das Pivotelement ist
			while (j > links && zahlen[j] >= pivot)
				j--;
			//
			//
			if (i < j) {
				int temp = zahlen[i];
				zahlen[i] = zahlen[j];
				zahlen[j] = temp;
			}
		} while (i < j);
		//
		// tausche
		int temp = zahlen[i];
		zahlen[i] = zahlen[rechts];
		zahlen[rechts] = temp;
		//
		return i;
	}
}
