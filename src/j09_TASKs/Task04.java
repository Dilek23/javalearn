package j09_TASKs;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */
	Scanner sc=new Scanner(System.in);
		System.out.print("Lütfen bir ay giriniz:");
		String ay= sc.nextLine().toLowerCase();
		switch (ay){
			case "ocak":
			case "mart":
			case "mayıs":
			case "temmuz":
			case "agustos":
			case "ekim":
			case "aralık":

				System.out.println("girilen ay 31 gün içerir");
			break;
			case "nisan":
			case "haziran":
			case "eylül":
			case "kasım":

				System.out.println("girilen ay 30 gün içerir");
				break;
			case "şubat":
				System.out.println("yılınızı giriniz:");
				int yil= sc.nextInt();
				if (yil%4==0) {
					System.out.println("şubat ayı 29 çeker");
				} else
					System.out.println("şubat ayı 28 çeker");
				break;




		}





	}

}
