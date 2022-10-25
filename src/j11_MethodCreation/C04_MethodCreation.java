package j11_MethodCreation;

public class C04_MethodCreation {

    public static void main(String[] args){
        String name="haluk";
        C04_MethodDDepo.gecmeNotu(75);
      C04_MethodDDepo.topla(3,5);
    /*
    farklı classdan method call etmek için
    1.method static yazmak
    2. Classname call edilir.
     */
    seLAmVer();
    }

   public static void seLAmVer(){
       System.out.println("selamlar");
   }

}
