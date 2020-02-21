package util;

public class Util {
	public static String highlightIfEqualIndex(int i, int j, String text) {
		return (i == j) ? "[" + text + "]" : " " + text + " ";
	}

	public static String treateNumber(int number) {
		return (number < 10) ? "0" + number : String.valueOf(number);
	}
}
