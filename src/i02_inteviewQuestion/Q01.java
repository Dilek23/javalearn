package i02_inteviewQuestion;

import java.util.ArrayList;

public class Q01 {
    /*
     * Verilen array deki tekrar eden sayilari, ilki haric silip, tekrarsiz
     * sayilardan olusan bir array haline getiren bir program yaziniz.
     *
     * INPUT :
     * OUTPUT : [1, 2, 3, 4, -2, 5, 6, 8, 7, 9, 10]
     * 3.yol 2. for yerine
     * Integer[]arr2=list.toArray(new Integer[0]);
        System.out.println(Arrays.toString (arr2));
     *
     */

    public static void main(String[] args) {
        /*
        int[]arr={1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10};
        ArrayList<Integer>list= new ArrayList<>()  ;
        for (int i = 0; i <arr.length ; i++) {
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }

        }
        System.out.println("list = " + list);
int[] tekrarsiz=new int[list.size()];
        for (int i = 0; i < list.get(i) ; i++) {
            tekrarsiz[i]= list.get(i);
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println();


        //2. yol Hashset ile çözüm
        HashSet<Integer>liste=new HashSet<Integer>(Arrays.asList(1,2,2,3,1,4,2,-2,5,6,8,7,5,6,-2,9,3,10));

        System.out.println("liste = " + liste);

         */
        int[] arr = {1, 2, 2, 3, 1, 4, 2, -2, 5, 6, 8, 7, 5, 6, -2, 9, 3, 10};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
           if(!list.contains(arr[i])){
               list.add(arr[i]);
           }

        }
        System.out.println(list);
    }
}
