/**
 * 
 */
package clonepkg;

import java.util.Date;

import filesIO.*;

/**
 * @author rutpatel
 *
 */
public class CloneableExample {

	public static void main(String[] args) throws CloneNotSupportedException {

		SchoolType sT = new SchoolType("Elementary");
		Student s = new Student(1, "DJ", new Date(), sT);

		Student s1 = (Student) s.clone();

		System.out.println(s);
		System.out.println(s1);

		s1.getSchoolType().setSchoolType("High School");

		System.out.println("----------Deep Clone----------");

		System.out.println(s);
		System.out.println(s1);
	}
}
