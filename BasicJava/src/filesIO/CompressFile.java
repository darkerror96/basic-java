/**
 * 
 */
package filesIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 * @author rutpatel
 *
 */
public class CompressFile {

	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream(new File("src/filesIO/data.txt"));
				GZIPOutputStream gos = new GZIPOutputStream(new FileOutputStream("src/filesIO/dataComp.gz"));) {

			byte[] buff = new byte[1024];
			int len;

			while ((len = fis.read(buff)) > 0) {
				gos.write(buff, 0, len);
			}

			System.out.println("File Compressed...dataComp.gz");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
