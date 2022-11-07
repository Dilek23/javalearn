package P02_KitapCİ;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KitaPci kitapci=new KitaPci();
        char dvm='E';
        do{
            kitapci.Menu();
            int karar= sc.nextInt();
            switch (karar){
                case 1:kitapci.kitapEkle();break;
                case 2:
                    System.out.println("Almak istediginiz kitaba ait kitap no giriniz: ");
                int kitapNo= sc.nextInt();
                kitapci.kitapSat(kitapci.numIleKitapGoRntle(kitapNo));
                break;
                case 3:
                    System.out.println("Almak istediginiz kitaba it yazar veya Kitap dı giriniz:");
                    String kitapBilgi= sc.nextLine();
                    kitapci.kitapSat(kitapci.bilgiIleKitapGornt(kitapBilgi));
                    break;

                case 4:
                    System.out.print("Silmek isteiginiz kitap no giriniz:");
                    int kitpnosil= sc.nextInt();
                    kitapci.kitapSil();
                    break;
                case 5:
                    System.out.println("Kitap Listeniz:");
                    kitapci.tumKitapListele();
                    break;
                case 6:
                    System.out.println("Çıkış işleminiz yapıldı...");
                    break;
                default:
                    System.out.println("yanlış seçim yaptınız...");
                    karar= sc.nextInt();
            }
            System.out.println("İşleme devam etmek istersenin 'E' istemezseniz 'H'yazınız:");
            dvm= sc.next().toUpperCase().charAt(0);

        }while (dvm=='E');
        System.out.println("Hayırlı günler...:)");




    }
}
