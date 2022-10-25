package tasks_Array;

import java.util.Arrays;
import java.util.Scanner;

public class T04_AnagramKontrol {

	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("bir kelime giriiniz: ");
		String str=sc.nextLine();
		System.out.println("ikinci kelimeyi giriniz:");
		String str2= sc.nextLine();

		String arr1[]=str.toLowerCase().split("");
		String arr2[]=str2.toLowerCase().split("");
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println(Arrays.equals(arr1, arr2));


	}

}
