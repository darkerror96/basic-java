/**
 * 
 */
package serverSocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author rutpatel
 *
 */
public class ServerThread extends Thread {

	ServerSocket serverSocket;

	public ServerThread(int port) throws IOException {
		serverSocket = new ServerSocket(port);
	}

	@Override
	public void run() {

		while (true) {
			try {
				Socket sock = serverSocket.accept();
				InputStream is = sock.getInputStream();

				System.out.println(new String(is.readAllBytes()));

				sock.getOutputStream().write("Hello".getBytes());
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
