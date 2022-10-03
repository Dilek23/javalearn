package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;

public class C02_ifelseStatement {
    public static void main(String[] args) {
        /*
        TASK-> girilen yasın 18 den buyukluğunu kontrol eden  code creat ediniz:
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("yaşınızı giriiniz:");
        /*
        int yas = sc.nextInt();
        if (yas > 18) {
            System.out.println("yasınız 18'den büyük");

        }
        /*TASK-> girilen yasın 18 den buyuklugunu kontrol eden code create ediniz
18 den kuçuk ise ehliyet alamzsınız print ediniz.
 */
        int yas= sc.nextInt();
        if (yas>=18) {
//girilen yaşın 18 den büyük yada eşit olmasını kontrol eder
        }else
            System.out.println("ehliyet alamazsıınız:");// if sartı saglamazsa yas 18 den buyuk yada eşit olmaması.




    }
}
