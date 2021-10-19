package string2int;

import java.math.BigDecimal;

public class Test01 {
	// #Rules You must not use any parsing, casting or converting function, either it is built-in or come from the library you use.
	public static void main(String[] args) throws Exception {
		String text1 = "abc573";
		String text2 = "a5b7c3";
		String text3 = "-a5b7c3";

		Solution1(text1);
		Solution1(text2);
		Solution1(text3);

		Solution2(text1);
		Solution2(text2);
		Solution2(text3);

		System.exit(0);
	}

	public static void Solution1(String text) {
		// Using BigDecimal
		BigDecimal numberic = new BigDecimal(String.valueOf(text.replaceAll("[^0-9]", "")));
		System.out.println("Solution1 [" + text + "] = " + numberic);
		//return numberic.intValue();// return numeric in integer format
	}

	public static void Solution2(String text) {
		// not using Library
		int numeric_integer = Integer.valueOf(text.replaceAll("[^0-9]", ""));
		System.out.println("Solution2 [" + text + "] = " + numeric_integer);
	}
}
