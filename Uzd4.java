import java.util.Arrays;

public class Uzd4 {
    public static void main(String[] args) {
        /*Parašykite funkciją, kuri suranda mažiausio masyvo elemento reikšmę.*/

        int[] c = {6, 18, 3, 7, 89, 14, 32};

        System.out.println(Arrays.toString(c));
        System.out.println(maziausiaReiksmeMasyve(c));
    }
    public static int maziausiaReiksmeMasyve(int[] masyvas) {
        int min = masyvas[0];
        for (int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] < min) {
                min = masyvas[i];
            }
        }return min;
    }
}
