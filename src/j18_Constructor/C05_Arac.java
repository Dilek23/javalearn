package j18_Constructor;

public class C05_Arac {
    // Fields-> objenini uretilirken alacagı deger variablas
     /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()" kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */
    int maxHız;
    String model;

    public C05_Arac(int maxHız) {// 1 parametreli cons.
        this(180,"haciMurat");
        this.maxHız = maxHız;// this yoksa instence variable baglanmaz
        System.out.println("Bu sefer bir parametreli cons. calıştı");
    }

    public C05_Arac() {// parametresiz cons.
    }

    public C05_Arac(int maxHız, String model) {// 2 parametreli cons.

        this.maxHız = maxHız;
        this.model = model;
        System.out.println("bu yazıyı okuduysan 2 parametreli con. call edildi");
    }

    public C05_Arac( String model,int maxHız) {// 2 parametreli ancak sıraları farkllı cons..
        this.maxHız = maxHız;
        this.model = model;
        System.out.println("bu yazıyı okuduysan 2 parametreli con. call edildi");
    }

}
