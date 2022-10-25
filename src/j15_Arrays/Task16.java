package j15_Arrays;

public class Task16 {
    public static void main(String[] args) {
       // task sayı arrayındeki son elemanların carpımı

        int sayi[][]={{1,2,3},{9,8},{24,0,4}};
        int carpm=1;
        for (int i = 0; i <sayi.length ; i++) {
         carpm*=sayi[i][sayi[i].length-1];
            }
        System.out.println(+carpm);
        }

    }

