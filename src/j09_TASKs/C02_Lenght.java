package j09_TASKs;

public class C02_Lenght {
    public static void main(String[] args) {
    /* lenght() metodu girilen strigngin uzunluğunu içinde bulunan karakter sayısını return eder
    bütün karakterlerin(boşluk vs.) sayıp adedini verir.
     */
   String str="madem geldin dunyaya otur calıs javaya";
  int strKrtrSayısı =str.length(); //int tipi bir data verir
        System.out.println(str);
        System.out.println(strKrtrSayısı);//38
        System.out.println(str.length());//38
        String str1="";
        System.out.println(str1.length());//0


        String str2=" ";
        System.out.println(str2.length());//1

        String str3=null;
        str3.concat(str1);//rte

        System.out.println(str.length());//Run time
        // TRick->null atanan stringler string metod çalışmaz 21. satır
        /*
        null case sensitivedir bir değiedir yani Null veya NULL yazılımaz
        null bir değer değildir sadece hiçliği gösteren bir pointer(giriş işaretçi)
         */
  String name;// deklare edilmiş ama atanmamış string metod çalışmaz cte verir.
       // name.concat(str1); çalışmaz







    }
}
