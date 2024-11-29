public class Calculator {
    public static void main(String[] args) {
    Advance2x b = new Advance2x();
    double r1 = b.add( 1,2);
    double r2 = b.subtract( 3,2);
    double r3 = b.multi( 2,3);
    double r4 = b.div ( 6,2);
    double r5 = b.power(4,2);

    System.out.println(r1);
    System.out.println(r2);
    }
}


class Basic
{
    public double  add ( int a, int b){
        return a+b;
    }
    public double subtract ( int a, int b){
        return a-b;
    }

}

class Advnace extends Basic{
    public double multi ( int a, int b){
        return a*b;
    }
    public double div (int a, int b){
        return  a/b;
    }

}


class  Advance2x extends Advnace{
    public double power (int a, int b){
        return Math.pow(a,b);
    }
}
