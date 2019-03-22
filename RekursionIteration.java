package extrauppgifter;

import javax.swing.JOptionPane;

/* Uppgiften "Jämförelse mellan rekursion och iteration"
 * Jag tror att iteration går snabbast p.g.a att
 * iteration kräver inte att hela metoden startar om.
 * 
 * Resultatet visar att jag hade rätt och jag tror att
 * det var p.g.a att iterationen var längst ner i koden
 * vilket av någon anledning gör så att den blir snabbare.
 * Kom fram till detta genom att testa mig fram.
 * */
public class RekursionIteration {

	public static long rekursion(int num) {

		if (num == 1) {
			return 1;
		} else {
			return num * rekursion(num - 1);
		}
	}

	public static long iteration(int num) {

		long res = 1;
		for (int tal = num; tal > 0; tal--) {
			res *= tal;
		}
		return res;

	}

	public static void main(String[] args) {

		int num = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett tal"));

		long start = System.nanoTime();
		long rek = rekursion(num);
		long stop = System.nanoTime();

		long rektid = stop - start;

		start = System.nanoTime();
		long it = iteration(num);
		stop = System.nanoTime();

		long ittid = stop - start;

		JOptionPane.showMessageDialog(null, "Fakulteten av talet (iteration): " + it + "\nTid för iteration: " + ittid
				+ "ns\n" + "\nFakulteten av talet (rekursion): " + rek + "\nTid för rekursion: " + rektid + "ns");

	}

}
