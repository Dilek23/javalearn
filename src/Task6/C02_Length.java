package Task6;

public class C02_Length {
    public static void main(String[] args) {
        /*
        length() methodu girilrn string'in uzunluğunu:içinde buluna karakter sayısını return eder
        butun karakterleri(boşluk vs) sayıp adedini verir
         */

        String str="madem geldin dunyaya otur çalış javaya";

      int strKrtrSayisi=  str.length();//int type bir data verir
        System.out.println(str);//madem geldin dunyaya otur çalış javaya
        System.out.println(strKrtrSayisi);//38
        System.out.println(str.length());//38

        String str1="";
        System.out.println(str1.length());//0 iki tırnak rasında hiçbirşey olmdığından 0 yazdırır

        String str2=" ";
        System.out.println(str2.length());//1 iki tırnak arasındaki boşluk olunca lenght 1 yazdırır yani 1 karakter uzunlugundadır.

       //hata verir olmayan degeri kulllanamaz.Rte (run time error)
        //str3.concat(str1);//rte
        //System.out.println(str3.length());//Run time  error
        // TRICK-> null atanan stringler String method çalışmaz cıssss
        /*
        null case sensitivedir. yani Null veyaNULL yazılamaz
        null bir değer değildir(dutluk)sadece hiçliği gösteren  bir pointer(giriş işaretçi)
         */

        String name;// deklare edilmiş ama tanmamış  string String method çalışmaz CTE vcerir.

      //  name.concat(str1);





            /*
            concat() methodu içine(parametee) aldığı string variable'ı çalıştşğı stringin sonuna ekler..
            java'da + işlemi yapılırken eğer en az bir string variable varsa java toplama değil concat yapar.
             */

          /* String name = " Nur ";

            String meslek = " Qa tester ";
            System.out.println(name.concat(meslek));//Nur Qa tester
            System.out.println(name);//Nur
    // ahan da TRICK-> String method'ları variable geciic değişklik yapar.
    // ama değişken atam ayağpılırsa kalıcı değişir
            name = meslek.concat(name);
            System.out.println("name = " + name);//name =  Qa tester  Nur

            System.out.println( name.concat(true + " :) "));// Qa tester  Nurtrue :)
            System.out.println( name.concat(100+ " :) "));// Qa tester  Nur 100 :)

            // TRICK-> concat methodu parametre olarak string type harici tüm dataları srtinge cevirip concat eder
*/





        }
}
