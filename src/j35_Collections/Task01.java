package j35_Collections;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {
        /*
        Deger taması yapılan array'i ArrayListe ceviren method creat ediniz . main içerisinide metodun
        return ettiği Arrlist hashset ,linkedHashSet ve teeSett e atayınız
         */
        String arr[]={"Muharrem", "Umit","Sinan","Nihan"};
        arrayListeCEvir(arr);

        HashSet<String >hs=new HashSet<String>(arrayListeCEvir(arr));
        LinkedHashSet<String>lhs=new LinkedHashSet<String>(arrayListeCEvir(arr));
        TreeSet<String>ts=new TreeSet<String>(arrayListeCEvir(arr));
        System.out.println("hurra set :"+hs);//hurra set :[Muharrem, Sinan, Nihan, Umit] rastgele sıraladı

        System.out.println("erken gelen girer set :"+lhs);//[Muharrem, Umit, Sinan, Nihan] ilk geleni sırayla lıar

        System.out.println(" alfabetik sıyarla ts = " + ts);// alfabetik sıyarla ts = [Muharrem, Nihan, Sinan, Umit]
    }//main sonu

    private static ArrayList <String> arrayListeCEvir(String[] arr) {
        ArrayList<String>strArr=new ArrayList<String>(Arrays.asList("Muharrem", "Umit","Sinan","Nihan"));
        System.out.println();

        return strArr;
    }


}


