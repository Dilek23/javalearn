package j23_StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
    public static void main(String[] args) {

         /*
String = > daha yavas ,Immutable==> degisemez,
String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.

1) Java pass-by-value kullanir
2) String Class'i immutable Class'dir.

 StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
 StringBuffer synchronized,thread safe.

StringBuilders = mutable==>degisebilir ,
not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )

1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
StringBuilder isimli bir class uretmistir.
2) Java'da StringBuilder ile hemen hemen ayni isi yapan birde StringBuffer classi vardir.
"StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
"StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
"StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.
    */
String str="Javacan";
        System.out.println("metod öncesi str = " + str);
strBirleştir(str);// metod sonrası
        System.out.println("metod sonrası str = " + str);
        // task : 50000 tekrarlı bir loop ile string ve stringbuilder obj run time surelerini karşılatır
        String str1="";
        StringBuilder sb1=new StringBuilder("");
        LocalTime str1Basla=LocalTime.now();
        System.out.println("str1Time = " + str1Basla);
        for (int i = 0; i <50000 ; i++) {
            str1+=i;

        }
        LocalTime str1Bitir=LocalTime.now();
        System.out.println("str1Time = " + str1Bitir);


        LocalTime sb1Basla=LocalTime.now();
        System.out.println("sb1Time = " + sb1Basla);
        for (int i = 0; i <50000 ; i++) {
            sb1.append(i);

        }
        LocalTime sb1Bitir=LocalTime.now();
        System.out.println("sb1Time = " + sb1Bitir);
    }//main
    public  static  void  strBirleştir(String str){// string immutable oldugu için metod öncesi ve sonrası aynı sonucu print eder
        System.out.println(str+"agama selam olsun");
    }




}
