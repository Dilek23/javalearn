package j25_Encapsulation.encapsulation03;

public class Runner {
    public static void main(String[] args) {
Arac honda=new Arac("accord","siyah",-200,2012);
   Arac volvo=new Arac("s80","beyaz",2000,-2015);
   Arac haciMurat=new Arac();
   haciMurat.setModel("serce");
   haciMurat.setMotor(1300);
   haciMurat.setMotor(1974);
     haciMurat.setRenk("cücükSari");
        System.out.println("honda ne arasan var onda"+honda);
        System.out.println("haciMurat = " + haciMurat);
        System.out.println("volvo ne arasan var onda"+volvo);

    }
}
