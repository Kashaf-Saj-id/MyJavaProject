import java.util.Scanner;

public class Assessment {
    public static void main(String[] args) {

        /*  -----Wrapper classes:---
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
         */
        Integer value = (10);
        System.out.println("First value:" + value);

        //Changing value
        value = 20;
        System.out.println("New val" + value);


        String name;
        name = "Usman";
        System.out.println("First value:" + name);
        name = "Asma";

        System.out.println("Second value:" + name);


        for (int i = 0; i <= 100; i++) {
            System.out.print(i + "    ");
        }


        System.out.println("");


        int i = 0;

        while (i <= 100) {
            System.out.print(i + "   ");
            i++;
        }


        System.out.println("");


        int j = 1;

        do {
            System.out.print(j + "  ");
            j++;
        }
        while (j <= 100);

        System.out.println("");


        Scanner scanner = new Scanner(System.in);
        //  System.out.print(" Enter a number for table");
        //  String a =scanner.next();
        //  int b = Integer.parseInt(a);
        // table(b);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String rev = "";

        for (int k = input.length() - 1; k >= 0; k--) {
            rev += input.charAt(k);  //concat
        }

        System.out.println("Reversed string: " + rev);




        // Overloading
        Calcu calc = new Calcu();
        int sum1 = calc.add(1, 2, 3);
        System.out.println(sum1);
        int sum2 = calc.add(1, 2);
        System.out.println(sum2);
        int sum3 = calc.add(1, 2,6,1);
        System.out.println(sum3);

        //Overriding
        Wild s = new Sparrow();
        s.sound();


    }




    /* -----------------------Methods ------------------------------*/


    public static void table(int num) {

        for (int i = 1; i <= 10; i++) {
            int a = i * num;
            System.out.println(num + " x " + i + " = " + a);
        }
    }
}




/*  ----------------------------Classes----------------------------------*/

    class Calcu {
        public int add(int a, int b) {
            return a + b;
        }
        public int add(int a, int b, int c) {
            return a +b + c;
        }
        public int add(int a, int b, int c, int d) {
            return a + b +c +d ;
        }
    }

    class Wild {
        public void sound() {
            System.out.println("Wild Animals makes a sound");
        }
    }

    class Sparrow extends Wild {
        public void sound() {
            System.out.println("Sparrow sings");
        }
    }



