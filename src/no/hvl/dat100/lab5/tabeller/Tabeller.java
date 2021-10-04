package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		System.out.print("[ ");

		for (int i = 0; i < tabell.length; i++) {

			System.out.print(tabell[i] + ",");

		}

		System.out.print("]");

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String startStr = "[";
		for (int i = 0; i < tabell.length; i++) {
			if (i == 0) {
				startStr += tabell[i];
			} else {
				startStr += "," + tabell[i];
			}
		}
		startStr += "]";
		return startStr;
	}

	// c)
	public static int summer(int[] tabell) {
////
		int sum = 0;
//		for(int i = 0; i<tabell.length;i++) {
//			sum += tabell[i];
//		}
//		for(int h:tabell) {
//			sum += h;
//		}
		int teller = 0;
		while (teller < tabell.length) {
			sum += tabell[teller];
			teller++;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int x;
		for (x = 0; x < tabell.length; x++) {
			if (tall == tabell[x]) {

				return true;
			}
		}
		return false;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int a = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return a;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] x = new int[tabell.length];
		int y = x.length - 1;
		for (int i = 0; i < tabell.length; i++, y--) {
			x[i] = tabell[y];
		}
		return x;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int x = 0;
		for (int i = 0; i < tabell.length; i++) {
			if (i == 0) {
				x = tabell[i];
			}else {
				if (Math.min(x, tabell[i]) == tabell[i]) {
					return false;
				}
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] retur = new int[tabell1.length + tabell2.length];
		int teller = 0;
		for (; teller < tabell1.length; teller++) {
			retur[teller] = tabell1[teller];
		}
		for (int i = 0; i < tabell2.length; i++) {
			retur[i + teller] = tabell2[i];

		}
		return retur;
	}
}
