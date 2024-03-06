import java.util.Arrays;

public class Uzd1 {
    public static void main(String[] args) {
        /* Jei reikia skaičių masyvo ir nėra nurodyta ar int ar double, galite naudoti kurį norite.
            Parašykite funkciją, kuri suranda ir grąžina masyvo elementų sandaugą. T.y.,
            jeigu masyvas = {1, 5, 8, -5, 3}, tai rezultatas būtų 1 * 5 * 8 * (-5) * 3  = -600
         */
        int[] b = {1, 5, 8, -5, 3};
        int[] c = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(b));
        System.out.println(masyvoSandauga(b));
        System.out.println(masyvoSandauga(c));
    }
    public static int masyvoSandauga(int[] masyvas) {
        int sandauga = 1;
        for (int i = 1; i < masyvas.length; i++) {
            sandauga *= masyvas[i];
        }
        return sandauga;
    }
}
