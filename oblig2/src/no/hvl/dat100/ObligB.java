package no.hvl.dat100;

public class ObligB {
	// a)
	public static void skrivUt(int[][] matrise) {
		for (int[] i : matrise) {
			System.out.println();
			for (int j : i) {
				System.out.print(j + " ");
			}
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String utskrift = "";

		for (int[] i : matrise) {
			for (int j = 0; j < i.length; j++) {
				utskrift += i[j] + " ";
			}
			utskrift += "\n";
		}
		return utskrift;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		for (int[] i : matrise) {
			for (int j = 0; j < i.length; j++) {
				i[j] = i[j] * tall;
			}
		}
		return matrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean bool = true;
		for (int[] i : a) {
			for (int j = 0; j < i.length; j++) {
				if (a[j] != b[j]) {
					bool = false;
				}
			}
		}
		return bool;
	}
}
