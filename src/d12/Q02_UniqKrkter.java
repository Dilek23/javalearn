package d12;
/*
***interwiev sorusu:
Bir Stringde ilk uniq karakteri bulup return eden method create ediniz.
Ex:
String str1="AAABBBCCCDEF";
String uniqf="D";
 */
public class Q02_UniqKrkter {

    public static void main(String[] args) {
        /*
        String str1="AAABBBCCCDEF";

        System.out.println("uniq(\"AAABBBCCCDEF\") = " + uniq("AAABBBCCCDEF"));

    }

    private static String uniq(String str1) {

        String uniqbos="";
    for (int i = 0; i <str1.length() ; i++) {
        if(str1.indexOf(str1.charAt(i))==str1.lastIndexOf(str1.charAt(i))){
            uniqbos=String.valueOf(str1.charAt(i));break;

        }

    }
    return uniqbos.length()==0?"Stringinizde uniq karakter bulunmamaktadir":uniqbos;

         */
        String str1="AAABBBCCCDEF";
        System.out.println("( AAABBBCCCDEF) Stringindeki ilk unıq karakter =  " + uniq(str1));

    }// main sonu
    public static String uniq(String str1){
        String uniqBos="";

        for (int i = 0; i <str1.length() ; i++) {
            if(str1.indexOf(str1.charAt(i))==str1.lastIndexOf(str1.charAt(i))){
              uniqBos=String.valueOf(str1.charAt(i));break;

            }

            }
            return uniqBos.length()==0?"Stringde uniq karakter yoktur...":uniqBos;
        }
    }




