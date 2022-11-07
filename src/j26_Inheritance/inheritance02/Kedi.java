package j26_Inheritance.inheritance02;

public class Kedi extends Mammal {// Mammal parent clss  Kedi child-torun
    /*
    child class obj olmadan parent class variable ve metodlara ulaşabilir...
     */
    public Kedi(){// parametresiz cons.
        super();
        System.out.println(" kedi parametresiz cons.");
    }
    public void tırmalar(){
        System.out.println("Keedi tırmalar...");
    }
    public Kedi(String str){// parametresiz cons.
        this();// bu classın parametresiz cons.
        System.out.println(super.c);
        System.out.println(" kedi parametresiz cons.");
    }
int c=2;
    int d=5;

    @Override
    public void mC() {// Mammml paretten ezen metod
        System.out.println("mC-> kedi classdan call edildi..");
    }
}//
