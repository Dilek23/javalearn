package d06;

public class Q02_Forloop {
    public static void main(String[] args) {
        //Interview Question
// 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.
   //     System.out.println("*** for***");
   //
   //     for(int i=0;i<256;i++){
   // char karakter=(char)i;
   //         System.out.println(i+"->"+karakter);

    //   System.out.println("*** While ile***");
    //   int i=0;
    //   while (i<=255){
    //       char c=(char)i;
    //       System.out.println(i+"->"+c);
    //       i++;
    //   }
        System.out.println("do while");
        int x=0;
do{
    char k= (char) x;
    System.out.println(x+"->"+k);
    x++;
}while (x<=255);

    }
}
