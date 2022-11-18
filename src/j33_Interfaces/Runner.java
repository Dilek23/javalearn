package j33_Interfaces;

public class Runner {
    public static void main(String[] args) {
          Sahin dgshn=new Sahin();
          dgshn.ebat();
          dgshn.jant();
          dgshn.kapi();
          dgshn.kaporta();
          dgshn.klima();
          dgshn.koltuk();
          dgshn.motor();
        System.out.println("dgshn.sisLAmp() = " + dgshn.sisLAmp());// defaultconc. metod obj ile call edildi
          dgshn.sunroof();
          dgshn.yakit();
        System.out.println("dısDonanım.RENK = " + dısDonanım.RENK);
        System.out.println("icDonanım.RENK = " + icDonanım.RENK);
        System.out.println("icDonanım.KUMAS = " + icDonanım.KUMAS);// final variable atama yapılmaz kumas="deri" olarak degzmez
        System.out.println("Lastik.RENk = " + Lastik.RENk);
        System.out.println("icDonanım.MUSIC = " + icDonanım.MUSIC);
        dısDonanım.anten();// static conc. metod ınterface name call edildi
    }
}
