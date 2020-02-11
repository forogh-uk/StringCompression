package compression;

public class CompressionClass {
	public String compress(String s) {
		String out = "";
		int sum = 1;
		for(int i = 0; i < s.length() -1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				sum++;
			}else {
				out = out + s.charAt(i)+ sum;
				sum= 1;
			}
		}
		out = out + s.charAt(s.length() -1) + sum;
		//if out put string less that the lenght of s return out otherwise return original string
		//aabbcc = a2b2c2
		//original string abs =return abs
		return out.length() < s.length() ? out:s;
		
	}

}
