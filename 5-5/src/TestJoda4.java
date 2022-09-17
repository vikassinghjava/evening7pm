import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.Year;
import java.util.Scanner;

public class TestJoda4 {
 public static void main(String[] args) {
	 	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter year");
	int y=sc.nextInt();
	if(Year.isLeap(y)) {
		System.out.println("Leap year : "+y);
	}else {
		System.out.println("Not leap year "+y);
	}
	
 }

}
