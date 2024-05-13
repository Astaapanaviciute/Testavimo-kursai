public class Uzd6 {
    public static void main(String[] args) {
        /*Šviesoforo Simuliatorius:
        Sukurkite funkcija, kuri simuliuoja šviesoforą.
        Funkcija gauna šviesoforo spalvą kaip parametrą ir pagal tai spausdinti pranešimą,
        tokią kaip "Stok," (raudona) "Lėtai,"(geltona) arba "Važiuok."(žalia)*/

        System.out.println(sviesoforoSpalva("Raudona"));
        System.out.println(sviesoforoSpalva("Geltona"));
        System.out.println(sviesoforoSpalva("Zalia"));
        System.out.println(sviesoforoSpalva("Melyna"));
        System.out.println(sviesoforoSpalva("Rozine"));
    }
    public static String sviesoforoSpalva( String spalva) {
        String rezultatas;
        switch (spalva) {
            case "Raudona" :
                rezultatas = "Stok";
                break;
            case "Geltona" :
                rezultatas = "Letai";
                break;
            case "Zalia" :
                rezultatas = "Vaziuok";
                break;
            default:
                rezultatas = "Netinkama spalva";
                break;
        }
        return rezultatas;
    }
}
