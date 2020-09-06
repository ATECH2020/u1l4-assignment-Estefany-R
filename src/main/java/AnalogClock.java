import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
         int startTime = scanner.nextInt();

        /*
         *  your code goes here
         */
         //int hour = startTime / 30;
         //int pastd = hour * 30;
         int minPast = startTime * 2;
         int finalDegree = (minPast % 60) * 6;

         System.out.print(finalDegree);

        // closing the scanner object
        scanner.close();
    }
}