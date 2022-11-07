package d12;

public class C01_TemelBilgilerPrintf {
    //https://www.digitalocean.com/community/tutorials/java-printf-method. biiçmlendirme secenekleri sunan
    public static void main(String[] args) {
        int sayi = 753;
        String str = "Bootcamp Clarusway";
        double db = 3.89563056;
        System.out.println(sayi+"-"+str+"-"+db);// normalde soutla yazılmış şekli
        //753-Bootcamp Clarusway-3.89563056
        System.out.printf("sayi:%d,str:%s,db:%f\n",sayi,str,db);
        //sayi:753,str:Bootcamp Clarusway,db:3,895631

        System.out.printf("sayi:%d,str:%S,db :%f\n",sayi,str,db);
        //sayi:753,str:BOOTCAMP CLARUSWAY,db :3,895631

        System.out.printf("sayi:%10d,str :%-20.10S,db :%-5.3f\n",sayi,str,db);
//sayi:       753,str :BOOTCAMP C          ,db :3,896
        // %10d 10 hanelik yer ayır demek
        //%-20.10s-> sola yaslayarak 20 birimlik kapasite ver String ifadeyi buyk harf ile ilk 10 krktr yazdır.
        // %-5.3f-> sola yaslayarak 5 birimilik kapasite ver ve virgülden sonra 3 hane yazdır(- sola yaslar)
        // %S buyk harfle yazdırır.
// %x x kapasite %y y karakter saıysı
        System.out.printf("sayi: %-10d,str:%-8.8s,db:%07.4f",sayi,str,db);
        // - eksi sola yaslar
    }
}