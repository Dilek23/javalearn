package Task_WhileLoop_odeveler;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("İsim ve soyisim giriniz");
		String adSoyad=sc.nextLine().trim();

		int i=0;
		String longName="";
		while (i<adSoyad.length()){
			longName+=(adSoyad.charAt(i)+" ");
			i++;
		}
		System.out.println(longName);





	}

}
