package tasks_Array;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        int arr[] = {3, 5, 6, 1, 9, 45, 25, 4, 9, 0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(buyukTenKucuk(arr)));


    }

    private static int[] buyukTenKucuk(int[] arr) {
        int bkmi[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            bkmi[i] = arr[arr.length-i-1];

        }
        return bkmi;

    }
}