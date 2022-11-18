package P05_KahveMakinesi;

import java.util.Scanner;

public class Option {
/*  ***Urun urun=new Urun();
Kullanıcı urunleri göstermeliyiz urun clasından bir obje toString()
Scanner classdan bir obj creat et[productNum set etmek gerek]
do- while loop kullan ---> kullanıcı 0 ile 7 arasında secim  yapmalı girdigi rakam 1-7 rasında secim yapmalı
Kullanıcı 0 a basarak menüden cıkabilmeli
Kullanıcıdan product num alıp price yani ürüne atanmalı assigment edilmeli.--> switc case
switch bizden pruductNum (getKraker,getCips.....)(price set edebilmek için price ın setPrice metodunu kullanmalıyım
return olarak bna price dönmeli.return getPrice(double)

 */
 public double select(Urun urun){
     System.out.println(urun.toString());
     Scanner sc=new Scanner(System.in);
  // kullanıcıya urunleri gösterdik

   do{
       System.out.println("1ile 7 arasında  almak istediğiniz ürün no giriniz: ");
       System.out.println("Çıkış için '0'tuşlayın");
       urun.setProductNum(sc.nextInt());
       if(urun.getProductNum()<0||urun.getProductNum()>7){
           System.out.println("belirtilen aralıkta bir rakam giriniz...");
       }
   }while (urun.getProductNum()<0||urun.getProductNum()>7);//
switch (urun.getProductNum()){
    case 0:
        System.out.println("yine bekleriz...");
        System.exit(0);
        break;
    case 1:
        urun.setPrice(urun.getKraker());
        break;
    case 2:
        urun.setPrice(urun.getCips());
        break;
     case 3:
         urun.setPrice(urun.getCocaCola());
         break;
     case 4:
         urun.setPrice(urun.getFanta());
         case 5:
             urun.setPrice(urun.getSu());
             break;
      case 6:
          urun.setPrice(urun.getCay());
          break;
      case 7:
          urun.setPrice(urun.getFiltreKahve());
          break;


}
return urun.getPrice();
 }
public double balance(double price,double accountBalance, Urun urun) {
    double fonlama;// kulllanıcının ekleyecegi para için
    try{
        System.out.println("Hellooooo...");

    // handle
    }catch(Exception e){
        System.out.println("Catch...");
    }


    while (accountBalance<price){
        Scanner sc=new Scanner(System.in);
        System.out.println("Bakiyeniz yetersiz ...Ekleme yapmak istiyormusnuz(Y/N)");
        char c=sc.next().toLowerCase().charAt(0);
        if(c=='n'){
            System.out.println("Mevcut bakiyeniz  "+accountBalance);
            break;
        }else {
            System.out.println("Ne kadar ekleme ypmak istiyorsunuz: ");
            fonlama= sc.nextDouble();
   accountBalance=accountBalance+ fonlama;
            System.out.println("accountBalance = " + accountBalance);
        price=select(urun);


        }

    }

return accountBalance;

}
public void purchase(double price,double accountBalance,Urun urun ) {
     while (accountBalance>=price){
 accountBalance=accountBalance-price;
         System.out.println("Kalan Bakiye: "+accountBalance);
         Scanner sc=new Scanner(System.in);
         System.out.println("Başka urun almak istşyormusnuz?(Y/N)");
         char confirm=sc.next().toLowerCase().charAt(0);
         if(confirm=='n'){
             System.out.println("Yine bekleriz...");
             break;
         }else{
             urun.setPrice(select(urun));
            accountBalance=balance(urun.getPrice(),accountBalance,urun);
         }

     }



}

}





