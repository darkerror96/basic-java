/**
 * 
 */
package filesIO;

import java.io.Serializable;
import java.util.Date;

/**
 * @author rutpatel
 *
 */
public class Student implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private transient Date dob;
	private SchoolType schoolType;

	public Student(int id, String name, Date dob) {
		this.id = id;
		this.name = name;
		this.dob = dob;
	}

	public Student(int id, String name, Date dob, SchoolType schoolType) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.schoolType = schoolType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public SchoolType getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(SchoolType schoolType) {
		this.schoolType = schoolType;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", schoolType=" + schoolType + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		Student student = (Student) super.clone();
		SchoolType schoolType = new SchoolType(student.getSchoolType());
		student.setSchoolType(schoolType);

		return student;
	}
}
