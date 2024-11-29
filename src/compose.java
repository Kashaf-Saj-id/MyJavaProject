public class compose{
    public static void main(String[] args) {

        Class1 a =new Class1();
        String name = " Kashaf";
        a.setName(name);

        long phoneno = 03004563040L;
        a.setPhoneno(phoneno);

        int house = 23;
        a.getAdress().setHouse(house);

        String street = "Lane-A";
        a.getAdress().setStreet(street);

        String name1 = a.getName();
        System.out.println(name1);
        System.out.println(a.getAdress().getStreet());





    }
}

class Class1{
    private String name;
    private long phoneno;
    private Class2 adress;

    public Class1() {
        adress = new Class2();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(long phoneno) {
        this.phoneno = phoneno;
    }

    public Class2 getAdress() {
        return adress;
    }

    public void setAdress(Class2 adress) {
        this.adress = adress;
    }
}

class Class2 {
    private int house;
    private String street;

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}

