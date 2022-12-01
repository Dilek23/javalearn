package j15_Arrays;

public class Tsk17 {
    public static void main(String[] args) {
        // sayı arrayındeki en büyük elemanı print eden kod.
/*
        int sayi[][]={{1,2,3},{9,-8},{24,10,-41}};
   int maxEleman=sayi[0][0];
        for (int i = 0; i < sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length ; j++) {
                if(sayi[i][j]>maxEleman){
                    maxEleman=sayi[i][j];

                }

            }

        }
        System.out.println(maxEleman);



 */
        int sayi[][]={{1,2,3},{9,-8},{24,10,41}};
        int maxElaman=sayi[0][0];

        for (int i = 0; i < sayi.length ; i++) {
            for (int j = 0; j <sayi[i].length ; j++) {
             if(sayi[i][j]>maxElaman){
                 maxElaman=sayi[i][j];
             }
            }
            
        }
        System.out.println("maxElaman = " + maxElaman); 
        
    }
}
