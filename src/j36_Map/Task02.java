package j36_Map;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        /*
        Task ->
         Key:isim ,email,adres,telefon
         Key2lere ait valueeleri depolayan bir kartvizit  map ve isim Key'e kartvizit map'i value tanımlayan farklı bir map tanımlayıp
         print eden code create ediniz
         */


//semihMap.get(isim) = Semih Nerde
//        semihMap.get(telefon) = 0 532 230000
//        ismailKartvizit.get(isim) = İsmail Demir
//        ismailKartvizit.get(telefon) = 0 546 450000
//        semih in telefonu = 0 532 230000
//        ismail in bilgileri = {telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}
//        kartvizitler = {ismail={telefon=0 546 450000, adres=Amsterdam/Hollanda, email=ismail@gmail.com, isim=İsmail Demir}, semih={telefon=0 532 230000, adres=Frkanfurt/Almanya, email=Semih@hotmail.com, isim=Semih Nerde}}

        HashMap<String,String>krtvzt1=new HashMap<>();
        krtvzt1.put("İsim","Yunus");
        krtvzt1.put("email","Yunus@gmail");
        krtvzt1.put("adres","Elazıg");
        krtvzt1.put("telefon","232323");
        System.out.println("krtvzt1 = " + krtvzt1);

        HashMap<String,String>krtvzt2=new HashMap<>();
        krtvzt2.put("İsim","Yasin");
        krtvzt2.put("email","Yasin@gmail");
        krtvzt2.put("adres","Ankara");
        krtvzt2.put("telefon","060606");
        System.out.println("krtvzt2 = " + krtvzt2);
        System.out.println("*******");

        HashMap<String,HashMap<String,String>>krtvtList=new HashMap<>();
        krtvtList.put("Yunus",krtvzt1);
        krtvtList.put("Yasin",krtvzt2);
        System.out.println("krtvtList = " + krtvtList);

        System.out.println("krtvtList.get(\"Yasin\").get(\"telefon\") = " + krtvtList.get("Yasin").get("telefon"));
        Map<Integer,Kartvizit>krtv=new HashMap<>();
        Kartvizit k1=new Kartvizit("enise","ens@gmail","232332","goo",2323);
        krtv.put((k1.id), k1);
        System.out.println("krtv = " + krtv);
        System.out.println("krtv.get((k1.id)) = " + krtv.get((k1.id)));
    }

}

