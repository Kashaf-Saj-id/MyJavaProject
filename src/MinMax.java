import java.util.Scanner;

public class MinMax {

    public static void main(String[] args) {
        minimun();
    }


    public static void minimun(){
        Scanner scanner = new Scanner(System.in);
        int min =0;
        int max =0;
        int loopC =0;

        while(true){
            System.out.println(" Enter a number to find max or min OR any char to quit :  " );
            String n = scanner.nextLine();

            try{
            int charc =  Integer.parseInt (n);

            if ( loopC ==0 || charc < min){
                min = charc;
            }
            else if ( loopC == 0 || charc >max){
                max = charc;
            }
            loopC ++;
            int a = min;
            int b = max;

            }
            catch (NumberFormatException nfe){
                System.out.println("Invalid ");
                break;

            }

        }

        System.out.println(" The max value = " + max + "\n The min value : " + min);


    }


}


