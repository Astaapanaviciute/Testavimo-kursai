import java.util.Arrays;

public class Uzd8 {
    public static void main(String[] args) {
        /*Sukurkite funkciją, kuri gauna du masyvus. Funkcija sudeda du masyvus į vieną
        ir jį grąžina. T.y., jeigu masyvas1 = {2, 5, 8}, o masyvas2 = {7, 6, 2, 9, 6}, tai
        grąžinamas masyvas turėtų būti {2, 5, 8, 7, 6, 2, 9, 6}
         */
        int[] mas1 = {2, 5, 8};
        int[] mas2 = {7, 6, 2, 9, 6};
        int[] x = new int[8];
        x[0] = 2;
        x[1] = 5;
        x[2] = 8;
        x[3] = 7;
        x[4] = 6;
        x[5] = 2;
        x[6] = 9;
        x[7] = 6;
        System.out.println(Arrays.toString(x));
    }
}
