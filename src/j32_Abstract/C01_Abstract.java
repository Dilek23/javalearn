package j32_Abstract;

public class C01_Abstract {
    /*
    Bazı durumlarda child classlr oarent class daki metodların genellikle body2lerine degiştirerrek override ederler.
    bu gibi durumlarda parent class2 daki metod a body tanımlamak ram acısından gereksizdir.
      Bu gibi durumlarda parent class2daki method'a body tanımlamak ram ve memoey acısından gereksizdir.
    Çözüm olarak java Parent Class'a body'siz -> abstract(soyut)  methodlar tanımlamıştır

    2- Parent class'daki abstract methodlar app güvenliği açısından child class'da override edilmek zorundadır.
    eğer parent class'daki child class'ın mutlaka kullanması gereken method varsa abstract tanımlanmalı
    motor() her aracda olmalı.

    3- abstract method tanımlamak  için
      a) {} body olmaz
      b) access modief sonrası abstract keyword kullanılmalı
      c)Abstract metod içinde abstract keyword ve{} body kullanılamaz aksi hale CTE verir.
      abstrack class tanımlamak için class ifadesinden önce abstract keyword kullanılmalı.
    4- Abs method sadece abs Class'da tanımlanabilir kesinlikle concrete class'da abs method tanımlanamaz.
            ama abs class'da concerete emthod  variable tanımlanabilir
    5-Abs class içinde hem abs metod hemde concerete metod tanımlanabilir.
    6- bir concerete child classs paret abs class extend ettiğinde abs metodları implement edildiğinde

7- paretn child ilişkisi olan abs classlar abs metodları implement etmek zorundadır.
8- parent olan abstract class birden çok concret veya abs child classs extend edebilir ancak child classs birden çok
 abs parent classdan extend edemez.

     ******* ABSTRACT CLASSLAR ASLA OBJE URETMEZLER *******
     TRİCK-> girilen abs classlar



     */

}
