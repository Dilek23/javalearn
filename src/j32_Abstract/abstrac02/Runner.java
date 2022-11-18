package j32_Abstract.abstrac02;

public class Runner {
    public static void main(String[] args) {
        Isci maraba1=new Isci();
        maraba1.maasBilgisi();//günde 8 saatlik maas
        maraba1.maasHesapla();//en cok yevmiye 499 tl
        maraba1.name="EbuBekir";
        System.out.println("maraba1.name = " + maraba1.name);
        maraba1.sigorta();// abs Parent class daki conc. metod obj ile call edildi.
         IdariPersonel cncCdr=new IdariPersonel();
         cncCdr.name="Dilek orciklerin efendisi";
        System.out.println("cncCdr.name = " + cncCdr.name);
         cncCdr.sigorta();
         cncCdr.maasHesapla();
         cncCdr.maasBilgisi();
    }
}
