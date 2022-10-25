package Task_WhileLoop_odeveler;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Bir tamsayı giriniz:");
        int sayi=sc.nextInt();
		int i=1;
		while (i<11){
			System.out.println(+sayi+"x"+i+" = "+(sayi*i));
			i++;
		}

	}

}
