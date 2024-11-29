public class Construct {
    public static void main(String[] args) {

        Minor min = new Minor(12345, "amir", 23.5);
        System.out.println( min.rollno);

        Minor min2 = new Minor();
        System.out.println(min2.name);
    }
}


class Minor{
     int rollno;
   String name;
   double marks;


    public Minor(int rollno, String name, double marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    public Minor(int rollno, String name){
      this (rollno, name, 23.7);
    }

    public Minor(){
        this( 12, "Atif");
    }
}
