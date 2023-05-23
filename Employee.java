public class Employee {
    // declare instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    // create class constructor
    Employee(String FIRST_NAME, String LAST_NAME, double MONTHLY_SALARY) {
        // initialise instance variables
        this.firstName = FIRST_NAME;
        this.lastName = LAST_NAME;
        this.monthlySalary = MONTHLY_SALARY;
    }

    // define getters and setters
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public void setMonthlySalary(double msalary) {
        if (monthlySalary > 0) {
            this.monthlySalary = msalary;
        }
    }

}

// create test class
class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Doe", 10000);
        Employee emp2 = new Employee("Jane", "Doe", 14000);

        // display employees annual salary
        System.out
                .println(emp1.getFirstName() + " " + emp1.getLastName() + ":" + " " + emp1.getMonthlySalary() * 12
                        + " " + "per annum");
        System.out
                .println(emp2.getFirstName() + " " + emp2.getLastName() + ":" + " " + emp2.getMonthlySalary() * 12
                        + " " + "per annum");

        // increase salaries by 10%
        emp1.setMonthlySalary(emp1.getMonthlySalary() + (emp1.getMonthlySalary() * 0.1));
        emp2.setMonthlySalary(emp2.getMonthlySalary() + (emp2.getMonthlySalary() * 0.1));

        // print new salaries
        System.out
                .println(emp1.getFirstName() + " " + emp1.getLastName() + ":" + " " + emp1.getMonthlySalary() * 12
                        + " " + "per annum" + "(10% raise)");
        System.out
                .println(emp2.getFirstName() + " " + emp2.getLastName() + ":" + " " + emp2.getMonthlySalary() * 12
                        + " " + "per annum" + "(10% raise)");
    }
}
