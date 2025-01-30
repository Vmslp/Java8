import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalculatingAge {
	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
	
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);

		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("DD-MM-yyyy");
		String formattedDate = currentDate.format(dateFormatter);
		System.out.println(formattedDate); 
		

		DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedTime = currentDateTime.format(timeFormatter);
		System.out.println(formattedTime); 
		
		
		DayOfWeek dayOfWeek = currentDate.getDayOfWeek();
		System.out.println(dayOfWeek); 

		
		LocalDate birthDate = LocalDate.parse("2003-03-29");
		Period resultt = Period.between(birthDate, currentDate);
		System.out.println("current age is : " + resultt.getYears());
	}
}
