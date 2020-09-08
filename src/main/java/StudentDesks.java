import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2= scanner.nextInt();
        int class3 = scanner.nextInt();
        //int class2 = scanner.nextInt();
       // int class3 = scanner.nextInt();

        /*
         *  your code goes here
         */
         //double totalDesk = class1 + class2 + class3;
         //double SumTotal = totalDesk/2;

         int numDesk1 = class1 / 2 + class1 % 2;
         int numDesk2 = class2 / 2 + class2 % 2;
         int numDesk3 = class3 / 2 + class3 % 2;

         int finalNum = numDesk1 + numDesk2 + numDesk3;



         System.out.print(finalNum);


         
         

        // closing the scanner object
        scanner.close();
    }
}