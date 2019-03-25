/**
 * 
 */
package localdatetimeexamples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * @author rutpatel
 *
 */
public class LocalDateTimeTest {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		LocalDate ld = LocalDate.now();

		System.out.println(ldt + " " + ld);

		System.out.println(ld.plusDays(20));

		ZonedDateTime zdt = ZonedDateTime.now();
		ZoneId zid = ZoneId.of("Asia/Kolkata");

		ZonedDateTime indiaDateTime = zdt.toInstant().atZone(zid);

		System.out.println(zdt + "\n" + indiaDateTime);
	}
}
