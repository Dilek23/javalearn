package j14_Scope;

public class C02_staticVariable {

/* instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate aliriz

   Static variabler ise class variable olarak tanimlanir
   ve tum class uyeleri icin aynidir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir->gunes misali


 */
        static String firmaName="clarusway";
        static int firmaID;
        static boolean firmaIT;
        public static void main(String[] args) {

        firmaID=1001;
            System.out.println("firmaID = " +firmaID);
         //   C02_staticVariable.firmaIT=true;// classname ile static variable call bu bad practice
           staticMethod();//static method static maine call edildi. galaksy seyahati

    }//mainsonu
public static void staticMethod(){// static method(galaksy)
     firmaID=2002;
    System.out.println("yeni id niz hayırlı olsun"+firmaID);
}
    public void non_staticMethod(){// nonstatic method( dunya)
       firmaName="javaCAN";
        System.out.println("yeni firma adı"+firmaName);
    }
}
