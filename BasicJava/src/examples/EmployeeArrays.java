package examples;

public class EmployeeArrays{

	public static void main(String[] args) {

		EmployeeTemp[] empArr = new EmployeeTemp[3];
		empArr[0] = new EmployeeTemp(1, "abcd", "add1");
		empArr[1] = new EmployeeTemp(2, "defs", "add2");
		empArr[2] = new EmployeeTemp(3, "xyz", "add3");

		int maxLength = 0;

		for (EmployeeTemp e : empArr) {
			if (e.getName().length() >= maxLength) {
				maxLength = e.getName().length();
				System.out.println("Employee with longest name - " + e.getName());
			}
		}

		EmployeeTemp emp = new EmployeeTemp(empArr[0]);
		System.out.println(emp);
	}
}
