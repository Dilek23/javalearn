package J03_ScannerClass_typeCasting.Task2;

import java.util.Scanner;

public class _28_Scanner7 {

    public static void main(String[] args) {

        /*    Bir boolean oluşturunuz.
              Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
              Varsa True , yoksa False olarak  konsoldan cevap veriniz.

                */
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir banka hesabınız var mı? Evet ise \"E\" Hayır ise \"H\"tuşlayın:" );
        char cevap=sc.next().charAt(0);
        boolean banka;
        if (sc.hasNextBoolean()) banka = true;
        else {
            banka = false;
        }
            System.out.println("banka =  +E'=='true,+H '=='false");




    }
}
