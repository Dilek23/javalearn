package j14_Scope;

public class C04_LocalVariable {
    public static void main(String[] args) {
        int yas=33;//main metod local
        System.out.println("yas="+yas);
        for (int i = 0; i <7 ; i++) {// for loop bşı
            System.out.println(yas+"  :) ");// yas local variable aynı lokalecall edildi

        }//for sonu
        // local dışı call edilmez
        yas=35;
    }//main sonu
    // yas=48;local dısı call edilmez
}
