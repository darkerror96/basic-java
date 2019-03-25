/**
 * 
 */
package streamexamples;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rutpatel
 *
 */
public class ParallelStreamTest {

	public static void main(String[] args) {

		List<EmployeeTemp> empList = new ArrayList<EmployeeTemp>();
		for (int i = 0; i < 300; i++) {
			empList.add(new EmployeeTemp("A", 20000));
			empList.add(new EmployeeTemp("B", 3000));
			empList.add(new EmployeeTemp("C", 1500));
			empList.add(new EmployeeTemp("D", 7000));
			empList.add(new EmployeeTemp("E", 200));
			empList.add(new EmployeeTemp("F", 50000));
		}

		long t1 = System.currentTimeMillis();
		System.out.println("Sequential Stream count: " + empList.stream().filter(e -> e.getSalary() > 15000).count());

		long t2 = System.currentTimeMillis();
		System.out.println("Sequential Stream Time taken: " + (t2 - t1) + " ms");

		t1 = System.currentTimeMillis();
		System.out.println(
				"Parallel Stream count: " + empList.parallelStream().filter(e -> e.getSalary() > 15000).count());
		t2 = System.currentTimeMillis();
		System.out.println("Parallel Stream Time taken: " + (t2 - t1) + " ms");
		
	}
}
