package application;

import util.Util;

public class App {

	public static void main(String[] args) {
		int[][] pitagoras = new int[10][10];

		// populate
		for (int i = 0; i < pitagoras.length; i++) {
			for (int j = 0; j < pitagoras[i].length; j++) {
				pitagoras[i][j] = (i + 1) * (j + 1);
			}
		}

		// print
		for (int i = 0; i < pitagoras.length; i++) {
			String line = "";
			for (int j = 0; j < pitagoras[i].length; j++) {
				line += Util.highlightIfEqualIndex(i, j, Util.treateNumber(pitagoras[i][j])) + " ";
			}
			System.out.println(line);
		}
	}

}
