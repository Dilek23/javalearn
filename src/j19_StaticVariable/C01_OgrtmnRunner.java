package j19_StaticVariable;

public class C01_OgrtmnRunner {
    public static void main(String[] args) {


C01_ogrtmn hc1=new C01_ogrtmn("cüneyt",11);
        System.out.println("hc1.tecrübe = " + hc1.tecrübe);
        System.out.println("hc1.isim = " + hc1.isim);
        //hc1.okul="kabadas";// stticvariale obj ile call edilmez.
        System.out.println("hc1.okul = " + hc1.okul);
C01_ogrtmn.okul="KABATAŞ ERKEK LİSESİ";// CLASS cagırıp okul ismini yazınca
        // okul ismi update oldu.yoksa null verir.cunku okul static.



        C01_ogrtmn hc2=new C01_ogrtmn("bekir",7);
        System.out.println("hc2.tecrübe = " + hc2.tecrübe);
        System.out.println("hc2.isim = " + hc2.isim);
      //hc2.okul="kabatas";
        System.out.println("hc1.okul = " + hc1.okul);//null
        C01_ogrtmn hc3=new C01_ogrtmn("nazım",14);
        System.out.println("hc3.tecrübe = " + hc3.tecrübe);
        System.out.println("hc3.isim = " + hc3.isim);
       // hc3.okul="gabadas";
        hc1.evlilikYıldonumu();//obj ilenonsttaic metod call ettik.
        C01_ogrtmn.maasHesapla();
        hc2.maasHesapla();// bad practice static meth. clss ismiyle cagrılır.


    }

}
