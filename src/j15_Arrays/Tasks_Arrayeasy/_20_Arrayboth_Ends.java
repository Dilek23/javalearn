package j15_Arrays.Tasks_Arrayeasy;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
int sayiarr[]={1,2,3,4};
int yeni[]=new int[2];
        for (int i = 0; i < sayiarr.length ; i++) {
            if(i==0){
                yeni[0]=sayiarr[i];
             if(i==sayiarr.length-1){
              yeni[1]=sayiarr[i];
             }
            }

        }
        System.out.println(Arrays.toString(yeni));


    }
}