public class Triangle{
    double L = 8.5;
    double B = 5.5;

    public static void main(String args[]){
        Triangle t = new Triangle();
        double area = t.L * t.B;
        System.out.println(area);
    }
}