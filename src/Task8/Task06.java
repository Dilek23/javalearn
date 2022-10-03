package Task8;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("paralelkenar,dikdortgen veya ücgen kelimelerinden birini secin:");
		String secim= sc.nextLine();
		System.out.print("Bir sayı seçin:");
		int sayi1= sc.nextInt();
		System.out.print("bir sayi daha secin:");
		int sayi2=sc.nextInt();
		System.out.print(" üçüncü bir sayi daha secin:");
		int sayi3=sc.nextInt();
if(secim.equalsIgnoreCase("paralelkenar")){
	ParalelknrALancevrebul(sayi1,sayi2);
} else if(secim.equalsIgnoreCase("dikdortgen")){
	dikdortgenCevreBul(sayi1,sayi2);

} else if (secim.equalsIgnoreCase("üçgen")) {
	üçgencevrealanbul(sayi1,sayi2,sayi3);
}

	}

	private static void üçgencevrealanbul(int a, int b, int c) {
		int alan=(a*b)/2;
		int cevre=(a+b+c);
		System.out.println("üçgenin alanı="+alan+"\n"+"üçgenin cevresi="+cevre);

	}

	private static void dikdortgenCevreBul(int c, int d) {
		int alan=(c*d);
		int cevre=2*(c+d);
		System.out.println("dikdortgen alanı="+alan+"\n"+"dikdortgen cevre="+cevre);

	}




	private static void ParalelknrALancevrebul(int a, int b) {
	int alan=(a*b);
	int cevre=2*(a+b);
		System.out.println("paralelKnr alanı="+alan+"\n"+"PararlelKnr cevre="+cevre);
	}







}
