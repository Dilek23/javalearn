package j32_Abstract.ornek2;

public class Runner {
    public static void main(String[] args) {
        Dikdortgen dd=new Dikdortgen(24,7);
        dd.setName("dikdortgen");
       // dd.cevreHesapla();
        //dd.alanHespla();
        System.out.println("dd.ciz() = " + dd.ciz());
        System.out.println(dd);// obj.nin tum degerleri prşnt edildi.
Cember c1=new Cember(39);
c1.setName("cemberimde gül oya");
        System.out.println(c1);

    }
}
