/**
 * 
 */
package base64examples;

import java.util.Base64;

/**
 * @author rutpatel
 *
 */
public class Base64Test {

	public static void main(String[] args) {

		String data = "Base64 Encoder Text";
		String encodeData = Base64.getEncoder().encodeToString(data.getBytes());
		byte[] decodeData = Base64.getDecoder().decode(encodeData);

		System.out.println("Base64 Text    - " + data);

		System.out.println("Base64 Encoder - " + encodeData);

		System.out.println("Base64 Decoer  - " + new String(decodeData));
	}
}
