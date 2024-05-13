public class Uzd5 {
    public static void main(String[] args) {
        /*Perdarykite tą arBalse() funkciją, kurią dariau kaip pavyzdį praeitą pamoką,
         bet ją perdarykite su switch
         */

        System.out.println(arBalse('a'));
        System.out.println(arBalse('b'));
        System.out.println(arBalse('c'));
        System.out.println(arBalse('i'));
        System.out.println(arBalse('ą'));
        System.out.println(arBalse('ę'));
        System.out.println(arBalse('E'));
        System.out.println(arBalse('Ą'));
        System.out.println(arBalse('R'));
    }
    public static String arBalse(char s) {
        //a, e, i, o, u)(, ą, , ę, ė, y, į, , ū, ų)
        String rezultatas;
        switch(s) {
            case 'a' :
            case 'A' :
            case 'ą' :
            case 'Ą' :
            case 'e' :
            case 'E' :
            case 'ę' :
            case 'Ę' :
            case 'ė' :
            case 'Ė' :
            case 'i' :
            case 'I' :
            case 'į' :
            case 'Į' :
            case 'y' :
            case 'Y' :
            case 'o' :
            case 'O' :
            case 'u' :
            case 'U' :
            case 'ū' :
            case 'Ū' :
            case 'ų' :
            case 'Ų' :
                rezultatas = "Balse";
                break;
            default:
                rezultatas = "Ne balse";
                break;
        }
        return rezultatas;
    }
}
