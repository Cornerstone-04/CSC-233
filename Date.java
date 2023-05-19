public class Date {
    // Instance Variables
    private int year;
    private int month;
    private int day;

    // Class constructor

    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // get methods for instance variables
    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public int getDay() {
        return this.day;
    }

    // set methods for instance variables
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Display date method definition

    public void displayDate() {
        System.out.println(this.day + "/" + this.month + "/" + this.year);
    }
}

class dateTest {
    public static void main(String[] args) {
        Date test = new Date(7, 6, 2004);
        test.displayDate();
        System.out.println("june is the number " + test.getMonth() + " month of the year.");
        test.setYear(2020);
        test.displayDate();
    }
}