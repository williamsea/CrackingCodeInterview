package Ch1.ArraysAndStrings;


public class Ch1_4_ReplaceSpace {

	private static String tester = "abc d e fg";
	private static String target;

	public static void main(String args[]) {
		target = replaceSpace(tester, tester.length());
		System.out.println(target);
	}

	private static String replaceSpace(String s, int length) {
		int numSpace = 0;
		char[] testerArray = tester.toCharArray();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				numSpace++;
			}
		}

		int totalLength = s.length() + 2 * numSpace;
		char[] newArray = new char[totalLength];
//		newArray[totalLength] = '\0';
		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == ' ') {
				newArray[totalLength - 1] = '0';
				newArray[totalLength - 2] = '2';
				newArray[totalLength - 3] = '%';
				totalLength -= 3;
			} else {
				newArray[totalLength - 1] = testerArray[i];
				totalLength -= 1;
			}
		}

//		String target = newArray.toString();//get meaningless char
//		String target = Arrays.toString(newArray);//get array of char seperated by ", "
		String target = String.valueOf(newArray);//the reverse of toCharArray
		return target;
	}
}
