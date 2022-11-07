package P02_KitapCİ;

import java.util.ArrayList;
import java.util.Scanner;

public class KitaPci {
Scanner sc=new Scanner(System.in);
ArrayList<Kitap> bookList=new ArrayList<Kitap>();
static int sayac=0;
public void kitapEkle(){
    System.out.println("Kitap adını giriniz: ");
    String kitapName= sc.next();
    System.out.println("Yazar adını giriniz: ");
    String yazar= sc.next();
    System.out.println("Kitap fiyatını giriniz: ");
    int fiyat= sc.nextInt();
    Kitap kt1=new Kitap(kitapName,(sayac+1000),yazar,fiyat);
    bookList.add(kt1);
    sayac++;


}
public void tumKitapListele(){
    System.out.println(" ** Kitap Listesi ** \nKitap no= \tKitap adi:\t\tYazar Adı:\t\tKitap Fİyatı=  ");
    for (int i = 0; i <bookList.size() ; i++) {
        System.out.printf("%-6d\t%-20S\t%-15S\t%5d₺\n",bookList.get(i).id,bookList.get(i).bookName,bookList.get(i).autorName,bookList.get(i).price);
    }


    }
    public void kitapSil(){
        System.out.println("Silinecek kitap no giriniz: ");
    int kitaPno= sc.nextInt();
    if(kitaPno<1000){
        System.out.println("Kitap no yanlış girildi...!");
        kitapSil();
    }else bookList.remove(kitaPno-1000);

    }
   public Kitap numIleKitapGoRntle(int kitapId){
    int kitapIndex=-1;
       for (int i = 0; i <bookList.size() ; i++) {
if (bookList.get(i).id==kitapId){
    kitapIndex=i;
}
       }
    if (kitapIndex==-1){
        System.out.println("Yanlış işlem yaptınız tekrar kitap numarasını girerek deneyiniz : ");
        kitapIndex= sc.nextInt();
        numIleKitapGoRntle(kitapIndex);
    }
    return bookList.get(kitapIndex);
   }
   public Kitap bilgiIleKitapGornt(String kitapAdi){
    int kitapIndex=-1;
       for (int i = 0; i < bookList.size() ; i++) {
    if(kitapAdi.equalsIgnoreCase(bookList.get(i).autorName)||kitapAdi.equalsIgnoreCase(bookList.get(i).bookName)){
        kitapIndex=i;
    }
       }
if (kitapIndex==-1){
    System.out.println("Yanlış işlem yaptınız tekrar kitap bilgisi giriniz: ");
    String str= sc.next();
    bilgiIleKitapGornt(str);
}
return bookList.get(kitapIndex);
   }
public void Menu(){
    System.out.println("==== Kitapçıya Hoşgeldiniz ===\nLütfen seçiminizi Yapınız\n1->Kitap Ekleyin\n2->Numara ile kitap görüntüle\n3->Bilgi ile kitap al:\n"+
            "4->Num ile kitap sil\n5->Tüm kitapları göster\n6->Çıkış yap\n SEciminizi yapınız= ");

}

    public void kitapSat(Kitap kitap) {
        System.out.println("Almak istediğiniz kitabın ücreti " + kitap.price + " TL dir\nLütfen tutar giriniz : ");
        int alinanPara = sc.nextInt();
        System.out.println("Kitabınız hayırlı olsun ");
bookList.remove(kitap);
    }
}

