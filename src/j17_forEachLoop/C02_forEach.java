package j17_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_forEach {
    public static void main(String[] args) {
// task array elemanlarını carpımını print eden code
      int arr[][]={{2,3},{4},{5,6,7}} ;
  int carpım=1;
        for (int a[]:arr ) {
            for (int b:a ) {
           carpım*=b;

            }

        }
        System.out.println(carpım);



    }
}
