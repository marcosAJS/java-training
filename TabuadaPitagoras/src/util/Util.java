package util;

public class Util {
	
	public static String highlightIfEqualIndex(int i, int j, String text) {
		return (i == j) ? "[" + text + "]" : " " + text + " ";
	}

	public static String treateNumber(int number) {
		return (number < 10) ? "0" + number : String.valueOf(number);
	}
	
	public static void populatePitagoras(int[][] pitagoras) {
		// populate
		for (int i = 0; i < pitagoras.length; i++) { // iterar sobre a linhas
			for (int j = 0; j < pitagoras[i].length; j++) { // iterar sobre as colunas
				pitagoras[i][j] = (i + 1) * (j + 1); // quantas vezes passa aqui? 10*10
			}
		}
	}
	
	public static void printPitagoras(int[][] pitagoras) {
		// print
		for (int i = 0; i < pitagoras.length; i++) { // linha
			String line = "";
			for (int j = 0; j < pitagoras[i].length; j++) { // coluna
				String treatedNumber = Util.treateNumber(pitagoras[i][j]);
				String highlighted = highlightIfEqualIndex(i,j, treatedNumber);
				line +=  highlighted + " ";
			}
			System.out.println(line);
		}
	}
}
