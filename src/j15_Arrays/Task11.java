package j15_Arrays;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        /*
 TASK :
 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

      String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
      */
        String str = "$1 $23 $134 $2 $7 $24 €32 €40 €2 €65 €4 ";
        String strArr[]= str.split(" ");
        System.out.println(Arrays.toString(strArr));
        int toplamDolar=0;
        int toplameuro=0;
        for (int i = 0; i <strArr.length ; i++) {
          if(strArr[i].contains("$"))  {

              toplamDolar+=Integer.parseInt(strArr[i].replace("$",""));
          }else{
              toplameuro+=Integer.parseInt(strArr[i].replace("€",""));

          }
        }
        System.out.println("toplam dolar miktarı:"+toplamDolar+" dolar");
        System.out.println("toplam euro degeri:"+toplameuro+" euro");

    }
}
