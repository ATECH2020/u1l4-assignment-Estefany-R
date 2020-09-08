import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();

        int SecInHour1;
        int SecInMin1;
        int SecInSec1;
        int SecInHour2;
        int SecInMin2;
        int SecInSec2;


        /*
         *  your code goes here
         */
         SecInHour1 = hours1 * 3600;
         SecInHour2 = hours2 * 3600;
         SecInMin1 = minutes1 * 60;
         SecInMin2 = minutes2 * 60;
         SecInSec1 = seconds1 * 1;
         SecInSec2 = seconds2 * 1;

         int deltaHour = SecInHour2 - SecInHour1;
         int deltaMin = SecInMin2 - SecInMin1;
         int deltaSec = SecInSec2 - SecInSec1;

         int TotalSec = deltaHour + deltaMin + deltaSec;
         System.out.print(TotalSec);


        // closing the scanner object
        scanner.close();
    }
}