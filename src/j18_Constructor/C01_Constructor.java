package j18_Constructor;

public class C01_Constructor {

       /*
       1- constructor ismi Class name ile aynı olmalı.buyuk harf ile baslmalı.
       2- constructor creat edildiginde name den sonra (){} mutlaka kullanılmalı.
       3- eger parametreli cons. creat edildiğinde java default cons. ezer(siler).
       4- cons. return type olmaz methoddan ayıran özelliği budur.
       5-  public erisime acık olması lazım. Class oluşunca jva default cons. kendi creat eder.

        */
    String str;
    String selam="güzel insan";


       public static void main(String[] args) {
        // class name   //objename  new kywrd       default cons.
        C01_Constructor obj1   =    new    C01_Constructor();
           C01_Constructor obj2  =    new    C01_Constructor();
           C01_Constructor obj3  =    new    C01_Constructor();
           C01_Constructor obj4  =    new    C01_Constructor();
        obj1.str="javacan";// str ins. variable bj1 ile call edilerek yeni dgr atandı.
           obj2.str="javatar";
           System.out.println(obj3.selam);// guzel insan
           System.out.println(obj1.str);
           System.out.println(obj2.str);
           System.out.println(obj4.str);
       obj3.aga();

       }
       public static void aga(){
           System.out.println("selamkeee:)");
       }

}
