import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        convertMinutesToYearsDays();
    }

        public static void convertMinutesToYearsDays() {
            int minutesInHour = 60;
            int hoursInDay = 24;
            int daysInYear = 365;
            int minutesInYear = minutesInHour * hoursInDay * daysInYear;

            Scanner input = new Scanner((System.in));

            System.out.print("Input the number of minutes: ");

            long min = input.nextLong();

            long years = (min / minutesInYear);
            long days = (min / minutesInHour / hoursInDay) % daysInYear;

            System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
        }
    }
