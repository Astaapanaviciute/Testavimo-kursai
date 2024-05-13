public class Uzd1 {
    public static void main(String[] args) {
        /*Sukurkite funkcija, kuri priima studento pažymį kaip įvestį ir spausdina jo pažymį pagal šią pažymių skalę:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: mažiau nei 60*/
        System.out.println(studentoPazymys(80));
        System.out.println(studentoPazymys(85));
        System.out.println(studentoPazymys(99));
        System.out.println(studentoPazymys(110));
        System.out.println(studentoPazymys(-10));

    }
    public static String studentoPazymys(int pazymys) {

        if (pazymys >= 90 && pazymys <= 100) {
            return "A";
        }
        else if (pazymys >= 80 && pazymys <= 89) {
            return "B";
        } else if (pazymys >= 70 && pazymys <= 79) {
            return "C";
        } else if (pazymys >= 60 && pazymys <= 69) {
            return "D"
;        }
        else {
            return "F";
        }
    }
}
