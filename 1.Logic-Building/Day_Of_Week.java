public class Day_Of_Week {
    public static int dayOfWeeek(int d, int m, int y) {
        int[] monthCode = {6,2,2,5,0,3,5,1,4,6,2,4};

        if(m < 3) {
            y -= 1;
        }

        int yearCode = (y % 100) + (y % 100)/4;

        yearCode = (yearCode + (y/100) / 4 + 5 * (y / 100)) % 7;

        return (d + monthCode[m-1] + yearCode) % 7;
    }
    public static void main(String[] args) {
        int day = 9 ,  month = 9, year = 2005;

        int dayOfWeeekResult = dayOfWeeek(day, month, year);

        System.out.println(dayOfWeeekResult);
    }
}
