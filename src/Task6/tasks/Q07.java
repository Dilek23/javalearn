package Task6.tasks;

        import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */
        Scanner sc=new Scanner(System.in);
        System.out.print("LÜtfen 3 harften oluşan bir isim giriniz:");
        String kelime= sc.next();
        if(kelime.length()!=3){
            System.out.println("girdiğiniz kelim gecerli değildir");
        }else {


            char birinciKrktr = kelime.charAt(0);
            char iKinciKrktr = kelime.charAt(1);
            char ucuncuKrktr = kelime.charAt(2);
            boolean sonuc = (birinciKrktr != iKinciKrktr && birinciKrktr != ucuncuKrktr && iKinciKrktr != ucuncuKrktr) ? true : false;
            System.out.println(sonuc);
        }

    }
}