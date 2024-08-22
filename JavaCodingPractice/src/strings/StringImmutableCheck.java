package strings;

public class StringImmutableCheck {
	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "java";

		System.out.println("No modification is made");

		referenceCheck(s1, s2); // same

		s1 = s1.concat("code");
		System.out.println("s1:"+s1);

		System.out.println("After modification");

		referenceCheck(s1, s2);
		
		// Extra 
		String s3 = "Nick";
		String s4 = new String("Nick");
		System.out.print("s3 and s4 check :"); // diff
		referenceCheck(s3, s4);
//		StringBuilder builder = new StringBuilder(s3);
//		System.out.println(builder.reverse());
		System.out.println(new StringBuilder(s3).reverse());
		
		String s5 = new String("Morty");
		String s6 = new String("Morty");
		System.out.print("s5 and s6 check :");  // diff 
		referenceCheck(s5, s6);
		
		

	}

	public static void referenceCheck(Object x, Object y)
	{
	    if(x==y)
	    {
	        System.out.println("Both objects points to same reference");
	
	    }
	
	    else
	    {
	        System.out.println("Both pointing to different object");
	    }
	}
}