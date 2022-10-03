package j04_Aritmetikoperatorler.Task3;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		/* Soru 5:
		 * 120 yi 60 a bolunuz, sonucu 10 ile carpip 20 ile toplayiniz, cikan sonuctan 40 cikariniz.
		 */
		int first,second,third,fourth,fifth;
		Scanner sc=new Scanner(System.in);
		System.out.print("Birinci sayınızı girermisiniz");
		first= sc.nextInt();

		System.out.print("ikinci sayınızı girermisiniz");
		second= sc.nextInt();

		System.out.print("üçüncü sayınızı girermisiniz");
		third= sc.nextInt();

		System.out.print("Dördüncü sayınızı girermisiniz");
		fourth= sc.nextInt();

		System.out.print("Beşinci sayınızı girermisiniz");
		fifth= sc.nextInt();
		int sonuc = ((((first / second) * third) + fourth) - fifth);
		System.out.println("((((" + first + " / " + second + ") * " + third + ") + " + fourth + ") - " + fifth + ") = " + sonuc);
	}

}
