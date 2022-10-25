package Task_WhileLoop_odeveler;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		/*
		 task->girilen bir metinde harf rakam ve özel karakter sayısını print eden code create ediniz.
		do-While loop
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Bir metin  giriniz : ");
		String metin = sc.nextLine();
		/*
		int countHarf = 0;
		int countRakam = 0;
		int countOzel = 0;
		int i = 0;
		do {
			if ((metin.charAt(i) >= 'A' && metin.charAt(i) <= 'Z') || (metin.charAt(i) >= 'a' && metin.charAt(i) <= 'z')) {
				countHarf++;

			} else if ((metin.charAt(i) >= '0' && metin.charAt(i) <= '9')) {
				countRakam++;
			} else countOzel++;
			i++;
		} while (i < (metin.length()));

		System.out.println("Girdiğiniz metinde: " + countHarf + " tane harf,  " + countRakam + " tane rakam ve  " + countOzel + " tane özel karakter vardır.");
*/
		int harfSaysı=0;
		int rAkamSayi=0;
		int ozlKRatkter=0;

		int i=0;
		do {
			if(metin.charAt(i)>'A'&&metin.charAt(i)<'Z'||metin.charAt(i)>'a'&&metin.charAt(i)<'z'){
				harfSaysı++;
			} else if (metin.charAt(i)>='0'&&metin.charAt(i)<'9') {
				rAkamSayi++;

			}else ozlKRatkter++;
        i++;

		}while (i<(metin.length()));
		System.out.println("Girdiginiz metinde ="+harfSaysı+" tane harf , "+rAkamSayi+" tane rakam, "+ozlKRatkter+"  özel karakter vardır.");



	}

}
