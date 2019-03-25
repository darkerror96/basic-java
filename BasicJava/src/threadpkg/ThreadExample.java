/**
 * 
 */
package threadpkg;

/**
 * @author rutpatel
 *
 */
public class ThreadExample implements Runnable {

	@Override
	public void run() {
		System.out.println("Threads ThreadId: " + Thread.currentThread().getId());
		PrintNumber.printNumbers();
	}

	public static void main(String[] args) {

		System.out.println("Main ThreadId : " + Thread.currentThread().getId());

		for (int i = 0; i < 3; i++) {
			new Thread(new ThreadExample()).start();
		}
		PrintNumber.printNumbers();

	}
} 
