package InheritancePackage;

// Worker class represents a basic worker with personal details
class Worker {
    private String name;
    private String dob;  // Date of birth (dd/mm/yyyy)
    protected String endDate;  // End date of employment

    // Constructor to initialize Worker details
    public Worker(String name, String dob) {
        this.name = name;
        this.dob = dob;
    }

    public Worker() {
    }

    // Method to calculate the age of the worker
    public int getAge() {
        System.out.println("Get age method");
        int cy = 2025;  // Current year
        int by = Integer.parseInt(dob.substring(6));  // Birth year from the DOB string
        return cy - by;
    }

    // Method to collect pay (can be overridden by subclasses)
    public double collectPay() {
        System.out.println("In pay collect method");
        return 0.0;
    }

    // Method to terminate the worker's employment
    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    // toString method to represent Worker details
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
