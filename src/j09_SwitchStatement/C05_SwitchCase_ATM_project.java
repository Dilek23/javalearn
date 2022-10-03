package j09_SwitchStatement;

import java.util.Scanner;

public class C05_SwitchCase_ATM_project {
    public static void main(String[] args) {
   /*
   Bakiye (baslangıç bakiyesi 1000tl) öğrenme,para yatırma ve çekme çıkış işlemlerinin yapıldığı bir ATM
    */
        Scanner sc = new Scanner(System.in);
        System.out.print("***");
        System.out.println("***ATM'ye  hoşgeldiniz***");


        System.out.println("Bakşye ögrenme->1\nPara yatırma->2\n Para çekme->3\nÇıkış->4\nGiriniz:");
        int seçim = sc.nextInt();

        int bakiye=1000;
        switch (seçim){
            case 1:
                System.out.println("bakiyeniz:"+bakiye);

                break;
            case 2:
                System.out.println("ne kadar para yatıracaksınız:");
                int yatılnpara= sc.nextInt();
                bakiye+=yatılnpara;
                System.out.println("Bakiyenizin son hali:"+bakiye);
            break;

            case 3:
                System.out.println("çekmek istediğiniz miktarı girin:");
                int cekilenMiktar= sc.nextInt();
                if( cekilenMiktar>bakiye){
                    System.out.println("bakiyeniz yetersiz");
                }else {
                    bakiye-=cekilenMiktar;
                    System.out.println("bakiyenin guncel hali:"+bakiye);
                }

                break;

            case 4:
                System.out.println("çıkışınız yapıldı");

        break;
            default:
                System.out.println("Hatalı seçimgirdiniz");

        }






    }
}
