package j09_TASKs;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// VIP (Very Important Person) kisaltmasinda harflerin kelime karşılığını print eden code create ediniz
 Scanner sc=new Scanner(System.in);
		System.out.print("Lütfem 'VIP' kelimesinin harflerinden birini giriniz:");
		String harf= sc.nextLine().toUpperCase();
		switch (harf){
			case "V":
				System.out.println("Very\t"+ "kelimesinin kısaltmasıdır.");
				break;

			case "I":
				System.out.println("Important\t"+"kelimesinin kısaltmasıdır.");
				break;
			case "P":
				System.out.println("Person\t"+"kelimesinin kısaltmasıdır.");
				break;
			default:
				System.out.println("Yanlış bir harf girdiniz");
		}





	}
}
