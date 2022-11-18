package j32_Abstract.abstrac02;

public class Isci extends Personel{////abs Personel parent Clas'a extends->concrete child isci clss
    @Override
    public void maasHesapla() {// personel parent class dan override abs. metod
        System.out.println("en cok yevmiye 499 tl");
    }

    @Override
    public void maasBilgisi() {// personel parent class dan override abs. metod
        System.out.println("günde 8 saatlik maas");
    }
}
