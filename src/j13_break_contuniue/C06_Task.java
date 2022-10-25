package j13_break_contuniue;

import java.util.Scanner;

public class C06_Task {
    public static void main(String[] args) {

        //girilen bir ifadedeki c krakterine kadar a karakter sayısnı print eden cod?

        Scanner sc=new Scanner(System.in);
        System.out.println("birmetin giriniz");
        String metin=sc.nextLine();
        int aSayısı=0;
        for(int i=0;i<metin.length();i++){
          if(metin.charAt(i)=='a'){
              aSayısı++;
        }else if(metin.charAt(i)=='c'){
              break;
          }
            System.out.println("döngude işleme giren karakterler " +metin.charAt(i));
        }

        System.out.println("metindeki a sayısı:"+aSayısı);
    }
}
