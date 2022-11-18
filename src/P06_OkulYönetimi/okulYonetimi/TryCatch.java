package P06_OkulYönetimi.okulYonetimi;

import java.util.Scanner;

public class TryCatch {
    Scanner sc = new Scanner(System.in);
    private CharSequence charAt;

    public boolean illegalArgumentException(int a) {
        while (true) {
            try {
                if (a < 7) {
                    throw new IllegalArgumentException();
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Maalesef 7 yaşından Küçük Öğrencileri Kayıt Alamayız");
                break;

            }
        }

        return false;
    }
        public boolean illegalArgumentExceptionEkleme(int b) {
     while (true) {
         try {
             if(b<0){
                 throw new IllegalArgumentException();
             }
         }catch (IllegalArgumentException e) {
             System.out.println("negatif sayıda ögrenci ekleyemezsiniz!!!");
             break;
         }catch (Exception a){
             if(sc.next().contains(charAt)) {
                 System.out.println("Lütfen harf girmeyiniz...");
                 break;
             }
         }

     }
      return true;



        }

    }


