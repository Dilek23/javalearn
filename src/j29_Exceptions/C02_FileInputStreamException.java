package j29_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException {
    /*

     Dosya okuma/yazma işlemi bu işlemlerde hata olasılığı yüksek olduğundan hata kontrolü zorunlu tutuluyor.
     bu yüzden try-catch e alınması bu kodun zorunlu tutuluyor. bu gibi surumlara karşılk gelen hatalara Checked Exception denir
     Özellikle IO(input output) işlemleri CHECKED EXCEPTİON dur.


    Bir kod yazilirken olasi exception'lar ongorulup
    exception olustugunda Java'nin ne yapmasini istedigimiz
    belirtilmelidir.


         1) FileNotFoundException, ustunde calisilicak bir dosyaya ulasma ile ilgili problemlerde
kullanilir. Bir dosyaya ulasmada iki temel problem olabilir; a) Path yanlistir. b) Dosya silinmistir.

   2) IOException, input ve output ile alakali tum problemlerde kullanilir. IOException,
FileNotFoundException'in yaptigi tum aksiyonları yapabilir dolayısıyla IOException kullanildiginda
FileNotException'in kullanilmasina gerek yoktur. IOException FileNotFoundException
Class'inin parent class Hz.Adem
 */
    public static void main(String[] args) throws IOException {

        FileInputStream fis=new FileInputStream("C:\\Users\\seyda-pc\\IdeaProjects\\javalearn\\src\\j29_Exceptions\\ebikGabık");
// ilgili dosyaya ulasmak için fis pbj tanımlandı parametre olarak ulaşılacak
        /*
        eger bir methoda checked (CTE riski olan excp.)exception varsa metod signatue hat uyarısı alti kirmizi çizgi verir.
        komutun derkenmesine izin vermez ve kodun uzerine geldiginde Add.. exception handle etme tavsiye dder otomatich throw
        excp. eklenir bu şekilde metod cll eden komutlar try-catch alınması gaarnti edilmis olur.
         */


        int k;
        while ((k=fis.read())!=-1){// gelen ascii degerleri -1e yani hiçliğe eşit olana kadar while dongusu calisir file yzdırı sona gelice hiçlige eşit olur dönguden cıkar
            System.out.print((char) k);// k int degeri asci olan file daki char içi casting type donusumu
        }

    }


}
