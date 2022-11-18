package d13;

import java.util.Scanner;

public class HesapMakinesi {
    /*
    Constructor kullanacak sekildde RUnner ve hesap classları olan bir hesap makinesi creat et.
     */
   double x;
   double y;
   char secim;

    public HesapMakinesi(double x, double y, char secim) {
        this.x = x;
        this.y = y;
        this.secim = secim;
    }

    public HesapMakinesi() {
    }

    public double toplama(double x, double y) {
        return (x+y);

    }
    public double cıkarma(double x,double y) {
        return (x-y);

    }
    public double carpma(double x, double y) {
        return (x*y);

    }
    public double bolme(double x, double y) {
        return (x/y);

    }
    public void giris(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hangi işlemi yapmak istiyorsunuz (+),(-),(*),(/) ");
        secim=sc.next().charAt(0);
        System.out.print("Birinci sayiyi giriniz:");
       x= sc.nextInt();
        System.out.print("İkinci sayiyi giriiniz:");
        y= sc.nextInt();
    }
public void hesapla(){
        switch (secim){
            case '+':
                System.out.println("Toplam sonucu= "+toplama(x,y));
                break;

            case '-':
                System.out.println("cıkarma sonucu= "+cıkarma(x,y));
                break;

            case '*':
                System.out.println("Carpma sonucu= "+carpma(x,y));
                break;

            case '/':
                System.out.println("Bölme sonucu= "+bolme(x,y));
                break;






        }
}


}
