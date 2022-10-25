package Tasks_Arrayeasy;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */
String strarr[][]={{"new jersey","atlanta","ohio"} , {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}};
        for (int i = 0; i < strarr.length; i++) {
            for (int j = 0; j <strarr[i].length ; j++) {
                if(strarr[i][j]=="ohio"){
                    strarr[i][j]="Florida";
                }


            }
        }
        System.out.println(Arrays.deepToString(strarr));
    }
}

