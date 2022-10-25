package d10;

import java.util.Scanner;

public class C2_MathClassMatrix {
    public static void main(String[] args) {
        /*
Ask user to enter a number and print on console number by number matrix.

Example:
Input: 10

Output:
1 0 0 1 1 0 0 0 1 1
0 0 1 0 1 0 1 0 0 0
0 1 0 1 0 0 0 0 0 1
1 1 1 0 0 0 0 1 1 1
1 1 0 1 1 1 0 1 0 0
1 0 0 0 1 1 0 0 0 0
0 0 1 0 0 0 0 1 1 1
1 1 0 1 0 1 0 0 1 0
0 0 1 0 0 0 0 1 1 0
1 1 1 0 0 1 1 1 1 0

*/
        Scanner sc=new Scanner(System.in);
        System.out.println("boyutu giriniz:");
        int sayi= sc.nextInt();
        for (int i = 0; i <sayi ; i++) {
            for (int j = 0; j <sayi ; j++) {
                System.out.print((int)(Math.random()*2)+" ");// 0 ile 1 rasında 2 tane sayı arasından sececegi için * 2 dedik

            }
            System.out.println();
        }

    }
}
