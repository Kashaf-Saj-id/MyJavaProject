import java.util.Scanner;

public class BankA {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAccNo(12345);
        ba.setAccb(11000.75);
        ba.setName(" Amna ");
        ba.setEmail( "amna@gmail.com");
        ba.setPhone(03004072002);

        System.out.println("Your balance is: " + ba.getAccb());
        ba.deposit(ba.getAccb());
        //System.out.println("Your balance is: " + ba.getAccb());
        ba.withdraw(ba.getAccb());
       // System.out.println("Your balance is: " + ba.getAccb());






        ba.getAccNo();
        ba.getAccb();
        ba.getName();
        ba.getEmail();
        ba.getPhone();




    }
}



class BankAccount{
    private int accNo;
    private double accb ;
    private String name;
    private String email;
    private long phone ;

    public static double deposit( double accb){

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the amount you want to submit");
        String balance = scanner.nextLine();
        double balance2 = Double.parseDouble(balance);
        accb = balance2+ accb;
        System.out.println( "Balance now : " + accb );
         return accb;

    }

    public static double withdraw(double accb){
        Scanner scanner = new Scanner(System.in);

        if(accb < 0){
            System.out.println(" Your balance is below limit");
            return -1;
        }

        else {
            System.out.println( " Enter amount you want to withdraw");
            String wd = scanner.nextLine();
            double wdd = Double.parseDouble(wd);
             accb = accb - wdd;
            System.out.println( "Balance now : " + accb );
            return accb;
        }

    }




   // GETTER METHODS

    public int getAccNo(){
        return accNo;
    }
    public double getAccb(){
        return accb;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public long getPhone(){
        return phone;
    }

    // SETTER METHODS

    public void setAccNo(int accNo){
        this.accNo = accNo;
    }
    public void setAccb( double accb){
        this.accb = accb;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail ( String email){
        this.email = email;
    }

    public void setPhone(long phone){
        this.phone=phone;
    }





}
