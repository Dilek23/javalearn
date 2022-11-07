package j24_AccessModifire;

public class C01_AccessModifire {


        /*
     1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
     Diğer class'lardan "private" class memler'lari kullanamaz.

         2) Diğer package'lerden   olusturulan object için class'i import edilmeli

         3) Diğer package'lerden default class memberlara erişilemez.
          "default" ile "package private" es anlamlidir.

         4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

          5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
         için : a)Child class erişebilir.  b)Child class degil ise erişilemez.

          6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
          Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

 */
private int privateYas=24;
int defaultYas=33;// Access modifier yazılmazsa default olarak tanımlanır.
protected  int protectedYas=40;
public int publicYas=48;


   private C01_AccessModifire() {// private prm.siz cons.kendi clasından erişilir.
       System.out.println("selam private cons.dan ");


   }
       public C01_AccessModifire(int privatesYas, int defaultYas){
           System.out.println("public cons.dan  selam");


           }
        private void privateMethod() {
            System.out.println("private method'dan agaya selam");
        }
  //  protected void protectedMethod(){
     public void protectedMethod(){
        System.out.println("protected method'dan agaya selam");

    }

       }




