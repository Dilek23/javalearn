package j29_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {
        //ClassCastException-> Birbirine dönüştürülemeyen data typelar birbirine dönüştürüldügünde olusn RTE exceptiondur.
        Object obj = "javaCan'lara selam olsun";
        String str=(String) obj;// obj. data type casting yapıldı
        System.out.println("str = " + str);
        Object sayi1=10;
       // String str2= (String) sayi1;// obj. data type casting yapıldı
       // System.out.println("str2 = " + str2);// ClassCastException hatası verdi. şimdi bu hatayı handle edecez.
        try{
            String str2= (String) sayi1;
        }catch (ClassCastException e){

            System.out.println("integer object String cevrilmez hata verir");
        }
try{
    String strt3= (String) obj;
    System.out.println("try blokda bu yazıyı okuduysan exc fırlatmadı");
}catch (ClassCastException e){
    System.out.println("integer object String cevrilmez hata verir");
}
        System.out.println("Sorun handle edildi...");// bu kod satırı calışıp hta handle edildi demektir

    }
}
