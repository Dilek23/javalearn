package Task7_homeork;

public class _12_String_methods09 {

    public static void main(String[] args) {

        /*  apple kelimesinden  oluşan bir String yaz.
            String'in içinde App olup olmadığını doğrula.  */

        //Kodu buraya yazınız.
String tr="apple";
        System.out.println(tr.contains("app"));
        System.out.println(tr.toUpperCase().contains("App"));
        System.out.println(tr.equalsIgnoreCase("apple"));
    }
}
