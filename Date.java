public class Date {
    private int Month;
    private int Day;
    private int Year;

    Date(int month, int day, int year) {
        this.Month = month;
        this.Day = day;
        this.Year = year;
    }

    public int getMonth() {
        return this.Month;
    }

    public int getDay() {
        return this.Day;
    }

    public int Year() {
        return this.Year;
    }

    public void setMonth(int month) {
        this.Month = month;
    }

    public void setDay(int day) {
        this.Day = day;
    }

    public void setYear(int year) {
        this.Year = year;
    }

    public void displayDate() {
        System.out.println(this.Day + "/" + this.Month + "/" + this.Year);
    }
}

class DateTest {
    public static void main(String[] args) {
        Date test = new Date(24, 06, 2023);
        test.displayDate();
    }
}