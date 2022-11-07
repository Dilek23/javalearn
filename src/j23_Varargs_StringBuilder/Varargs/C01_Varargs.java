package j23_Varargs_StringBuilder.Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
        /*
        VARARGS :
        var----variety cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        meyhod budy....
        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISS
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli
         */

        // Task -> verilen iki toplamını print eden METHOD create ediniz
enUzunKlime("tugba","zeyd","hadiordan");
        int sayi1=24;
        int sayi2=27;
        int sayi3=46;
        int sayi4=10;

        topla(sayi1,sayi2);
        topla(sayi1,sayi3);
        topla(sayi1,sayi4);
        toplaVarargs(44,23,62,sayi1,sayi3);
        toplaVarargs(sayi2,sayi3);

    }//main sanu
    public static void topla(int a,int b){
        System.out.println("sayilar toplaamı= "+(a+b));

    }
    public static void topla(int a,int b,int c){

        System.out.println("sayilar toplaamı= "+(a+b+c));


    }
    public static void toplaVarargs(int...a){
        int toplam=0;
        for (int w:a   ) {// varargs paramere arr içide tanımladıgı için toplam for riçine girlir
          toplam+=w;

        }
        System.out.println("sayıların toplamı="+ toplam);

        // Task-> verilen stringlerin en fazla karakter karaktere sahip olanı print eden Metod creat et.(parametre sayısı belirli degilse varargs)




    }
    public  static void enUzunKlime(String...str){// varags da cok data oldguu için liste olur
        String enUzun="";
        for (String s:str) {
            if(s.length()>enUzun.length()){
            enUzun=s;
            }
        }
        System.out.println("en Uzun kelime = " + enUzun);
    }




}
