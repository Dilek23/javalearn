package d08;

public class Q02_Arrays {
    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve ortalamadan buyuk olanları yazdıran
         * lari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
       double ortalma=toplam/arr.length;
        System.out.println("ortalma = " + ortalma);

        System.out.print("ortalamadan buyuk elemanlar");
        for (int i = 0; i <arr.length ; i++) {
           if(arr[i]>ortalma){
               System.out.println(arr[i]+" ");
           }

        }

    }
}