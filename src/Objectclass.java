public class Objectclass extends Object{


    public static void main(String[] args) {
 Stud s1 = new Stud("Amir", 27);
 System.out.println(s1);

 PrimarySchool ps1 = new PrimarySchool(" Anza", 12, "Abid");
 System.out.println(ps1);

    }
}




class Stud{
    private String name;
    private int age;

    Stud(String name, int age){
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
     return name + " is " + age;
//        "Stud{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}




class PrimarySchool extends Stud{
  private String parentName;

    public PrimarySchool(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return super.toString() +
                " has parent  " + parentName;
    }
}