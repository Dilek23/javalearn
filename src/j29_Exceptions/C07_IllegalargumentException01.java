package j29_Exceptions;

import java.util.Scanner;

public class C07_IllegalargumentException01 {
    public static void main(String[] args) {
        //IllegalargumentException -> kullanılması istenmeyen degerlerde prog.hat vermesi iteniyorsa bu exc.fırlatılır
      // ornek:yas datası için negatif deger girildiginde prg kırılmadan run olması ama girilen deger icin exc.fırlatılmaz

        Scanner sc = new Scanner(System.in);
        System.out.println("yasınızı girin");
        int age=sc.nextInt();

        if(age<18){
            System.out.println("yasınız uygun değil ");
            throw new IllegalArgumentException();

        }
        else System.out.println(+age+ "ehliyet için uygun ");// throw komutu try-catch olmadanda istenen metod body

      // try {
      //     if(age<0){
      //         throw new IllegalArgumentException();// throw keywordu ile Exception obj oluşturularak hata tanımlanır ve fırlatılır
      //         //bçylece sartımıza uymyan deger icinde catchblok düsürerek daha pratik kod yazildi
      //     }else System.out.println("yaşınız hayırlı olsun..."+age);
      //     System.out.println("try block da bu yazıy, okuduysan exc fırlatmadı");


      // }catch (IllegalArgumentException e){
      //     System.out.println("yasınızı yanlış girdiniz");
      //     System.out.println("catch blok calisti excp fırlatildi.code handle edildi...");
      // }


        System.out.println("Hata handle edildi...");

    }
}
