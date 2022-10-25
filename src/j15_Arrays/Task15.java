package j15_Arrays;

public class Task15 {
    public static void main(String[] args) {
        // arr elemanlarının çarpımını yazınız.
        int sayi[][]={{1,2,3},{9,8}};
        int carpım=1;
        for (int i = 0; i <sayi.length ; i++) {
            for (int j = 0;j<sayi[i].length ; j++) {
                carpım*=sayi[i][j];

            }

        }

        System.out.println(+carpım);

    }
}
