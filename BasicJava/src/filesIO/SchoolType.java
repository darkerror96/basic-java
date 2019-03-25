/**
 * 
 */
package filesIO;

/**
 * @author rutpatel
 *
 */
public class SchoolType {
	private String schoolType;

	public SchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public SchoolType(SchoolType schoolType) {
		this.schoolType = schoolType.getSchoolType();
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	@Override
	public String toString() {
		return "SchoolType [schoolType=" + schoolType + "]";
	}
}
