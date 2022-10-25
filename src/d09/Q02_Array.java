package d09;

import java.util.Arrays;

public class Q02_Array {
    public static void main(String[] args) {
        /*
         *  Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         *  Cumle: Verilen bir cumledeki bosluklar haric character sayisini bulunuz.
         */
       String str="Verilen bir cumledeki bosluklar haric character sayisini bulunuz.";
        String[]arr=str.replace(" ","").split("");
        System.out.println("arr.length = " + arr.length);
        // 2.yol
        System.out.println(str.replace(" ", "").length());
    }
}
