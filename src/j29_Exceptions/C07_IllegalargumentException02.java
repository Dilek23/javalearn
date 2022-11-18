package j29_Exceptions;

public class C07_IllegalargumentException02 {
    public static void main(String[] args) {
        /*
        throw-thrws farkları
        1- throws-> main metod kapanıs parantezi ile body acilis parantezi arasına yazılır.
        throw metod body içinde tanımlanır
        2-throws-> keyworden sonra birden fazla ezception tanımlanabilir.
          throw-> keywordden sonra sadece bir tane excp. tanımlanır.
         3- throws->keyywordden sonra sadece excp. clss name yazilir.
          throw-> keywordden sonra exc. obj tanımlanır
          4- throws-> keyword metod ilk satırda sadece bir kez tanımlanır
           throw keyword istenildigig kadar metod body ile tanımlanabilir.
         */
   try {
       System.out.println("try block basından selam:)");
       hata();
       System.out.println("try block sonundan selam");
   }catch ( IllegalArgumentException e){
       System.out.println("catch blok basından selam");
       System.out.println(e);
       System.out.println(e.getMessage());
       e.printStackTrace();// kod calıştı hataları sırala dedigimiz için kırmızı oldu
       System.out.println("catch blok sonundan selam");
   }








    }//main sonu
 public static void hata(){
        throw  new IllegalArgumentException("Yine mi hata:(");
 }



}
