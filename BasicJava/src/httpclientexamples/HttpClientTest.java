/**
 * 
 */
package httpclientexamples;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

/**
 * @author rutpatel
 *
 */
public class HttpClientTest {

	public static void main(String[] args) {

		String url = "http://www.gutenberg.org/files/221/221-0.txt";

		HttpClient httpClient = HttpClient.newHttpClient();

		try {
			HttpRequest request = HttpRequest.newBuilder(new URI(url)).build();

			httpClient.sendAsync(request, BodyHandlers.ofString()).thenApply(HttpResponse::body)
					.thenAccept(System.out::println).join();

		} catch (URISyntaxException e) {
			System.out.println(e.getMessage());
		}

	}
}
