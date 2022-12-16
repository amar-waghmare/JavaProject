package generalPrograms;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeExample1 {

	 public static void main(String[] args) 
	 {    
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now(); 
		   String local_dateAndTime = dtf.format(now);
		   System.out.println(local_dateAndTime);  
	}    
}
