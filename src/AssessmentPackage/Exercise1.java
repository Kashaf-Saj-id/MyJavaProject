package AssessmentPackage;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
    Addition();
    }

    public static void Addition(){
        Scanner scanner = new Scanner(System.in);

         int count = 1;
         double sum =0;

         while (count<= 5){
             System.out.println(" Enter decimal numbers #" + count +": ");
             String num = scanner.next();
             try {double value = Double.parseDouble(num);
             count ++;
             sum = sum + value;
             }
             catch (NumberFormatException nfe){
                 System.out.println(" Invalid Number ");
             }

         }
             System.out.println(" The sum of all above 5 values entered is : " + sum);


    }
}
