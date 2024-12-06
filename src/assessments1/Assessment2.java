package assessments1;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Assessment2 {
    private static Properties properties = new Properties();           //It is declared outside the main method so that we can acess in different methods

    public static void main(String[] args) {
        String propertiesFilePath = "src/assessments1/validation.properties";

        try (FileInputStream input = new FileInputStream(propertiesFilePath)) {
            properties.load(input);  // Load the properties
        } catch (IOException e) {
            System.out.println("Error loading properties file: " + e.getMessage());
            return;
        }

        Employee e1 = new Employee();
        Scanner scanner = new Scanner(System.in);

        int id = getValidatedInt(scanner, "Enter Your id: ");
        e1.setid(id);

        String name = getValidatedString(scanner, "Enter Your name: ");
        e1.setName(name);

        String email = getValidatedEmail(scanner, "Enter Your email: ");
        e1.setEmail(email);

        String phone = getValidatedPhone(scanner, "Enter Your phone number: ");
        e1.setPhone(phone);

        String dateOfBirth = getValidatedDateOfBirth(scanner, "Enter Your Date of Birth (dd/mm/yyyy): ");
        e1.setDob(dateOfBirth);

        double salary = getValidatedDouble(scanner, "Enter Your salary: ");
        e1.setSalary(salary);

        int houseNo = getValidatedInt(scanner, "Enter Your house no.: ");
        e1.getAddress().setHouseNo(houseNo);

        String area = getValidatedString(scanner, "Enter Your Area/Town/Society: ");
        e1.getAddress().setArea(area);

        String city = getValidatedString(scanner, "Enter Your City: ");
        e1.getAddress().setCity(city);

        String country = getValidatedString(scanner, "Enter Your Country: ");
        e1.getAddress().setCountry(country);

        // Display Employee Information
        System.out.println("Here is your complete information");
        System.out.println("Id: " + e1.getId());
        System.out.println("Name: " + e1.getName());
        System.out.println("Email: " + e1.getEmail());
        System.out.println("Phone: " + e1.getPhone());
        System.out.println("Date of Birth: " + e1.getDob());
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("Address: House no " + e1.getAddress().getHouseNo() + ", " +
                e1.getAddress().getArea() + ", " + e1.getAddress().getCity() + ", " + e1.getAddress().getCountry());
    }

    // Integer Validation
    public static int getValidatedInt(Scanner scanner, String prompt) {
        int result = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please try again!");
                continue;
            }
            try {
                result = Integer.parseInt(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
        return result;
    }

    // Double Validation
    public static double getValidatedDouble(Scanner scanner, String prompt) {
        double result = 0;
        boolean valid = false;
        while (!valid) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Input cannot be empty. Please try again!");
                continue;
            }
            try {
                result = Double.parseDouble(input);
                valid = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
        return result;
    }

    // String Validation
    public static String getValidatedString(Scanner scanner, String prompt) {
        String result = "";
        boolean valid = false;
        while (!valid) {
            System.out.println(prompt);
            result = scanner.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Input cannot be empty. Please try again!");
            } else {
                valid = true;
            }
        }
        return result;
    }

    // Email Validation
    public static String getValidatedEmail(Scanner scanner, String prompt) {
        String email = "";
        boolean valid = false;
        String emailRegex = properties.getProperty("email.regex"); // Fetch regex from properties
        while (!valid) {
            System.out.println(prompt);
            email = scanner.nextLine().trim();
            if (email.matches(emailRegex)) {
                valid = true;
            } else {
                System.out.println("Invalid email! Please ensure it matches the format specified.");
            }
        }
        return email;
    }

    // Phone Validation
    public static String getValidatedPhone(Scanner scanner, String prompt) {
        String phone = "";
        boolean valid = false;
        String phoneRegex = properties.getProperty("phone.regex"); // Fetch regex from properties
        while (!valid) {
            System.out.println(prompt);
            phone = scanner.nextLine().trim();
            if (phone.matches(phoneRegex)) {
                valid = true;
            } else {
                System.out.println("Invalid phone number! Make sure it matches the format specified.");
            }
        }
        return phone;
    }

    // DOB Validation
    public static String getValidatedDateOfBirth(Scanner scanner, String prompt) {
        String dateOfBirth = "";
        boolean valid = false;
        String dobRegex = properties.getProperty("dob.regex"); // Fetch regex from properties
        int minYear = Integer.parseInt(properties.getProperty("min.year"));
        int maxYear = Integer.parseInt(properties.getProperty("max.year"));

        while (!valid) {
            System.out.println(prompt);
            dateOfBirth = scanner.nextLine().trim();
            if (dateOfBirth.matches(dobRegex)) {
                String[] parts = dateOfBirth.split("/");            //dilimiter
                int day = Integer.parseInt(parts[0]);
                int month = Integer.parseInt(parts[1]);
                int year = Integer.parseInt(parts[2]);

                if (year < minYear || year > maxYear) {
                    System.out.println("Year must be between " + minYear + " and " + maxYear + ".");
                } else if (month < 1 || month > 12) {
                    System.out.println("Month must be between 1 and 12.");
                } else if (day < 1 || day > 31) {
                    System.out.println("Day must be between 1 and 31.");
                } else {
                    valid = true;
                }
            } else {
                System.out.println("Invalid date format. Please use dd/mm/yyyy.");
            }
        }
        return dateOfBirth;
    }
}

