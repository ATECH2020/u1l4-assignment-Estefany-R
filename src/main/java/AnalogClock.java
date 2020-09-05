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
         
         int newNum1 = startTime % 30;
         int finalNum = newNum1  * 12;


          System.out.println(finalNum);

        // closing the scanner object
        scanner.close();
    }
}