
public class MyStringCompression {
	public static void main(String args[]){
		String s = "aaabbbbbbbbbbbbbbbbbbcccddds";
		String compS = stringCompression(s);
		System.out.print(compS);
		
	}
	
	public static String stringCompression(String s){//Mine is better
		int count = 1;
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<s.length()-1; i++){
			if(s.charAt(i)==s.charAt(i+1)){
				count++;
			}
			else{
				sb.append(s.charAt(i));
				sb.append(count);
				count = 1;
			}
		}
		
		sb.append(s.charAt(s.length()-1));
		sb.append(count);
		
		if(sb.length()>s.length()){
			return s;
		}
		else{
			return sb.toString();
		}
	}
}
