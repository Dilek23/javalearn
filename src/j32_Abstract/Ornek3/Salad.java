package j32_Abstract.Ornek3;

public abstract class Salad extends Food {
    public abstract void madeIn();

    @Override
    public void taste() {
        System.out.println("çoban,sogus,gavurdagi:)");
    }
}
