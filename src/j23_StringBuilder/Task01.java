package j23_StringBuilder;

public class Task01 {
    public static void main(String[] args) {
        /*
Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
       olup olmadığını kontrol eden (büyük/küçük harf duyarlılığı olmadan)  metod creat edenbir Java programı yazın.
    (without case sensitivity)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I
       It is not a palindrome"

 */
        System.out.println("tersString(\"ece\") = " + tersString("ece"));
         StringBuilder sb1=new StringBuilder("ali");
         tersSB(sb1);
        System.out.println("isPalindrome(\"ey edip pide ye\") = " + isPalindrome("ey edip pide ye"));
    }//main
    public static  String tersString(String str){
        String StringTersi="";
        for (int i =str.length()-1; i>=0 ; i--) {
            StringTersi+=str.charAt(i);
        }
        return StringTersi;
    }
    public static void tersSB(StringBuilder sb){
        String StringTersi="";
        System.out.println("sb.reverse() = " + sb.reverse());
    }
    public static  boolean isPalindrome(String str){
        if (str==null){
            return false;
        }
        return new StringBuilder(str).reverse().toString().equals(str);


    }
}
