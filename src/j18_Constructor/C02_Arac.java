package j18_Constructor;

public class C02_Arac {

    String marka;
    String model;
    int km=10;
    double motorHcm;
    boolean vitesAuto=false;
    boolean ikinciEl;
    int yıl;


    @Override
     public String toString() {
        return "C02_Arac{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHcm=" + motorHcm +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yıl=" + yıl +
                '}';
    }

    public static void main(String[] args) {
        C02_Arac arac1=new C02_Arac();// defaut cons ile arac1 creat ettik.
        arac1.ikinciEl=true;
        arac1.marka="volvo";
        arac1.km=50000;
        arac1.model="xc60";
        arac1.motorHcm=2.4;

        System.out.println(arac1.marka+" "+arac1.model+" "+arac1.yıl+" "+arac1.km+" "+arac1.ikinciEl+" "+arac1.motorHcm);
// task-> 2. bir aracın tüm fildlarını atayarak print et.
        C02_Arac arac2=new C02_Arac();
        arac2.ikinciEl=true;
        arac2.marka="volvo";
        arac2.km=10000;
        arac2.model="S60";
        arac2.motorHcm=2.4;

        System.out.println(arac2.marka+" "+arac2.model+" "+arac2.yıl+" "+arac2.km+" "+arac2.ikinciEl+" "+arac2.motorHcm);

        System.out.println("arac2 = " + arac2);




    }
}
