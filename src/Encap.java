public class Encap {
    public static void main(String[] args) {


        Human h = new Human();
        h.setName("amna");
        h.setAge(23);
        System.out.println(h.getName());
        System.out.println(h.getAge());
    }
}



class Human{
    private String name;
   private  int age;

   public void setName(String name){
        this.name=name;
   }
    public int setAge(int age){
        return this.age=age;
    }

    public String getName(){
       return name;
    }
    public int getAge(){
       return age;
    }

}