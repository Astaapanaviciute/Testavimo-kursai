public class Uzd2 {
    public static void main(String[] args) {
        /*Skaičiaus Klasifikavimas:
        Parašykite funkciją, kuri klasifikuoja duotą skaičių kaip teigiamą, neigiamą arba nulį*/
        System.out.println(skaiciuKlasifikacija(5));
        System.out.println(skaiciuKlasifikacija(-2));
        System.out.println(skaiciuKlasifikacija(0));
    }
    public static String skaiciuKlasifikacija(int skaicius) {
        if (skaicius > 0) {
            return "Teigiamas skaicius";
        } else if (skaicius < 0) {
            return "Neigiamas skaicius";
        }
        else {
            return "Skaicius yra 0";
        }
    }
}
