package d08;

import java.util.Arrays;

public class Q03_Arrays {
    public static void main(String[] args) {
        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */
        String ciri[]={"HeySiri"};
        System.out.println(Arrays.toString(ciri));
        for (int i = 0; i < ciri.length; i++) {
            System.out.println(ciri[i].replace("Hey","Bye"));

        }

   // 2.yol
        String str1="HeySiri";
        String yeniStr[]=str1.split("y");
        yeniStr[0]="bye";
        str1=yeniStr[0]+ yeniStr[1];
        System.out.println("str1="+str1);
        String arr2[]=new String[1];
        arr2[0]=str1;
        System.out.println(Arrays.toString(arr2));
    }
}
