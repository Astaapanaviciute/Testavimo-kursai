public class Uzd7 {
    public static void main(String[] args) {
        /*Sukurkite funkciją, kuri suranda masyvo vidurkį.*/
        double[] y = {3, 5, 2, 4, 6};
        System.out.println(masyvoVidurkis(y));
        double[] x = {4, 2.5, 18, -5, 17, -35, 4.0158, 3.89};
        System.out.println(masyvoVidurkis(x));
        double[] a = {3, 5, 16, 85, 74, 12, 36, 4, 18, 1};
        System.out.println(masyvoVidurkis(a));
    }
    public static double masyvoVidurkis(double[] mas) {
        double suma = 0;
        double v = 0;
        for (int i = 0; i < mas.length; i++) {
            suma += mas[i];
            v = suma / mas.length;
        }
        return v;
    }
    
}
