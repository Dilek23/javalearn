package Task6.tasks;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.print("LÜtfen bir cümle yazınız:");
       String bosluk= " ";
       String cumle= sc.nextLine();
       if(cumle.contains(bosluk)){
           System.out.println("Cumlede boşluk var");
       }else System.out.println("boşluk bırakılmamış");



    }
}

