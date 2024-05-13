import java.util.Arrays;

public class Uzd10 {
    public static void main(String[] args) {
        /*Sukurkite funkciją, kuri gauna tris parametrus: masyvas, i1, i2. Funkcija turėtų
        sukeisti masyvo elementus vietomis, kurie yra indeksuose i1 ir i2
         */
        double[] y = {4, 2.5, 18, -5, 17, -35, 4.0158, 3.89};
        System.out.println(Arrays.toString(y));
        y [1] = 18;
        y [2] = 2.5;
        System.out.println(Arrays.toString(y));
    }
}
