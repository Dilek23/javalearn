package j20_PassByValeue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        Java Pass by value bir programlama dilidir.
        Bir primitive vriable argument olarark bir metoda call edildiğinde variable degil 
        copy clone(pointer)degeri gönderilir.
        TASK-> verilen fiyat için %24 artırılmış fiyat yapan print eden metod creat et. 
        
       
         */
        double fiyat=100;
        System.out.println("metod call oncesi fiyat degeri="+ fiyat);
        fiyatArttır(fiyat);
        System.out.println("metod call sonrası fiyat="+fiyat);
    }//main
    
    public static void fiyatArttır(double bisey){
        bisey*=1.24;
        System.out.println("bisey = " + bisey);
    }

}
    

