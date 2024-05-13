import java.util.Arrays;

public class Testinis {
    public static void main(String[] args) {
        double[] x = {4, 2.5, 18, -5, 17, -35, 4.0158, 3.89};
        System.out.println(Arrays.toString(x));
        System.out.println(maziausiaReiksme(x));
    }
    public static double maziausiaReiksme(double[] mas) {
        double min = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }return min;
    }
}
