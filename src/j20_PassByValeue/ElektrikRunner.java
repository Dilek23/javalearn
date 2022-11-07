package j20_PassByValeue;

public class ElektrikRunner {
    public String toString() {
        return "ElektrikRunner";
    }

    public static void main(String[] args) {
        MüSteriClass mustr1=new MüSteriClass();
        mustr1.müstRiName="Tugba";

        System.out.println("mustr1 = " + mustr1);
        ElektrikHesabı hesp=new ElektrikHesabı();

        hesp.tüketimEkle(500);
        System.out.println(mustr1+" isimli kullanıcının toplam tüketimi = "+hesp);
    }

}
