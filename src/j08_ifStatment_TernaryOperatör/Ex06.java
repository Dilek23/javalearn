package j08_ifStatment_TernaryOperatör;

import java.util.Scanner;

public class Ex06 {
    /*
    TASK->TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
      kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
      kontrol edip kalan yıl ve prim gununu print eden code create ediniz(yas ve prim bağımlı olduğu için iç içe


     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("cinsiyetiniz \n KADIN için-> K\n ERKEK için-> E\n giriniz : ");
        char cnsyt=sc.next().charAt(0);
        System.out.println("yaşınızı giriniz:");
        int yas= sc.nextInt();
        if(cnsyt=='K'){
            if(yas>=60){
                System.out.println("prim gününüzü giriniz:");
                int primGüunu= sc.nextInt();
                if(primGüunu>6000){
                    System.out.println("TEBRİKLER emekli oldunuz:)");

                }else System.out.println("emekliliğiniz için:"+(6000-primGüunu)+"yatırmanız lazım");

            }else System.out.println("emekliliğinize daha:"+(60-yas)+"yıl daha var");

        } else if (cnsyt=='E') {
            if(yas>65){
                System.out.println("prim gününüzü giriniz:");
                int primGüunu= sc.nextInt();
                if(primGüunu>7000){
                    System.out.println("TEBRİKLER emekli oldunuz:)");

                }else System.out.println("emekliliğiniz için:"+(7000-primGüunu)+"yatırmanız lazım");

            }else System.out.println("emekliliğinize daha:"+(65-yas)+"yıl daha var");




        }else System.out.println("cinsiyetinizi yanlış girdiniz");

    }

        }

