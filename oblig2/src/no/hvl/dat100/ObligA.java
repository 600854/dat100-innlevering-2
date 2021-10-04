package no.hvl.dat100;

public class ObligA {
	// a)
	public static void skrivUt(int[] tabell) {
		for (int i = 0; i < tabell.length; i++) {
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String utskrift = "";
		String mUtskrift = "";

		for (int i = 0; i < tabell.length; i++) {
			utskrift += tabell[i];
			if (i < tabell.length - 1) {
				utskrift += ",";
			}
		}
		mUtskrift = "[" + utskrift + "]";

		return mUtskrift;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
//			int z = 0;
//
//			for (int i = 0; i < tabell.length; i++) {
//				sum += tabell[i];
//			}
//			while (z < tabell.length) {
//				sum += tabell[z];
//				z++;
//			}
		for (int j : tabell) {
			sum += j;
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean funnet = false;
		int i = 0;

		while (!funnet && i < tabell.length) {
			if (tabell[i] == tall) {
				funnet = true;
			} else {
				i++;
			}
		}
		if (funnet) {
			return true;
		} else {
			return false;
		}
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int i = 0;
		boolean bool = false;

		while (!bool && i < tabell.length) {
			if (tabell[i] == tall) {
				bool = true;
			} else {
				i++;
			}
		}
		if (bool) {
			return i;
		} else {
			return -1;

		}
	}

	// f)
	public static int[] reverser(int[] tabell) {

		for (int i = tabell.length - 1; i >= 0; i--) {
			System.out.print(tabell[i]);
		}
		return tabell;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		int i = 1;
		boolean bool = true;

		while (bool && i < tabell.length) {
			if (tabell[i - 1] <= tabell[i]) {
				i++;
			} else {
				return false;
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int lengde = tabell1.length + tabell2.length;
		int[] nyTabell = new int[lengde];

		for (int i = 0; i < tabell1.length; i++) {
			nyTabell[i] = tabell1[i];
		}
		for (int j = 0; j < tabell2.length; j++) {
			nyTabell[tabell1.length + j] = tabell2[j];
		}
		return nyTabell;
	}
}
