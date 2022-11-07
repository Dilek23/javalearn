package j06_Comparison_karşılaştırma_Opr;

public class C01_ComprOp {
    public static void main(String[] args) {
        /*

==     Esit               x == y
!=     Esit degil         x != y
>      buyuk              x > y
<      kucuk              x < y
>=     buyuk esit         x >= y
<=     kücük esit         x <= y

 */
        /*
        s1 ve s2 String constant pool içerisinde aynı referans değere (reference) sahiptir. s3 ve s4 ise farklı nesneleri ifade eder.
                s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve  String constant pool üzerinde aynı adresi gösterirler.
        Böylece ekrana TRUE yazdırır.*/

      int slmys=33;
      int krmys=41;
        System.out.println("krm bey eşit mi slm beye-> " + (krmys==slmys));
        System.out.println("krm b esit değil  mi slm b -> "+(krmys!=slmys));//true
        System.out.println("krm b kucuk mu  slm b -> "+(krmys<slmys));//false
        System.out.println("krm b buyuk mu   slm b -> "+(krmys>slmys));//true
        String name="Kerem bey";
        String name1="kerem bey";
        System.out.println(name==name1);//
    }
}
