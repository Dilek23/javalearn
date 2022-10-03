package j10_StringManipulation;

public class C01_Concatanation {
    public static void main(String[] args) {
        /*
        concat metodu içine aldığ string  variable çalıştığı string donuna ekler..
        java'da + işlemi yapılırken eger en z bir string variable varsa java toplama degil concad yapar.
        */
      String name="Nur";
      String meslek="Qa tester";
        System.out.println(name.concat(meslek));// Nur qa tester
        System.out.println(name);//nur
        name=meslek.concat(name);
        System.out.println("name: = " + name);
        // trick concad metodu parametre olarak string type harici tüm dataları stringe cevirir.
        // String metodlrı variable geiçci değişiklik yapar ama degisken atama yapılırsa kalıcı degisir.
        System.out.println(name.concat(true+" :)"));// Qa tester Nur:)
        System.out.println(name.concat(100+" :)"));
   //Trick-> concat metodu parametre olarak string harici tüm dataları stringe cevirir...
    }
}
