package j29_Exceptions.Task;

import java.io.IOException;
import java.util.Scanner;

public class Taskİsi {
    public static void main(String[] args) throws IOException {
         /*
            Task -> girilen hava sıcaklığı 10'un altında ise IOException hatası tanımlayıp hatayı print eden method create
        edip mainde kontrol ediniz.
        Trick->
        sicaklikKontrol(int sıcaklık){
        throw new IOException("Hava Gerçekten soğuk dışarı çıkma");
           }
        main(){
        Scanner ...
        try{
         sicaklikKontrol(int sıcaklık);
        }
        catch (IOException e) {
​
         */

        Scanner sc= new Scanner(System.in);
        try {
            System.out.print("Sıcaklık degerini giriniz: ");
            int sck= sc.nextInt();
            sicaklikKontrol(sck);
            System.out.println("Hava güzel çık ısın:)");
        }catch (IOException e) {
            System.out.println(e);
            e.getStackTrace();
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("soguktan don tutabilirsinn...");

        }catch (Exception e){
            sc.next();
            System.out.println("sıcaklık degeri harf ile girilmez yanlış oldu...");

        }

}
private static void sicaklikKontrol(int sck)throws IOException {
        if(sck<10){
            throw new IOException("Hava buz gibi çıkma sakınn!!!");
        }
}
}
