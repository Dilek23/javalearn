package L01_ForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        eğer bir dongunun boody'sinde başka bir dongu buluuyorsa bu tur döngulere nestedloop içiçe döngü denir.
        iç döngü dış dpngunun her adımında tekrar calısır.iç içe dongulerde en içteki dongu en önce calısır.
         */
        for(int apt=0; apt<=10;apt++){
            System.out.println("Apt döngü:" +apt);
           for(int daire=1; daire<6;daire++){
               System.out.println("apt"+apt+"için iç döngu daire:"+daire);
           }

        }


    }
}
