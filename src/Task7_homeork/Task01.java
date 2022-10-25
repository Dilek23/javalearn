package Task7_homeork;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
      /*  Scanner scan = new Scanner(System.in);
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();

        boolean boslukVarMi = text.contains(" ");
        System.out.println("boslukVarMi = " + boslukVarMi); //boslukVarMi = true
*/
        String str = "javatara selam olsun";
        String bos = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                bos += str.charAt(i);

            }

            }
            }



        }



