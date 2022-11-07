package j26_Inheritance.inheritance02;

public class Mammal extends Hayvancik {// hayvancık parentin child classı çocugu
    public Mammal() {// parametresiz cons.
        this('Y');// bu classda p.li cons. call edildi
        System.out.println("Hayvancik mammal  parametresiz constructor...");

    }
    public Mammal(char c) {
        super(17);
        System.out.println("Mamal parametreli cons.");
    }
    public void mC(){
        System.out.println("mC ->Mammal method call");
    }
int m=1;
    int c=4;

    @Override
    public void mM() {

        System.out.println("mM-> mammal class method call");
    }
}// class
