import java.util.Arrays;

public class uzd5 {
    public static void main(String[] args) {
        /*Parašykite funkciją, kuri suranda didžiausio masyvo elemento INDEKSĄ.*/
        double[] a = {4, 2.5, 18, -5, 17, -35, 4.0158, 3.89};
        System.out.println(Arrays.toString(a));
        System.out.println(didziausioElementoIndeksas(a));
        double[] b = {25, 12, 6, 7, 100, 48.2, 13};
        System.out.println(didziausioElementoIndeksas(b));
    }
    public static double didziausioElementoIndeksas(double[] mas) {
        double max = mas[0];
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                System.out.println("mas[" + i + "] = " + max);
            }
        }return max;

    }
}
