package d01;

import java.util.Scanner;

public class Q06_SwitchCAse {
    public static void main(String[] args) {
      /*
      * Kullanicidan ilk 3 buyuk harfden biri secildiginde cumle yazdiran kod yaziniz (switch case kullanin)
      * ornek
      *  Kullanici  : A , B , C harflerinden birini secsin
          A'yi secmis ise, ==> Java is easy
          B'yi secmis ise, ==> Java is fun
          C'yi secmis ise, ==> I need to study :)
      */

        Scanner sc=new Scanner(System.in);
        System.out.println("lütfen harflerden biriniz seciniz:\nA \nb \nC");
        char choice=sc.next().toUpperCase().charAt(0);
          switch (choice){
              case 'A':
                  System.out.println("Java is easy");
                  break;
                case 'B':
                  System.out.println("Java is fun");
                  break;
              case 'C':
                  System.out.println("I need tu study");
                  break;



          }





    }
}
