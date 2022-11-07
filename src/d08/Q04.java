package d08;

public class Q04 {
    public static void main(String[] args) {
        /*
       /*
 * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini //
 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
 * istenenToplam=9;
 */
        int[] arr= {5,7,-6,4,2,15,3,8,1};
       int istenentoplam=9;
      toplamDokuz(arr,istenentoplam);


    }

    private static void toplamDokuz(int[] arr, int istenentoplam) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
             if(arr[i]+arr[j]==istenentoplam){
                 System.out.println(arr[i]+"ve "+arr[j]+" toplamı="+istenentoplam);
             }
            }
        }


    }
}
