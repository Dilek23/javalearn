package j32_Abstract.ornek2;

public class Cember extends Sekil{

    private double yaricap;
    private final double pi=3.14;

    public Cember(double yaricap) {// p.li cons.

        this.yaricap = yaricap;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double alanHespla() {
        return pi*this.yaricap*this.yaricap;
    }

    @Override
    public double cevreHesapla() {
        return 2*this.yaricap*pi;
    }
}
