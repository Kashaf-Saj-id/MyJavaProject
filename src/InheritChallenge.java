public class InheritChallenge {
    public static void main(String[] args) {
    Employee e1 = new Employee("Amna", "12/12/2024", 23,"01/01/2023");
    System.out.println(e1);
    System.out.println("Age = "+ e1.getAge());
    System.out.println("Pay = "+ e1.collectPay());
    }
}


class Worker{
    private String name;
    private String dob;
    protected String endDate;

    public Worker(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public Worker() {
    }

    public int getAge(){
        System.out.println("Get age method");
        int cy =2025;
        int by = Integer.parseInt(dob.substring(6)); // dd/mm/yyyy
        return cy-by;
    }

    public double collectPay(){
        System.out.println("In pay collect method");
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}


class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    public Employee(String name, String dob, long employeeId, String hireDate) {
        super(name, dob);
        this.employeeId = employeeId;
        this.hireDate = hireDate;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }

}

class Salary extends Employee{
    double annualSalary;
    boolean isRetired;

    public Salary(String name, String dob, long employeeId, String hireDate) {
        super(name, dob, employeeId, hireDate);
    }
}