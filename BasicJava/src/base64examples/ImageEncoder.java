/**
 * 
 */
package base64examples;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Base64;

/**
 * @author rutpatel
 *
 */
public class ImageEncoder {

	public static void main(String[] args) {

		try {
			byte data[] = Files.readAllBytes(new File("/Users/rutpatel/Documents/Rut/Gallery/Empire-min.jpg").toPath());
			// System.out.println(new String(data));

			String imageEncoder = Base64.getMimeEncoder().encodeToString(data);

			// System.out.println(imageEncoder);

			byte[] imageDecoder = Base64.getMimeDecoder().decode(imageEncoder);

			// System.out.println(new String(imageDecoder));

			Files.write(new File("src/base64examples/image.jpeg").toPath(), imageDecoder);

			System.out.println("File Decoded and Saved as 'image.jpeg'");

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}
}
