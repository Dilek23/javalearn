package day08;

public class Task_odevler {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */
        int arr[][] = {{0, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};
          int min=arr[0][0];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               if(arr[i][j]<min){
                   min=arr[i][j];
               }
            }
        }
        System.out.println("min = " + min);
    }
}
            
      
        



                /*
                 *  String 2D array olustur
                 *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
                 *  String de $ varsa 3.2 ile carp
                 *  String de € varsa 4.2 ile carp
                 *  elemanlarin toplamini double olarak yazdir
                 */

        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */
    

