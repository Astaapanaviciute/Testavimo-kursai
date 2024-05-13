public class Uzd4 {
    public static void main(String[] args) {
        /*Uola, Popierius, Žirklės:
          Sukurkite uola-popierius-žirklės žaidimo funkcija (vaskenčį/pamarskomu).
          Priima du įvedimus String s1 ir String s2. Jie gali būti "žirklės", "popierius",
          "uola". Funkcija turėtų išvesti kas laimėjo
           Pagrindinis principas yra,
           kad uola laimi prieš žirklės,
           žirklės laimi prieš popierių,
           o popierius laimi prieš uolą.
           Jei žaidėjai pasirenka tuos pačius elementus, tai yra lygiosios.
         */

        System.out.println(zaidimas("Uola", "Uola"));
        System.out.println(zaidimas("Uola", "Zirkles"));
        System.out.println(zaidimas("Zirkles", "Popierius"));
        System.out.println(zaidimas("Popierius", "Uola"));
        System.out.println(zaidimas("Zirkles", "Uola"));
        System.out.println(zaidimas("Popierius", "Zirkles"));
        System.out.println(zaidimas("Uola", "Popierius"));

    }
    public static String zaidimas(String zaidejas1, String zaidejas2) {
        if (zaidejas1.equals(zaidejas2)) {
            return "Lygiosios";
        } else if (zaidejas1.equals("Uola") && zaidejas2.equals("Zirkles")) {
            return "Pirmasis zaidejas laimi.";
        } else if (zaidejas1.equals("Zirkles") && zaidejas2.equals("Popierius")) {
            return "Pirmasis zaidejas laimi.";
        } else if (zaidejas1.equals("Popierius") && zaidejas2.equals("Uola")) {
            return "Pirmasis zaidejas laimi.";
        }else {
            return "Antrasis zaidejas laimi";
        }
    }
}
