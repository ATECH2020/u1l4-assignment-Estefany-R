import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        /*
         *  your code goes here
         */
         double totalDesk = class1 + class2 + class3;
         double SumTotal = totalDesk/2;

         System.out.print(Math.round(SumTotal));


         
         

        // closing the scanner object
        scanner.close();
    }
}