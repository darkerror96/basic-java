/**
 * 
 */
package filesIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;

/**
 * @author rutpatel
 *
 */
public class StudentManagement {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		HashMap<Integer, Student> std = new HashMap<Integer, Student>();

		
		
		for (int i = 1; i < 5; i++) {
			Student s = new Student(i, "Name - " + i, new Date());
			std.put(i, s);
		}

		File f = new File("student.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(std);
		oos.flush();
		oos.close();

		System.out.println("Student Data Added...");

		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);

		@SuppressWarnings("unchecked")
		HashMap<Integer, Student> student = (HashMap<Integer, Student>) ois.readObject();

		System.out.println("Student Data from File...");
		System.out.println(student);

		ois.close();
	}

}
