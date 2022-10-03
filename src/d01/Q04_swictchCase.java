package d01;

import java.util.Scanner;

public class Q04_swictchCase {
    public static void main(String[] args) {
        /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        String day= "friday";
        switch (day){
            case "Monday":
            case "Tuesday":
                System.out.println("javaClass");
           break;
            case "Thursday":
            case "friday":
                System.out.println("Selenium class");
           break;
            case "Wednesday":
            case "Saturday":
                System.out.println("SQL class");
           break;
            default:
                System.out.println("day off");


        }

















    }
}
