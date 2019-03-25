package examples;

import java.util.Scanner;

public class IntExceptionBlock {

//	static {
//		System.out.println("Static Block before PSVM");
//		System.out.println(System.getProperty("os.name"));
//	}
//
//	{
//		int a = 20;
//		System.out.println("Non Static Block - " + a);
//	}

	public static void main(String[] args) {

		// IntException ie = new IntException();
		int data = 0;
		System.out.print("Enter data - ");
		Scanner sc = new Scanner(System.in);

		try {
			data = sc.nextInt();
		} catch (Exception e) {
			sc.next();

			boolean flag = false;

			do {
				System.out.print("(Exception Thrown) Enter data again - ");
				try {
					flag = false;
					data = sc.nextInt();
				} catch (Exception e1) {
					flag = true;
					sc.next();
				}
			} while (flag);

		} 
			sc.close();
			System.out.println("Continued...(" + data + ")");
		
	}
}
