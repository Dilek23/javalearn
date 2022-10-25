package j14_Scope;

public class C01_InstanceVariable {

      /*                                  INSTANCE VARIABLE

   1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
      olusturulan variable'lara "instance variable" denir.
   2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
   3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
      Asagida goruldugu gibi "yas" variable'ina deger atamasi yaptim "tecrube" variable'ina yapmadim.
      Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
         "i" variable'i initialize edildi, digerleri initialize edilmedi.
   4) Initialize edilmeyen "instance variable" lar icin Java kendisi deger atamasi yapar.
      Java'nin instance variable'lara kendisinin verdigi degerlere "default value" denir.
            byte, short, int, long icin default value 0'dir.
            float, double icin default value 0.0'dir.
            char icin default value 0'dir.
            boolean icin default value false'dur.
            String icin default value "null" dir.

*/

    int yas = 48; //initialized ilk atamsı yapılmış ins. variable
    int tecrube;// default deger 0
    String name;// default deger null
    boolean developerMı;// deafult deger false
     static double boy;// default deger 0.0
    char unvan;// default deger bosluk
    public static void main(String[] args) {
       int a=7;// local variable
        System.out.println(a);
staticMethod();// sttic metod calla edildi->stral seyahat: static olan main sadece static metod call eder.
        //non static method call edilemez.

       // System.out.println(yas);//instance variable deger atamsı yapmaan işleme alınmaz.non-static oldugu için dogrudan cagrilmaz
    //obje creation-> ClassNme objname=new ClassName();
        C01_InstanceVariable ebikgabıkobj=new C01_InstanceVariable();

        ebikgabıkobj.developerMı=true;
        ebikgabıkobj.name="kubra hanım";
        System.out.println(ebikgabıkobj.name);
        System.out.println(ebikgabıkobj.tecrube);
ebikgabıkobj.yas=33;
        System.out.println(ebikgabıkobj.yas);
        C01_InstanceVariable obj1=new C01_InstanceVariable();
        obj1.boy=1.75;
        System.out.println("obj1.boy = " + obj1.boy);
        System.out.println(obj1.name = "tuba");
    }

    // a=23;local dışı call edilemz
    public void non_StaticMethod(){
        System.out.println("static olamayn metottan selamlar");
    }
    public static void staticMethod(){
        System.out.println("static güneş metoddasın");
    }
}
