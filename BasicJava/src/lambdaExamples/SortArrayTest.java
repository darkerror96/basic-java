/**
 * 
 */
package lambdaExamples;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author rutpatel
 *
 */
public class SortArrayTest {

	public static void main(String[] args) {

		Comparator<Integer> fC = new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			};
		};

		SortArray<Integer> sortNo = (a, b) -> {
			Arrays.sort(a, b);
			return a;
		};

		Integer dataNo[] = { 200, 3, 50, 12 };
		System.out.println(Arrays.toString(sortNo.sortOperation(dataNo, fC)));

		SortArray<String> sortString = (a, b) -> {
			Arrays.sort(a, b);
			return a;
		};

		String dataString[] = { "world", "I", "am", "waiting" };
		System.out.println(Arrays.toString(sortString.sortOperation(dataString, null)));
	}
}
