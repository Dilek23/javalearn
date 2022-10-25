package metod_Çalışma;

public class Araba1 {
// Önemli not eger bska bir cons. çarılıcaksa cons. hemen altına yazılır.

    public  Araba1(){
        this(200);//default cons.buraya gelir tek parametre cagırıldıgı için
        // asagıdaki tek parametreli cons. okur
        System.out.println("default");
    }
    public Araba1(int hiz){
this(180,"siyah");
        System.out.println("Tekli");
    }

    public Araba1(int hiz,String renk){
        System.out.println("İkili");
    }
}
