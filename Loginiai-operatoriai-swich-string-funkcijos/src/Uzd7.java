public class Uzd7 {
    public static void main(String[] args) {
        /*Dienos Tipo Tikrintuvas:
          Sukurkite funkciją, kuri priima savaitės dieną kaip parametrą
          ir grąžina true jeigu tai darbo diena, false, jeigu savaitgalis.
         */

        System.out.println(savaitesDiena("Pirmadienis"));
        System.out.println(savaitesDiena("Antradienis"));
        System.out.println(savaitesDiena("Penktadienis"));
        System.out.println(savaitesDiena("penktadienis"));
        System.out.println(savaitesDiena("Sestadienis"));
        System.out.println(savaitesDiena("ANTRADIENIS"));
        System.out.println(savaitesDiena("SEKMADIENIS"));
        System.out.println(savaitesDiena("siandien"));
    }
    public static boolean savaitesDiena(String diena) {
        if (diena == "Pirmadienis" || diena == "pirmadienis" || diena == "PIRMADIENIS") {
            return true;
        } else if (diena == "Antradienis" || diena == "antradienis" || diena == "ANTRADIENIS") {
            return true;
        } else if (diena == "Treciadienis" || diena == "treciadienis" || diena == "TRECIADIENIS") {
            return true;
        } else if (diena == "Ketvirtadienis" || diena == "ketvirtadienis" || diena == "KETVIRTADIENIS") {
            return true;
        } else if (diena == "Penktadienis" || diena == "penktadienis" || diena == "PENKTADIENIS") {
            return true;
        } else if (diena == "Sestadienis" || diena == "sestadienis" || diena == "SESTADIENIS") {
            return false;
        } else if (diena == "Sekmadienis" || diena == "sekmadienis" || diena == "SEKMADIENIS") {
            return false;
        }else {
            return false;
        }
    }
}
