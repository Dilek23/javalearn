package d01;

import java.util.Scanner;

public class Q08_stringManpl {
    public static void main(String[] args) {
         /*
name1 ve name2 degiskenlerini olusturun.
name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
          e.g:
         name1= mehmet
         name2= ahmet
         Print ==> mehahmetmet
*/
        Scanner sc =new Scanner(System.in);
        System.out.println("name1");
        String name1= sc.nextLine();
        System.out.println("name2");
        String name2=sc.nextLine();
        if(name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2).concat(name2).concat(name1.substring(name1.length()/2)));
        }else {
            System.out.println("name1 cift sayılı olmadığı için yerleştiremedik");
        }





    }








}
