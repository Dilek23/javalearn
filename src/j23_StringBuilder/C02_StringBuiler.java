package j23_StringBuilder;

public class C02_StringBuiler {
    public static void main(String[] args) {
        // String builder obj cerate etme...
        // 1. yol->
        StringBuilder sb1=new StringBuilder();// defult capacity 16 bit olan value olmayan boş string...
        System.out.println("sb1.length() = " + sb1.length());// 0 verir.
        System.out.println("sb1.capacity() = " + sb1.capacity());
        sb1.append("javaTar");// javatr sb1 e eklendi

        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());

        sb1.append(" selam ").append(" olsun ").append(" ").append("true");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());


        sb1.append("basari gayrete aşıktır");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.capacity() = " + sb1.capacity());

        //2.yol

        StringBuilder sb2 = new StringBuilder("kevser hanıma selamlar");// ilk deger taması yapılmış strbuildr obj oluştudk
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.capacity() = " + sb2.capacity());// 22 krktr ilk deger atamasına oluştu 16 default hafıza yeri atandı

        //trim() metodu fazladan ayrılan cpacity silinir.

        System.out.println("sb2.length() = " + sb2.length());
        sb2.trimToSize();// trim krktr sayısından fazla olan kısmı siler
        System.out.println("sb2.capacity() = " + sb2.capacity());
// 3. yol
        StringBuilder sb3=new StringBuilder(11);// hafızada 11 krktrlik yer ayıran sb tanımlandı
        System.out.println("sb3.length() = " + sb3.length());//0
        System.out.println("sb3.capacity() = " + sb3.capacity());//11
        sb3.append("ebubekir bey");
        System.out.println("sb3.capacity() = " + sb3.capacity());


        // istenen bir carachter indexi alma
        System.out.println("sb1.charAt(12) = " + sb1.charAt(12));
       // istenen belirli bir aralıktaki karakterleri alma
        System.out.println("sb1.subSequence(3,13) = " + sb1.subSequence(3, 13));// 3.4.5..12 index verir
        System.out.println("sb1.substring(17) = " + sb1.substring(17));//17 den sona kadar
        System.out.println("sb1.substring(3,13) = " + sb1.substring(3, 13));

        // belirli bir indexteki karakter silmek
        System.out.println("sb1.deleteCharAt(3) = " + sb1.deleteCharAt(3));// 3. indexteki a yı siler
        System.out.println("sb1.delete(3,7) = " + sb1.delete(3, 7));//3,4,5,6 siler
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,\":)\") = " + sb3.insert(4, ":)"));
        String s="güzel insan";
        //System.out.println("sb3.insert(9,s) = " + sb3.insert(9, s));
        System.out.println("sb3.insert(1,s,3,7) = " + sb3.insert(1, s, 3, 7));//3,4,5,6->sb3 datasının 1.indexinden
        // itibaren s datasının 3,4,5,6.nci indeksini ekler
        StringBuilder sb4=new StringBuilder("Nihan Hanım");
        System.out.println("sb4.insert(5,\"Qa team led\",0,2) = " + sb4.insert(5, "Qa team led", 0, 2));
        // istenen indexteki karakteri degiştirme...
        sb4.setCharAt(6,'A');
        sb4.setCharAt(sb4.indexOf(" "),':');
        System.out.println("sb4 = " + sb4);//
        System.out.println("sb4.insert(5,\" \") = " + sb4.insert(5, " "));

        //istenen index karatkter yerine birden cok karakter eklemek
        System.out.println("sb4.replace(8,10,\"hi\") = " + sb4.replace(8, 10, "hi"));

        // Sb obj Stringe cevirme...to Str
        System.out.println("sb3.toString().toUpperCase() = " + sb3.toString().toUpperCase());

  /*
    Compare iki sb'i esit mi diye kontrol etmek icin
   ilk harften baslayarak tum karakterleri karsilastirir
   Ayni olan karakterler icin bir sey return etmezken
   farkli olan ilk karakter icin ascii tablosuna gore kac deger geride veya ileride
    oldugunu print eder
   Tamamen ayni ise bize 0 return eder

   bir sb ile bir String'i compare etmek istersek Java CTE verir
   */
StringBuilder sb5=new StringBuilder("javaCAN");
StringBuilder sb6=new StringBuilder("javaCAN");
String str1="javaCAN";
        System.out.println("sb5.compareTo(sb6) = " + sb5.compareTo(sb6));//0 verir yani eşittir
      // sb6.comperato(str1) CTE verir
        System.out.println("sb6.equals(sb5) = " + sb6.equals(sb5));// false verir degerler eşit ancak referanslar farklı
        System.out.println("sb6.equals(sb6) = " + sb6.equals(sb6));//true
        System.out.println("str1.equals(sb6.toString()) = " + str1.equals(sb6.toString()));//true

    }
}
