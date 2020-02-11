package compression;

public class StringCompression {

	public static void main(String[] args) {
		
		CompressionClass com = new CompressionClass();
		//com.compress("aaabbcc");
		
		
		System.out.println("output: " + com.compress("aaabbbbcccc"));
		System.out.println("output: " + com.compress("fffoorrgghh"));
		System.out.println("output: " + com.compress("abs"));
	}

}
