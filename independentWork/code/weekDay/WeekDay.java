package weekDay;
import java.util.Scanner;
import java.time.DayOfWeek;

public class WeekDay {
//   Form an array that stores the names of the days of the week,
//   provided that the first The working day of the week is Monday and the last day is Sunday.
//   Redefine this array so that the first working day of the week is Sunday and the last one is Saturday.

    public static void main(String[] args) {
        Scanner week = new Scanner(System.in);
        System.out.println("Input number of day");
        int day = week.nextInt();
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        for (int i = 0; i < weekDays.length; i++) {

             if (day < 0 || day > 7){

                System.out.println("There is no such day!");

             }

           // System.out.println(weekDays[i]);
        }







    }
}
