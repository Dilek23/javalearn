package Task8;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.
		Scanner sc= new Scanner(System.in);
		System.out.print("Once tam saati girin : ");
		int saat= sc.nextInt();

		System.out.print("Mil biriminde uzunluk girin: ");
		double mil= sc.nextDouble();
		System.out.print("Kilogram cinsinde agirlik girin: ");
		double kg= sc.nextDouble();
		ceviren(saat,mil,kg);



	}
	public static void ceviren(int saat, double mil, double kg){
		int saniye=saat*3600;
		double km=mil*1.609;
        double g=kg*1000;
		System.out.println(saat+"saat="+ saniye +" "+" saniye eder."+ "\n"+mil+"mil="+ km +" "+" kilometre eder." +"\n"+kg+
				"kg="+g+" "+" gram eder.");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
