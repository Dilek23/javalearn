package j29_Exceptions;

import java.util.Scanner;

public class C01_AritmeticException {
    public static void main(String[] args) {
        String str = "";
        // str.charAt(2);// RTE verir.
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi gir:");
        int sayi1 = sc.nextInt();
        System.out.println("ikinci sayi gir: ");
        int sayi2 = sc.nextInt();
        int oran;// RTE aritmetik exception kullanızı 0 girerse rte verir

        try {// dene-> hatanın olma ihtimali oldgu kod blok
            /*
            1-> try catch kullanıldıgında try blok hatasız calısırsa catch block calısmaz catch block tryblock exp yakalarsa calısır.
            2-> try blok catch veya finallay block olmdan CTE verir.try dan sonra birden fazla catch block tanımlanablir.
            aynı anda birden fazla ctch calısabilir hiçbir catch block calismayabilir
            3->parent child ilişkisi olan catchlerde child önce yazılmalı

             */
            oran = sayi1 / sayi2;// try block' da hata yakalandıgı satırdan sonra diger satırlardegil ilgili catch block calısır.
            System.out.println("try block dan selamlar...");


        }
          catch (ArithmeticException falanFilan){
              System.out.println("bolmede bolen 0 olmaz"+falanFilan.getMessage());// exc.oluştugunda sadece hata mesajı print
             falanFilan.printStackTrace();// olusan exc. tum detay bilgisi print etmek icin
              System.out.println("cırak catch den selam");
          }
        //  catch (ArrayIndexOutOfBoundsException arrayExc){
        //      System.out.println("Array de olmayan elemn istediniz");
        //  }
//
        //   catch (Exception e){// exception claa tum exceptionların parent clasıdır
        //       // hata yakalandıgında yapılacak aksiyon
        //       // e -> javanın olusan exp.a atayacağı obj.name bet practice
        //       System.out.println("0 sayisi bölmez yanlış girdiniz");
        //       System.out.println("catch den selam ");
        //   }
      //  catch (ArithmeticException falanFilan) {// child exception parent exception sonra tanımlandıgı için CTE verir
        finally{// catchden sonra finally kullanılabilir.
            /*
            try catch içinde yapılan işlemlerden aınra mutlaka calışması greken blok varsa finally tanımlanır.
            hata durumunda catch calısmazsa pr sonlanır.ama finallay tanımlanıra catch calısmasa bile pr akısı dvm eder.
            finallly block hata olsada olmazsada calısır.
            Cloud database ortamlarında baglanti kesmek için kulllanır.Claud ile connection yzdıgında kod başarılı bir şekide calısırsa
            işlem bittignide finaly ile connection kapanmazsa mailyetli olur.
             */
                System.out.println("Finally blockdan selamlar");
            }

            System.out.println("selamtle devam");

        }

    }
