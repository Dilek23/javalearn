package metod_Çalışma;

public class M01 {
    public static void main(String[] args) {
    toplama();
toplama(30,50);
toplama(40,20);


    }
public static void toplama(){// () parantezini içi boş ise bu parametresiz metoddur.() içine bir data eklenmişse parametreli olur.
    System.out.println("toplama metodu çağrıldı");
    System.out.println("Merhabalar");
}
public static void toplama(int sayi1,int sayi2){
       int toplam=sayi1+sayi2;
    System.out.println("toplam = " + toplam);
}


}
