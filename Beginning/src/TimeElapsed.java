
/**
 *calculates elapsed time
 * 
 * @author (Daniel Phan) 
 * @version (8.18.16)
 */
import java.util.Scanner;
public class TimeElapsed
{
    public static void main(String[]args){
        Scanner Wilson = new Scanner(System.in);
        final int minutesInHour = 60;
        final int minutesInDay = 1440;
        System.out.print("Please enter the first time: ");
        int timeA = Wilson.nextInt();
        System.out.print("Please enter the second time: ");
        int timeB = Wilson.nextInt();
        int minuteA = timeA%100;
        int hourA = timeA/100;
        int timeAInMinute = hourA*minutesInHour+minuteA;
        int minuteB = timeB%100;
        int hourB = timeB/100;
        int timeBInMinute = hourB*minutesInHour+minuteB;
        int differenceInMinute = timeBInMinute-timeAInMinute;
        int test = (minutesInDay-differenceInMinute-1)/minutesInDay;
        int elapseInMinute = differenceInMinute+minutesInDay*test;
        int hourElapsed = elapseInMinute/minutesInHour;
        int minuteElapsed = elapseInMinute%minutesInHour;
        System.out.println(hourElapsed+" hours & "+minuteElapsed+" minutes");
    }
}


