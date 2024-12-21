public class DebuggerTest {

    public static double calcAverage(int[] points) {
        double sum = 0;
        for (int p : points) {
            sum += p;
        }
        double average = sum / points.length;
        return average;
    }

    public static void main(String[] args) {
        int[] points = new int[]{80, 90, 67, 65, 50};
        double average = calcAverage(points);
        System.out.println(average);
    }
}
