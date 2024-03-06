import java.util.Arrays;

public class Uzd2 {
    public static void main(String[] args) {
        /*Parašykite funkciją, kuri išveda visus masyvo skaičius nuo kitos pusės. T.y.
        jeigu masyvas = {5, 9, 6, 3}, tai funkcija turėtų išvesti 3 6 9 5
         */
        int[] a = {5, 9, 6,  3};
        System.out.println(Arrays.toString(a));
        isvestiMasyva(a);
        bruksniukai();
        isKitosPuses(a);
    }
    public static void isvestiMasyva(int[] masyvas) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println("masyvas[" + i + "]" + masyvas[i]);
        }
    }
    public static void isKitosPuses(int[] mas) {
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.println("mas[" + i + "]" + mas[i]);
        }
        System.out.println();
    }
    public static void bruksniukai() {
        System.out.println("---------");
    }
}
