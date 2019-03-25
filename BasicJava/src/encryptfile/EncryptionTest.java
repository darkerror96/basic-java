/**
 * 
 */
package encryptfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author rutpatel
 *
 */
public class EncryptionTest {

	public static void main(String[] args) {

		int count = 1;
		File readFile = new File("EnDecryption/secretdata.txt");
		File enFile = new File("EnDecryption/encrypteddata.txt");

		try (FileInputStream fileInputStream = new FileInputStream(readFile);
				FileOutputStream fileOutputStream = new FileOutputStream(enFile);) {
			int data = fileInputStream.read();
			while (data != (-1)) {
				if ((data + count) > 122) {
					fileOutputStream.write((data + count - 122) + 96);
				} else {
					fileOutputStream.write(data + count);
				}
				data = fileInputStream.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("File Encrypted...");
	}
}
