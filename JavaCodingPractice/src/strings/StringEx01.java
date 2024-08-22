package strings;

public class StringEx01 {
	
	public static void main(String[] args) {
		
		String s1 = "Java";
		String s2 = new String("Java");
		
		System.out.println(s1==s2); // false -> This will check the reference too
		System.out.println(s1.equals(s2)); // true 
		
		String s3 = "SpringBoot";
		System.out.println(s1.compareTo(s2)); // 0
		System.out.println(s1.compareTo(s3)); // -9 -> Java comes before SpringBoot
		System.out.println(s3.compareTo(s1)); // 9 -> 
		
	}

}
