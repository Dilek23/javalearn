package Task6.tasks;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */
        Scanner input= new Scanner(System.in);
        System.out.print("Bir kelime gir: ");
        String kelime= input.nextLine();

        if (kelime.length()%2==0){
            System.out.println("Girilen kelime 2`ye tam bolunebildigi icin kelimenin yarisi alinabilir\n"+
                    (kelime.substring(0,kelime.length()/2)));
        } else {
            System.out.println("Girilen kelime 2`ye tam bolunemedigi icin kelimenin yarisi alinamaz\n" +
                    (kelime.substring(0,( kelime.length()-1) / 2)));


        }

    }
}
