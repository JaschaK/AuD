package teilleistung1.aufgabe2;

public class Arrays {
	static Arrays array = new Arrays();
	/**
	 * Vertauscht zwei Elemente in einem Array (vgl. Aufgabenstellung).
	 * 
	 * @param x Das Array.
	 * @param i Position 1.
	 * @param j Position 2.
	 */

	public void swap (int[] x, int i, int j) {
		//TODO Hier bitte implementieren
		for(int counter=0;counter<x.length;counter++){
			System.out.println("Element "+counter+" ist "+x[counter]);
		}
		int swap = x[i]; //swap zum zwischenspeichern
		x[i] = x[j]; 
		x[j] = swap;
		System.out.println("Element "+i+" und "+j+" wurden vertauscht.");
		for(int counter=0;counter<x.length;counter++){
			System.out.println("Element "+counter+" ist "+x[counter]);
		}
	}
	
	/**
	 * Diese Methode kehrt die Reihenfolge der Elemente in einem Array um
	 * 
	 * @param x Das Array.
	 */
	public void sort(int[] x){
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x.length;j++) {
				if (x[i]<x[j]) {
				array.swap(x, i, j);
				}
			}
		}
		//TODO Hier bitte implementieren
		
	}
	
	/**
	 * Main Methode zum Testen der Methoden
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO hier bitte die Methoden testen
//		Testen von swap
		System.out.println("Versuch1:");
		int[] test1 = new int[5];
		for(int i=0;i<5;i++){
			test1[i] = i+1;
		}
		int i1 = 1;
		int j1 = 3;
		array.swap(test1, i1, j1);
		array.swap(test1, i1, j1);
		System.out.println("Versuch2:");
		int[] test2 = new int[5];
		for(int i2=0;i2<5;i2++){
			test2[i2] = 5-i2;
		}
		int i2 = 1;
		int j2 = 3;
		array.swap(test2, i2, j2);
//		Testen von sort
		int[] test3 = new int[10];
		test3[0] = 5;
		test3[1] = 9;
		test3[2] = 2;
		test3[3] = 10;
		test3[4] = 4;
		test3[5] = 1;
		test3[6] = 7;
		test3[7] = 6;
		test3[8] = 8;
		test3[9] = 3;
		System.out.println("Vorher:");
		for(int i = 0; i<test3.length;i++){
			System.out.println("Element "+i+": "+test3[i]);
		}
		array.sort(test3);
		System.out.println("Nachher:");
		for(int i = 0; i<test3.length;i++){
			System.out.println("Element "+i+": "+test3[i]);
		}
	}

}
