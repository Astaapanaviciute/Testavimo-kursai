import java.util.Arrays;

public class Uzd9 {
    public static void main(String[] args) {
        /*Sukurkite funkciją, kuri gauna masyvą. Funkcija prafiltruoja masyvą, išrenka tik
        lyginius skaičius ir grąžina naują prafiltruotą masyvą.
         */
        int[] a = {14, 6, 13, 23, 8, 9, 20};
        int[] x = tikLyginiai(a);
        System.out.println(Arrays.toString(x));
    }
    public static int[] tikLyginiai(int[] mas) {
        int kiek = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                kiek++;
            }
        }
        int[] naujasMas = new int[kiek];
        int x = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                naujasMas[x] = mas[i];
                x++;
            }
        }
        return naujasMas;
    }
}
