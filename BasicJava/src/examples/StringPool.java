package examples;

public class StringPool {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		s1 = "hi";
		String s3 = new String("Hello");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.substring(0,1));
		
		System.out.println(s1);
		System.out.println(s1.toUpperCase());
		System.out.println(s1);
		
	}

}
