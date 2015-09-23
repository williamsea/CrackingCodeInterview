package Ch1.ArraysAndStrings;
public class Ch1_2_CheckAllUniqueCharacters {

	private static boolean result1 = false;
	private static boolean result2 = false;
	private static String str = "abcdee";

	public static void main(String args[]) {
		// System.out.println("Hello world!");
		result2 = isUniqueChars2(str);
		result1 = isUniqueChars1(str);
		System.out.println("method 1: " + result1);
		System.out.println("method 2: " + result2);
	}

	public static boolean isUniqueChars2(String str) {
		if (str.length() > 256)
			return false;

		boolean[] char_set = new boolean[256];// default each element is false
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);// the value of each character in int: a ->
									// 97
			// char charval = str.charAt(i);//the value of each character in
			// char
			if (char_set[val]) {// if the char appeared before, char_set[97] =
								// true, go in if-statement
				return false;
			}
			char_set[val] = true;// the first time the char appear, make the
									// boolean of corresponding int true:
									// char_set[97] = true
		}
		return true;
	}

	public static boolean isUniqueChars1(String str) {

		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			int temp = 1<<val;
//			if( (checker & (1<<val)) > 0){// << is left shift by val bits, mean multiply by 2^val
			if( (checker & temp) > 0){//compare in binary mode. 
//				checker temp
//				0		1
//				1		2
//				3		4
//				7		8
//				15		16 all true since (checker & temp) = 0
//				...
//				Or
//				7		4 false (checker & temp) > 0
//				Or
//				31		16 false
				return false;
			}
//			checker |= (1<<val);
			checker |= temp;
		}
		return true;
	}

}
