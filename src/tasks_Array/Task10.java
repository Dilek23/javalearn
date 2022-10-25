package tasks_Array;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        int arr[] = {1, 2, -3, 4, -5, -6};
        System.out.println(Arrays.toString(negatifpozitif(arr)));
    }
    public static int[] negatifpozitif(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] *= -1;
        }
        return arr;

    }
    }
