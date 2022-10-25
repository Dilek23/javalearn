package metod_Çalışma;

import java.net.InetSocketAddress;

public class MainClassAraba {
    public static void main(String[] args) {
Araba nesne=new Araba();
        System.out.println(nesne.hiz);
        System.out.println(nesne.renk);
Araba nesne2=new Araba(300);// parametre oldugu için
  // ikinci cons. arar javave diger classtaki parm.li consa bakar.
        System.out.println(nesne2.hiz);
        System.out.println(nesne2.renk);
    }
}
