package j23_Varargs_StringBuilder.Varargs;

public class Task03 {
    public static void main(String[] args) {
        /*
        Girilen bir sayi ile girilen Stringlerin en uzun harf sayısını carpıp print eden metod creat et
         */
        int sayi=5;
        String str1="muharrem";
        String str2="ugur";
        String str3="ebikGabık";
        /*Muharrem beyin çözümü
  ArrayList<Integer> sayi  =new ArrayList<Integer>();
        while  (sc.nextInt()!=0) {
                sayi.add(sc.nextInt());
        }
        Integer []arr=sayi.toArray(new Integer[0]);
        System.out.println("hesapla(sayi) = " + hesapla(arr));
    }  //main sonu
    public static int hesapla(Integer... sayilar) {
        int x = 0;
        for (int i = 1; i < sayilar.length; i++) {
            x += sayilar[i];
        }
        x *= sayilar[0];
        return x;
         */
        carpStringenuzn(sayi, str1, "JavaCan", str2, str3);//45

    }//main
    public  static void carpStringenuzn(int carpcksayi,String ...str){
        String enUzun="";
        for (String s:str  ) {
           if (s.length()>enUzun.length()){
               enUzun=s;
           }

        }
        System.out.println(carpcksayi*enUzun.length()+" "+enUzun);

    }




}
