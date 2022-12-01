package j12_Loops.L01_ForLoop.Taskodevler_forloop;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method create ediniz
		 */

		Scanner sc=new Scanner(System.in);
		System.out.println("lütfen bir cumle giriniz");
		String cumle=sc.nextLine();
		int rakam=0;
		for(int i=0;i<cumle.length();i++){
			if (cumle.charAt(i)>='0'&&cumle.charAt(i)<='9'){
			rakam++;
			}
		}
		System.out.println("Girilen cumlede "+rakam+ " tane rakam vardir...");

	}
}
