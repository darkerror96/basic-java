/**
 * 
 */
package lambdaExamples;

import java.util.Comparator;

/**
 * @author rutpatel
 *
 */
@FunctionalInterface
public interface SortArray<E> {

	E[] sortOperation(E[] data, Comparator<E> comparator);
}
