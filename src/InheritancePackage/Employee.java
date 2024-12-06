package InheritancePackage;

// Employee class extends Worker class to include employee-specific details
class Employee extends Worker {
    private long employeeId;
    private String hireDate;

    // Constructor to initialize Employee details
    public Employee(String name, String dob, long employeeId, String hireDate) {
        super(name, dob);  // Call Worker class constructor
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    // toString method to represent Employee details
    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();  // Call Worker class toString method
    }
}
