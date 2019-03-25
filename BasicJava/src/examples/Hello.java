/**
 * 
 */
package examples;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author rutpatel
 *
 */
public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EmployeeTemp emp = new EmployeeTemp();
		emp.setName("Test Employee");
		System.out.println(emp.getName());
		
		System.out.println(new Date().toString());
		
		SimpleDateFormat fmt = new SimpleDateFormat("MMMM dd yyyy");
		System.out.println(fmt.format(new Date()));
	}
}