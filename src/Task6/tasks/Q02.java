package Task6.tasks;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Task-> girilen e-mail heabını @gmail.com icermiyorsa "lütfen gmail hesbı giriniz.
        // @gmail.com ile bitiyorsa "hesabınız onaylandı aksi durumda gecerli hesap giriniz print eden code creat ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.print("LÜtfen e-mail hesabınızı girin:");
        String email= sc.nextLine();
        if(email.contains("@gmail.com")) {
            System.out.println("email hesabınız onaylandı = " + email);
        } else System.out.println("Lütfen gmail hesabı giriniz...");




    }


}
