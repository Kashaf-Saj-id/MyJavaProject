public class Inheritance {
    public static void main(String[] args) {
    Car car1 = new Car();

    System.out.println(car1.getCarModel());

    car1.setCarModel(" Honda ");
    System.out.println(car1.getCarModel());

    car1.displayCar();

    }


}


class Car {
    private String carModel = " Sazuki ";
    private String color = " Grey";
    private boolean available = true;



    public Car(){
        System.out.println(" This in default constructor");
    }


    public void displayCar() {
        System.out.println(" Car with" + carModel + "medel is " + available + " in " + color + " color");
    }

    public String getColor() {
        return color;
    }

    public boolean isAvailable() {
        return available;
    }

    public String getCarModel(){
        return carModel;
 }

 public void setCarModel(String carModel){
        this.carModel = carModel;
 }




}