package P05_KahveMakinesi;

public class Urun {
 double kraker=2.5;
 double cips=2.2;
 double cocaCola=2.2;
 double fanta=2.0;
 double su=1.0;
 double cay=1.5;
 double filtreKahve=1.99;
 int productNum;
 double price;


 public Urun(){

 }

    public Urun(double kraker, double cips, double cocaCola, double fanta, double su, double cay, double filtreKahve, int productNum, double price) {
        this.kraker = kraker;
        this.cips = cips;
        this.cocaCola = cocaCola;
        this.fanta = fanta;
        this.su = su;
        this.cay = cay;
        this.filtreKahve = filtreKahve;
        this.productNum = productNum;
        this.price = price;
    }

}
