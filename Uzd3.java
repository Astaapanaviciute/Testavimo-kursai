import java.util.Arrays;

public class Uzd3 {
    public static void main(String[] args) {
        /*Parašykite funkciją, kuri pakeičia masyvo elemento reikšmę.
        Funkciija gauna int indeksas, int[] masyvas ir int reiksme  parametrus
        ir pakeičia to masyvo elementą, kurio indeksas yra indeksas reikšmę į reiksme.
        Pvz. jeigu indeksas = 3, masyvas = {1, 7, 8, 6, 9, 5}, o reiksme = 25. Tai
        turėtumėte pakeisti masyvo elementą taip, kad masyvas dabar būtų
        masyvas = {1, 7, 8, 25, 9, 5}. P.S. masyvo grąžinti nereikia, užtenka tik pakeisti,
        t.y. funkcija turėtų būti void, masyvas pasikeis main dalyje, jei panaudosite funkciją.
         */
        int[] a = {1, 7, 8, 25, 9, 5};
        a [3] = 25;
        System.out.println(Arrays.toString(a));
    }

}
