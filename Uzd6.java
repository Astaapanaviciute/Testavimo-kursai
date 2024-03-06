import java.util.Arrays;

public class Uzd6 {
    public static void main(String[] args) {
        /*Sukurti funkciją, kuri gauna parametrą int kelintas ir int[] masyvas ir
        funkcija grąžina kelintas elementą nuo galo. T.y., jeigu kelintas = 2, tai grąžina
        priešpaskutinį masyvo elementą. Jeigu kelintas = 4, tai grąžina ketvirtą nuo galo
         */
        int[] x = {14, 7, 8, 9, 20, -5, -11, 8};
        System.out.println(Arrays.toString(x));
        System.out.println(kelintasElementasNuoGlo(2, x));
        System.out.println(kelintasElementasNuoGlo(4, x));
        System.out.println(kelintasElementasNuoGlo(1, x));
        
    }
    public static int kelintasElementasNuoGlo(int kelintas, int[] x) {
        if (kelintas <= 0 && kelintas > x.length) {
            System.out.println("Netinkamas indeksas");
            return -1;
        } else {
            return x[x.length - kelintas];
        }
    }
}
