package application;

import util.Util;

public class App {

	public static void main(String[] args) {
		int[][] pitagoras = new int[10][10];
		Util.populatePitagoras(pitagoras);
		Util.printPitagoras(pitagoras);
	}
}
