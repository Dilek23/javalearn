package j15_Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {
// task arr tum elemanlarını toplayan code creat ediniz.
 /*
        int arr[][] = {
                {1, 2, 3}, //0. kat
                {10, 20}, //1. kat
                {101}//2. kat
        };//3 katlı apt
        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
              toplam+=arr[i][j];

            }

        }
        System.out.println("arr deki elemanlar toplamı = "+toplam);


  */
        /*
        int arr[][] = {  {1, 2, 3},   {10, 20},  {101}};
        int toplam =0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+= arr[i][j];

            }


        }
        System.out.println(" arr'deki elemanların toplamı toplamı = " + toplam);
        
         */
        int arr[][] = {  {1, 2, 3},   {10, 20},  {101}};
        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];
                
            }
            
        }
        System.out.println("toplam = " + toplam);
    }
}
