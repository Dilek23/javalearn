package j32_Abstract.abstact01;

public class Accord extends Honda {
    @Override
    public void motor() {//ımplement edilen abs metod
        System.out.println("Motor 2.0 turbo");
    }

    @Override
    void koltuk() {//ımplement edilen abs metod
        System.out.println("Deri koltuk ");
    }

    @Override
    void sunroof() {// ovverride edilen metod
        System.out.println("Sunroof var...");
    }

    @Override
    void kapi() {//ımplement edilen abs metod
        System.out.println("Vakumlu kapi ");

    }
}
