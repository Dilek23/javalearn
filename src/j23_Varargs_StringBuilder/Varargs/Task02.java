package j23_Varargs_StringBuilder.Varargs;

public class Task02 {
    public static void main(String[] args) {
        /*
        girilen ilk sayı hariö digerlerini toplayan ve toplam ile ilk sayıyı carpan metod creat ediniz
         */
        System.out.println("toplaCarp(2,24,23,38,34) = " + toplaCarp(2, 24, 23, 38, 34));
    int arrtp[]={24,23,38,34};
        System.out.println("toplaCarp(2,arrtp) = " + toplaCarp(2, arrtp));
    }//main
public static int toplaCarp(int carpilacaksayi,int...toplanacaksayi){
        int toplam=0;
        for (int a:toplanacaksayi){
            toplam+=a;
        }
   return  carpilacaksayi*toplam;
}



}
