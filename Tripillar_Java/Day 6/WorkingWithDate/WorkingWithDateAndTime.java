import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateAndTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Date : " + date);
        LocalTime time = LocalTime.now();
        System.out.println("Time : " + time);
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Date and TIme : "+dateTime);

        
        /*
        Dispaly the day of the month
        Display the day of year
        Dispaly the week Name, Month name, Month Number

        E - Name of the day : (Mon - Sun)
        D - Day of the year ( 1 - 366) - (inclding leap year)
        dd - Day of the month (1 - 31)
        M - Month Number (1-12)
        MMM - Month name - Jan to Dec
        */

        DateTimeFormatter format = DateTimeFormatter.ofPattern("D, MMM dd yyyy");
        String fomattedDateTime = dateTime.format(format);   
        System.out.println("Formatted Date: "+fomattedDateTime); 
    }
}
