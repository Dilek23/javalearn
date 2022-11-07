package j13_break_contuniue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {
        /*
break loop'u istenen yerden sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
 herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
 loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
 satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
  içinde kullanıldığı loop'dan çıkışı sağlar:


 temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
 */

// Task ->girilen bir mail hesabının @ sembolune kadar olan karakterlerni print eden code create ediniz.
       /* Scanner sc=new Scanner(System.in);
        System.out.println("bir mail hesabı giriniz");
        String mail=sc.nextLine();
        for(int i=0;i<mail.length();i++){
            char c=mail.charAt(i);
            if(c=='@'){// if blok loop u sonlandırır, kırar.
                break;
            }
            System.out.print(c);
        }
         Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
        Örnek: (12, 31, 15, 32, 54) ==> Çıktı 31 ve 32'tür

          Listedeki 8 ve 12 dışındaki her öğenin değerini 2'şer artırınız.
          Örnek: (15, 31, 8, 13, 12) ==> Çıktı (17, 33, 8, 15, 12)
        */
        ArrayList<Integer>numList=new ArrayList<>(List.of(15, 31, 8, 13, 12));
        ArrayList<Integer>yeniList=new ArrayList<>();

        for (int i = 0; i < numList.size() ; i++) {
            if(numList.get(i)!=8&&numList.get(i)!=12){
              numList.set(i,(numList.get(i)+2));
              yeniList.add(numList.get(i));
            }else
               yeniList.add(numList.get(i));

        }

        System.out.println(yeniList);





    }
}
