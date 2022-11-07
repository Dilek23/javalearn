package j26_Inheritance.inheritance02;



public class Runner {
    public static void main(String[] args) {
/*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
    Kedi k1=new Kedi();
        System.out.println("k1.a = " + k1.a);// hayvancik class dan call
        System.out.println("k1.c = " + k1.c);//2-> kedi class dan call
        System.out.println("k1.d = " + k1.d);//5-> kedi class dan call
        System.out.println("k1.m = " + k1.m);//1-> Mammal Class dan call

        /*
        Ayni isimli variable'lardan hangisinin kullanildi
  olusturulan object'in data type'ina göre bilinir
   Variable'i arastirmaya data type'i classindan baslanır.
         */


        k1.mA();// hayvancık classdan call
        k1.mC();// KEdi classdan call
        k1.mA();//Mammal classdan call

/*
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */
        Mammal k2=new Kedi("Kevser");
        System.out.println("k2.c = " + k2.c);
        System.out.println("k2.a = " + k2.a);
        System.out.println("k2.m = " + k2.m);

        k2.mA();//mA -> HAYVANCIK clssdan  metod call
        k2.mC();//mC-> kedi classdan call edildi..
        k2.mM();//mM-> mammal class method call...

        Hayvancik k3=new Kedi();
        System.out.println("k3.m = " + k3.m);//3
        System.out.println("k3.a = " + k3.a);//0
        //  k3..c-> Datatype hayvancık Class old. için c  call edilemez
        k3.mA();//mA -> HAYVANCIK clssdan  metod call
        k3.mM();//mM-> mammal class method call

        Mammal m1=new Mammal('$');
        System.out.println("m1.m = " + m1.m);
        System.out.println("m1.a = " + m1.a);
        System.out.println("m1.c = " + m1.c);
        //m1.d  -> parent maml class child kedi class dan variable call edemez.
        m1.mA();//Hayvacik class call
        m1.mC();// Mammal class call
        m1.mM();// mM-> mammal class method call


    }
}
