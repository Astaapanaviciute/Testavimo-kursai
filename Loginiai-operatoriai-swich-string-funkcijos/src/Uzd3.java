public class Uzd3 {
    public static void main(String[] args) {
        /*Mėnesio Pavadinimas:
        Parašykite funkciją, kuri priima skaičių (1-12) kaip įvestį ir spausdina atitinkamą mėnesio pavadinimą.*/
        System.out.println(menesioPavadinimas(1));
        System.out.println(menesioPavadinimas(6));
        System.out.println(menesioPavadinimas(12));
        System.out.println(menesioPavadinimas(0));
        System.out.println(menesioPavadinimas(-2));
    }
    public static String menesioPavadinimas(int skaicius) {
        String menuo;
        switch (skaicius) {
            case 1 :
                menuo = "Sausis";
                break;
            case 2 :
                menuo = "Vasaris";
                break;
            case 3 :
                menuo = "Kovas";
                break;
            case 4 :
                menuo = "Balandis";
                break;
            case 5 :
                menuo = "Geguze";
                break;
            case 6 :
                menuo = "Birzelis";
                break;
            case 7 :
                menuo = "Liepa";
                break;
            case 8 :
                menuo = "Rugpjutis";
                break;
            case 9 :
                menuo = "Rugsejis";
                break;
            case 10 :
                menuo = "Spalis";
                break;
            case 11 :
                menuo = "Lapkritis";
                break;
            case 12 :
                menuo = "Gruodis";
                break;
            default:
                menuo = "Netinkamai ivestas menesio skaicius";
                break;
        }
        return menuo;
    }
}
