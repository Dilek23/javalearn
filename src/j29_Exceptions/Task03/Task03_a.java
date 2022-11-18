package j29_Exceptions.Task03;

import java.util.Random;

public class Task03_a {
    public static void main(String[] args) {
        //    randomSayi isminde static void bir method create ediniz.
        //    Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
        //    Bu iki random sayının toplamını yazdırın.
        //    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
        //     ("Sayı 12'den küçük ise hata verir") print edin.

      /*  randomSayi();

    }

    private static void randomSayi() {
        Random rnd = new Random();
        int toplam = 0;
        while (true) {
            int sayi1 = rnd.nextInt(10);
            int sayi2 = rnd.nextInt(10);
            try {
                toplam = sayi1 + sayi2;
                if (toplam < 12)
                    throw new Exception();
                else {
                    System.out.println("sayi1 : " + sayi1 + " sayi2 : " + sayi2);
                    System.out.println("Toplam : " + toplam);
                    break;
                }
            } catch (Exception e) {
                System.out.println("sayi1 : " + sayi1 + " sayi2 : " + sayi2);
                System.out.println("Toplam 12'den küçük olamaz. ");
            }
        }

       */
        ranDomSayi();


    }

    private static void ranDomSayi() {
        Random rand = new Random();
        int toplam=0;
        while (true) {
            int num1 = rand.nextInt(10);
            int num2 = rand.nextInt(10);
        try {
            toplam=num1+num2;
            if(toplam<12)
              throw new Exception();
             else{
                System.out.println("sayi1:"+num1+" sayi2 : "+num2);
                System.out.println("toplam = " + toplam);
                System.out.println("Toplam 12'yi gecti hata handle edildi...");
                break;
            }

        } catch (Exception e) {
            System.out.println("sayi1:"+num1+" sayi2 : "+num2);
            System.out.println("toplam = " + toplam);
            System.out.println("Sayilarin toplamı 12' den küçük olamaz...");
        }

        }

    }
}
