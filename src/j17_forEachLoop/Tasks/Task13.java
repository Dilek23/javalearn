package j17_forEachLoop.Tasks;

import java.util.ArrayList;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
  int arr[]={3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
  ArrayList<Integer>numList = new ArrayList<Integer>();
  int sum,j,count=0;
        for (int i = 0; i < arr.length ;) {
            sum=0;
            for (j=i;j<=i+count&&j<=arr.length;j++){
                sum+=arr[j];

            }
            numList.add(sum);
            count++;
            i=j;
        }
        System.out.println(numList);
    }
}

