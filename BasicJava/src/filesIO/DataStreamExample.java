/**
 * 
 */
package filesIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author rutpatel
 *
 */
public class DataStreamExample {

	public static void main(String[] args) throws IOException {

		File f = new File("data.txt");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);

		dos.writeBoolean(false);
		dos.writeDouble(12.2);
		dos.writeInt(1);
		dos.writeBytes("Hello");
		dos.flush();

		System.out.println("-----Data Added-----");

		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);

		System.out.println("----Reading Data----");
		System.out.println(dis.readBoolean());
		System.out.println(dis.readDouble());
		System.out.println(dis.readInt());
		System.out.println(new String(dis.readAllBytes()));
		// System.out.println(dis.readLine());

		dos.close();
		dis.close();

	}
}
