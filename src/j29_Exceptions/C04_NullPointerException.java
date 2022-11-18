package j29_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
        //NullPointerException -> null ataması yapılan bir strinhde lenght() metod run edildiginde oluşan Rte exception
        String str="";
        System.out.println("str.length() = " + str.length());//0

       String str1=null;
        //System.out.println("str1 = " + str1.length());//NullPointerException
        try {
            System.out.println("str1 = " + str1.length());
            System.out.println("Try blokda buyazıyı okuduysan exc.fırlatmadı");
        }catch(NullPointerException e){
            System.out.println("catch calıştı");
            System.out.println("null da String boyutu hesaplanmaz...");
        }
        System.out.println("Sorun handle edildi...");// bu kod satırı calışıp hta handle edildi demektir
    }
}
