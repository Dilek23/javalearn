package j10_StringManipulation;

public class C04_Contains {
    public static void main(String[] args) {
    /*
    String içerisinde istenen stringin varlığını kontrol eder boolean return eder...

     */
        String s1="Enise hanım basarılı bir Qa tester team lead";
        System.out.println(s1.contains("hanım ifadesi varmı")); // false
        System.out.println(s1.contains("E"));
        System.out.println(s1.contains(" "));

        String s2="Qa";
        System.out.println(s1.contains(s2));// true
        System.out.println(s2.contains(s1));//false
      // task-> girilen bir cumlede aranan kelimenin varlıgını kontrol eden code creat et.( ternary kullanınız)









    }
}
