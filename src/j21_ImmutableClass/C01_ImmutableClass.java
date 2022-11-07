package j21_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1="murat";// ilk degeri murat atanan str1 variable

        String str2="murat";// strt1 ve str2 aynı ilk degere sahip oldugu için strin havuzuna


        String str3=new String("murat");
        String str4=new String("murat");

        String str5=str1+"";
        System.out.println( str1==str2);
        System.out.println(str1==str3);
        System.out.println("str1.equals(str2= "+str1.equals(str2));
        System.out.println("str1==str5= "+str1==str5);
        System.out.println("str1.equals(str5)= "+str1.equals(str5));
    }
}
