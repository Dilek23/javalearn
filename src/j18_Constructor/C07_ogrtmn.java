package j18_Constructor;

public class C07_ogrtmn {// ogrtmn için obje kalıphane
    String isim;
    int tecrube;
    int kıdem=5;


    public C07_ogrtmn(String isim, int tecrube) {
        this.isim = isim;
        this.tecrube = tecrube;

    }
    public void kıdemHesapla(int kıdem){// int parametreli void metod
        System.out.println("kıdeminiz = " +( kıdem*2));// metod par. degeri kıdeme atanır
        System.out.println("(this.kıdem*2) = " + (this.kıdem * 2));// inst. obj degerkıdeme tanır.


    }
}
