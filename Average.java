// public class Average {
//     public static void main(String[] args) {
//         System.out.println((10.5 + 11.6 + 12.7 + 13.8) / 4);
//     }
// }

public class Average {
    public static void main(String[] args) {
        double[] values = { 10.5, 11.6, 12.7, 13.8 };
        double sum = 0;

        for (double value : values) {
            sum += value;
        }

        double average = sum / values.length;

        System.out.println(average);
    }
}