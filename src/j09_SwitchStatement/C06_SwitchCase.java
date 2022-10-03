package j09_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
//Task Girilen haftanın gününü hafta içi veya sonu olduğunu print eden code.

        Scanner sc = new Scanner(System.in);
        System.out.print("haftanın bir gününü giriniz");
        String gün= sc.nextLine().toLowerCase();
        switch (gün){
            case "pazartesi":

            case "salı" :

            case "çarşamba":

            case "perşembe":

            case "cuma":
                System.out.println("haftaiçi günü");
              break;
            case "cumartesi":

            case "pazar":
                System.out.println("Haftasonu günü");
                break;
            default:
                System.out.println("yanlış giriş yaptınız");


        }








    }
}
