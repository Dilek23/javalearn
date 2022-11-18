package j32_Abstract.abstact01;

public class Crv extends Honda{
    @Override
    public void motor() {
        System.out.println("2.4 Super Turrbo motor");
    }

    @Override
    void koltuk() {
        System.out.println("deri koltuk ");

    }

    @Override
    void kapi() {
        System.out.println("vakumlu kapilar 5 adet");

    }
}
