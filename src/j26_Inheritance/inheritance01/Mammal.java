package j26_Inheritance.inheritance01;

import j26_Inheritance.inheritance01.Hayvancik;

public class Mammal extends Hayvancik {// hayvancık parentin child classı çocugu
    public Mammal() {// parametresiz cons.
        System.out.println("Hayvancik mammal  parametresiz constructor...");

    }
    public void sutBeslenme() {
        System.out.println("bebeleri süt ile beslenir...");
    }
    public void dogum(){
        System.out.println("yavrusu olur...");
    }

}
