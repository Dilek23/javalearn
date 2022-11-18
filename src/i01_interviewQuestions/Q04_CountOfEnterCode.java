package i01_interviewQuestions;

import java.util.Objects;
import java.util.Scanner;

public class Q04_CountOfEnterCode {
        // STRING OLAN PIN kodunuzu kontrol eden bir kod yazınız.
        public static void main(String[] args) {
/*
            String pin="tugba1234";
            int girisHakki=4;
            Scanner sc= new Scanner(System.in);

            while (true){
                System.out.print("Pin gir:");
                String girilenPin= sc.nextLine();
                if(pin.equals(girilenPin)){
                    System.out.println("Pin doğru...");
                    break;
                }else{
                    System.out.println("pin yanlışşşş");
                    girisHakki--;
                    System.out.println("Kalan giriş hakknız: "+girisHakki);

                }if(girisHakki==0){
                    System.out.println("giriş hkkınız kalmadı bloke oldu...");
                    break;
                }

            }


 */
            String pin="tugba1234";
            int girisSayisi=3;
            Scanner scanner=new Scanner(System.in);
            while (true){
                System.out.print("Pin'i giriniz:");
                String girilen= scanner.nextLine();
                if(pin.equals(girilen)){
                    System.out.println("Doğru pin girdiniz...");
                    break;
                }else {
                    System.out.println("Yanlış pin girdiniz!!!");
                    girisSayisi--;
                    System.out.println("kalan giriş hakkınız : "+girisSayisi);
                }
                if(girisSayisi==0){
                    System.out.println("hakkınız kalmadı kart bloke!!!");
                    break;
                }
            }



        }

}
