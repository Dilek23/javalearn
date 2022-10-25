package d09;

public class Q01_Array {
    public static void main(String[] args) {

//Type a method to check if an int Array is symmetrical or not.

      int arr[]={1,2,3,2,1};
        System.out.println("simetrikMi(arr) = " + simetrikMi(arr));


    }

    private static boolean simetrikMi(int[] arr) {
        boolean flag=false;
        for (int i = 0; i <arr.length ; i++) {
if(arr[i]==arr[arr.length-1-i]){
    flag=true;
}else flag=false;
break;
        }
        return flag;
    }
}
