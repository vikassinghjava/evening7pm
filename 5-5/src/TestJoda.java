import java.time.LocalDate;
import java.time.LocalTime;

public class TestJoda {
 public static void main(String[] args) {
	 	
	LocalDate date=LocalDate.now();
	System.out.println(date+" Month: ");
	System.out.println(date.getMonthValue()+"/"+date.getDayOfMonth()+"/"+date.getYear()+" ");
	
	System.out.println("==================================");
	LocalTime date2=LocalTime.now();
	System.out.println(date2);
	System.out.println(date2.getHour()+" : " +date2.getMinute()+" : "+date2.getSecond());
 }

}
