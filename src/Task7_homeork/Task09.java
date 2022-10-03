package Task7_homeork;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen cift uzunlukta bir str giriniz :");
        String str=scan.nextLine();
        if (str.length()%2==0) {
            System.out.println("strnin ilkyarisi:" +str.substring(0,str.length()/2));
        } else {
            System.out.println("Lutfen cift uzunlukta  str giriniz :");
        }
*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen çift uzunlukta bir str giriniz:");
        String str= sc.nextLine();
        if(str.length()%2==0){
            System.out.println("str'nin ilkyarısı:"+str.substring(0,str.length()/2));
        }else System.out.println("Lütfen çift uznlukta karakter giriniz");




    }
}
