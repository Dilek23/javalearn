package j32_Abstract.abstrac02;

public  abstract class Personel {
    String name="Nur Hanım";
    public  abstract void maasHesapla();//abs. metod
    public  abstract void maasBilgisi();// abs. metod

    public void sigorta(){// personel parent class dan override abs. metod
        System.out.println("Özel sigorta kapsamındasın:)");// conc.meth

    }


}
