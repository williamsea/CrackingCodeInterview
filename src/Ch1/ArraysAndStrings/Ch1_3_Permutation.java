package Ch1.ArraysAndStrings;

public class Ch1_3_Permutation {

	//a word only change char position of another
	//i.e. two words with the same char counts
	private static String str1 = "apple";
	private static String str2 = "elppa";
	private static String str3 = "aplpe";
	private static String str4 = "aplpee";
	
	public static void main(String args[]){
		System.out.println(permutation(str1,str1));
		System.out.println(permutation(str1,str2));
		System.out.println(permutation(str1,str3));
		System.out.println(permutation(str1,str4));
	}
	
	public static String sort(String s){
		char[] contents = s.toCharArray();
		java.util.Arrays.sort(contents);
		return new String(contents);
	}
	
	public static boolean permutation(String s, String t){
		if(s.length()!= t.length()){
			return false;
		}
		String target = sort(t);
		return sort(s).equals(target);
	}
}
