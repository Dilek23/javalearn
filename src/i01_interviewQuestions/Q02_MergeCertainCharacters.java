package i01_interviewQuestions;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    public static void main(String[] args) {


        /*
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay

         */
      /*  Scanner sc = new Scanner(System.in);
        System.out.print("String bir ifade giriniz:");
        String str = sc.nextLine();
        System.out.print("Bir sayi giriniz:");
        int sayi= sc.nextInt();

        System.out.println("ilkSonHarf(str,sayi) = " + ilkSonHarf(str, sayi));


    }

    private static String ilkSonHarf(String str, int sayi) {
        String istenen=str.substring(0,1)+str.substring(str.length()-1);
        String output="";
        for (int i = 0; i <sayi ; i++) {
        output+=istenen;
        }
        return output;
    }


}
/*
2.Yol

 public static String ilkSonHarfler(String s,int a){
        String yeni=(s.substring(0,1)+s.substring(s.length()-1)).repeat(a);
        return yeni;
    }
 */

        Scanner sc= new Scanner(System.in);
        System.out.print("Bir kelime giriniz :");
        String s=sc.nextLine();
        System.out.print("Bir sayi giriniz ");
        int sayi= sc.nextInt();

        System.out.println("ilkSonHarf(s,sayi) = " + ilkSonHarf(s, sayi));

    }

    private static String ilkSonHarf(String s, int sayi) {
       String nEw=(s.substring(0,1)+s.substring(s.length()-1)).repeat(sayi);
       return nEw;


    }
}