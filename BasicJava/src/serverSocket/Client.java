/**
 * 
 */
package serverSocket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author rutpatel
 *
 */
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {

		Socket client = new Socket("localhost", 5000);
		System.out.println("Client " + client);
		client.getOutputStream().write("Hello from Client".getBytes());
		client.close();
	}
}
