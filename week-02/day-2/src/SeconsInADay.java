/**
 * Created by User on 2017. 03. 21..
 */
public class SeconsInADay {
        public static void main(String[] args) {
            // Write a program that prints the remaining seconds (as an integer) from a
            // day if the current time is represented bt the variables

            int currentHours = 14;
            int currentMinutes = 34;
            int currentSeconds = 42;

            int remainingHours = 23 - currentHours;
            int remainingMinutes = 59 - currentMinutes;
            int remainingSeconds = 60 - currentSeconds;

            int totalRemainingSeconds = (remainingHours * 3600) + (remainingMinutes * 60) + remainingSeconds;

            System.out.println("Remaining seconds from the day: " + totalRemainingSeconds);

        }
    }