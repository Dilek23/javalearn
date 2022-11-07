package j26_Inheritance.inheritance02;

public class Hayvancik {// grand parent super class
    public Hayvancik(){// parametresiz con.
        System.out.println("Hayvancik parametresiz constructor...");

    }
    public Hayvancik(int i){// parametreli
        System.out.println("Hayvancik parametresiz constructor...");

    }
    public  void mA() {
        System.out.println("mA -> HAYVANCIK clssdan  metod call");

    }

    public  void mM(){
        System.out.println("mM -> HAYVANCIK clssdan metod call");
    }
 int a;
    int m=3;
}
