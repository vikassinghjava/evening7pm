import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestJoda2 {
 public static void main(String[] args) {
	 	
	LocalDateTime dt=LocalDateTime.of(1999, 05, 28, 11, 20);
	System.out.println(dt);
	System.out.println(dt.plusMonths(6));
	System.out.println(dt.minusMonths(6));
	System.out.println(dt);
 }

}
