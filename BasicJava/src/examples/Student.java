package examples;

import java.util.Scanner;

public class Student {

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws AgeException {

		if (age < 1 || String.valueOf(age).length() != 2 || String.valueOf(age).startsWith("0")) {
			throw new AgeException("Invalid input. Age must be a positive integer with 2 digits. Try again.");
		} else {
			this.age = age;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	public static void main(String[] args) throws AgeException {

		Student s1 = new Student();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name - ");
		String name = sc.nextLine();
		s1.setName(name);

		int age;
		while (true) {
			System.out.print("Enter Student Age - ");
			String stringAge = sc.nextLine().trim();

			try {
				age = Integer.parseInt(stringAge);
				s1.setAge(age);
			} catch (Exception e) {
				System.out.println("Invalid input. Age must be a positive integer with 2 digits. Try again.");
				continue;
			}
			break;
		}

		System.out.println(s1.toString());
		sc.close();
	}
}
