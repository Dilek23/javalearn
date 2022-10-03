package Task8;

import java.util.Scanner;

public class Task14 {

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen mesaiye hangi saatte basladığınızı  yazınız:");
        double baslangicSaati= sc.nextDouble();
        System.out.println("Lütfen mesaiye hangi saatte bitirdiginizi  yazınız:");
        double bitisSaati= sc.nextDouble();
        System.out.println("Lütfen saatlik mesai ücretinizi giriiniz");
        double saatUcreti= sc.nextDouble();
        System.out.print("Fazla mesaiye kalırsaniz kazancınızın kaç ile katlanacagini girin: ");
        double fazlaMesaiKatsayi = sc.nextDouble();

        double ucret= ucretHesapla(baslangicSaati,bitisSaati,saatUcreti,fazlaMesaiKatsayi);
        System.out.println(ucret);




    }//Main dışı
public static double ucretHesapla( double baslangicSaati,double bitisSaati,double saatUcreti,double fazlaMesaiKatsayi){
  double toplam=0;
  if(bitisSaati>baslangicSaati&&bitisSaati<24){
      toplam=(bitisSaati-baslangicSaati)*saatUcreti;
      System.out.println("toplam ucretiniz: = " + toplam);
  }else {
      toplam=((17-baslangicSaati)*saatUcreti)+((bitisSaati-17)*saatUcreti*fazlaMesaiKatsayi);
      System.out.println("toplam ucretiniz= " + toplam);
  }

        return toplam;
  }




}










