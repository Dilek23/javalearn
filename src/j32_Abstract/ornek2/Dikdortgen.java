package j32_Abstract.ornek2;

public class Dikdortgen extends Sekil {
    private  double uzunKenar;
    private double kisaKenar;

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    @Override
    public double alanHespla() {
        return this.uzunKenar*this.uzunKenar;
    }

    @Override
    public double cevreHesapla() {
        return ( this.uzunKenar+this.uzunKenar)*2;
    }
}
