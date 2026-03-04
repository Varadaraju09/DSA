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
        */

        DateTimeFormatter format = DateTimeFormatter.ofPattern("D, MMM dd yyyy");
        String fomattedDateTime = dateTime.format(format);   
        System.out.println("Formatted Date: "+fomattedDateTime); 
    }
}