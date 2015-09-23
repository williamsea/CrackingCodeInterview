
public class Ch1_5_StringCompression {

	private static String before = "aaaaaaaaaaaaabbccd";
	private static String after;
	public static void main(String args[]){
		after = stringCompression(before);
		System.out.println(after);
	}
	
	private static String stringCompression(String s){

		StringBuffer str = new StringBuffer();
		
		int count = 1;
		char last = s.charAt(0);
		for (int i=1; i<s.length();i++){
			if(s.charAt(i) == last){
				count++;
			}
			else{
				str.append(last);
				str.append(count);
				last = s.charAt(i);
				count = 1;
			}
		}
		
		str.append(last);//consider the last char at the end
		str.append(count);//StringBuffer able to add int count as well as char last
		//Thus no need for converting to array and convert back to string
		
		return str.toString();//need to convert back to string
	}
	
	
}
