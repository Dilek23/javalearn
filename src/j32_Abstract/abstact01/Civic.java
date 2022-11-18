package j32_Abstract.abstact01;

public class Civic extends Honda {// Honda parent bs Class extend child concreat class
    /*
    extend honda yazılarak Honda clasa concreat bir civic class tanımlandı
    jav CTE verdi.
    çözüm: a) unımplement(uyarlanmış )metod implement edilmeli
    b)paretn honda clasdan abstract keyword kaldırlmalı
    c)concreat olan child civic class abstc tanımlanmalı
     */
    // concreat classs dan abstract metod tanımlanır mı?
  //  public abstract void absMethod();ya class abs olmalı yada metod concreat body olmalı
    // child concreat clas parent abs classın abs metodlarını
    @Override
    public void motor() {
        System.out.println("1.6 eco motor az yakar ");
    }

    @Override
    void koltuk() {
        System.out.println("Kumaş koltuk...");

    }

    @Override
    void kapi() {
        System.out.println("Beş kapi sedan");
    }
    public int vites(){
        return 5;

    }
  //  Honda obj=new Civic();
   // Civic obj1=new Civic();


}
