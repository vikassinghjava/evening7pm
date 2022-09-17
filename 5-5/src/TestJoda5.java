import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;
import java.util.Set;

public class TestJoda5 {
 public static void main(String[] args) {
	 	
	ZoneId zone=ZoneId.systemDefault();
	System.out.println(zone);
	
	ZoneId zone2=ZoneId.of("Asia/Calcutta");
	System.out.println(zone2);
	
	ZoneId zone3=ZoneId.of(ZoneId.systemDefault().toString());
	System.out.println(zone3);
	
	Set<String> zones=ZoneId.getAvailableZoneIds();
	for(String zon:zones) {
		ZoneId  zid=ZoneId.of(zon);
		ZonedDateTime zt=ZonedDateTime.now(zid);
		System.out.println(zt);
	}
	
	
	
 }

}
