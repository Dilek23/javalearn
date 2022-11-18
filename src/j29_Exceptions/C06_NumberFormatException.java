package j29_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
//_NumberFormatException sayi formatında olmayan biit dtayı parseInt metod run ederek ınt'e cevrildiginde
        // javada string içindeki rakam karakterler parseınt metod ile int degerre atanabilir.
String str="1453";
        System.out.println("str+5 = " + str+5);
        int sayi=Integer.parseInt(str);// str deki rakam karakter sayi variable atandı
        System.out.println(+sayi);//1453
        System.out.println("sayi = " + (sayi+5));
           String id="57l622";
      //  System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));
        try{
            System.out.println("Integer.parseInt(id) = " + Integer.parseInt(id));
        }catch (NumberFormatException e){
            System.out.println("catch calıştı");

        }

        System.out.println("Try blokda buyazıyı okuduysan exc.fırlatmadı");

        System.out.println("catch calıştı");


        System.out.println("Sorun handle edildi...");
    }
}
