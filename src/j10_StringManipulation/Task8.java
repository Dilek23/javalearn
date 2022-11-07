package j10_StringManipulation;

public class Task8 {
    public static void main(String[] args) {
  /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi yazdiriniz.
   String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
 String harfDepo="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 char h=harfDepo.charAt(harfDepo.indexOf("N"));
        char a=harfDepo.charAt(harfDepo.indexOf("A"));
        char l=harfDepo.charAt(harfDepo.indexOf("Z"));
        char u=harfDepo.charAt(harfDepo.indexOf("L"));
        char k=harfDepo.charAt(harfDepo.indexOf("I"));
        System.out.println(h+a+l+u+k);// ascii toplama
        System.out.println(""+h+a+l+u+k);// Nazlı
      //  System.out.println(pickName.charAt(pickName.indexOf("C"))+pickName.charAt(pickName.indexOf("A"))+pickName.charAt(pickName.indexOf("N")));
    }




    }

