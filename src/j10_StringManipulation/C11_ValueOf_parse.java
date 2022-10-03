package j10_StringManipulation;

public class C11_ValueOf_parse {
    public static void main(String[] args) {
// Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.

// string type verilen iki adet bagış miktarını toplayın...
        String bagis1="1500";
        String bagis2="2500";
         int bagisdeger1=Integer.valueOf(bagis1);
        int bagisdeger2=Integer.valueOf(bagis2);
        System.out.println("toplam bagı miktarı:"+(bagisdeger1+bagisdeger2));

        int fetih=Integer.valueOf("1453");


        System.out.println(fetih);
        System.out.println("Toplam bagıs:"+ (Integer.parseInt(bagis1) + Integer.parseInt(bagis2)));


        int tc=1234567;
       String strTc= String.valueOf(tc);
        System.out.println("strTc="+strTc);



    }
}
