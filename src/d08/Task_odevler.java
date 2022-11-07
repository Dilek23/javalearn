package d08;

public class Task_odevler {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */
        int arr[][] = {{0, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};
        int min = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        System.out.println("min = " + min);

        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int arr1[][] = {{1, 3, 6}, {2, 8}, {5, 7, 9, 14}};
        int toplam = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] % 2 == 0) {
                    toplam += arr1[i][j];
                }


            }
        }

        System.out.println(" çift sayıların toplamı = " + toplam);


    }


    }

            
      
        



                /*
                 *  String 2D array olustur
                 *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
                 *  String de $ varsa 3.2 ile carp
                 *  String de € varsa 4.2 ile carp
                 *  elemanlarin toplamini double olarak yazdir
                 */



