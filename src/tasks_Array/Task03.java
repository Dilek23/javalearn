package tasks_Array;

import java.util.Arrays;

public class Task03 {
	
	public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */

		int arr[]={1,2,3,4,5,6,7};
		int a=arr[0];
		for (int i = 0; i <arr.length-1 ; i++) {
			arr[i]=arr[i+1];

		}
          arr[arr.length-1]=a;
		System.out.println("Oluşan yeni Arrayiniz:"+Arrays.toString(arr));
	}

}
