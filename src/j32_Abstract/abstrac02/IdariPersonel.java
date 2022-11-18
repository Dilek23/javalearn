package j32_Abstract.abstrac02;

public class IdariPersonel extends Personel{
    @Override// mecbur implemenet edilmeli
    public void maasHesapla() {
        System.out.println("idarecimize saatine 120 tl");
    }

    @Override
    public void maasBilgisi() {// mecbur implemenet edilmeli
        System.out.println("idari personele ekstra");
    }

    @Override// tercihen override edilir.
    public void sigorta() {// Personel prent class dan overiridee
        System.out.println("personeş full Sigorta");
    }
}
