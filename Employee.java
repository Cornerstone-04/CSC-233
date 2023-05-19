public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    Employee(String fname, String lname, double salary) {
        this.firstName = fname;
        this.lastName = lname;
        this.monthlySalary = salary;
    }

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

    public void setMonthlySalary(double salary) {
        if (salary > 0) {
            this.monthlySalary = salary;
        }
    }

}

class employeeTest {
    public static void main(String[] args) {
        Employee workerOne = new Employee("Cornerstone", "Ephraim", 15000);
        Employee workerTwo = new Employee("Daniel", "Akintunde", 15000);

        System.out.println(workerOne.getFirstName() + " " + workerOne.getLastName() + "'s yearly salary is : "
                + workerOne.getMonthlySalary() * 12);
        System.out.println(workerTwo.getFirstName() + " " + workerTwo.getLastName() + "'s yearly salary is : "
                + workerTwo.getMonthlySalary() * 12);

        workerOne.setMonthlySalary(workerOne.getMonthlySalary() + (workerOne.getMonthlySalary() * 0.1));
        workerTwo.setMonthlySalary(workerTwo.getMonthlySalary() + (workerTwo.getMonthlySalary() * 0.1));

        System.out.println(workerOne.getFirstName() + " " + workerOne.getLastName() + "'s new yearly salary is : "
                + workerOne.getMonthlySalary() * 12);
        System.out.println(workerTwo.getFirstName() + " " + workerTwo.getLastName() + "'s new yearly salary is : "
                + workerTwo.getMonthlySalary() * 12);

    }
}