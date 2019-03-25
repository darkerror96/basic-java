/**
 * 
 */
package serverSocket;

import java.io.IOException;

/**
 * @author rutpatel
 *
 */
public class Server {

	public static void main(String[] args) throws IOException {

		ServerThread st = new ServerThread(5000);
		st.start();
		System.out.println("Server Started at 5000 port...");
	}
}
