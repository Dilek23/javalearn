package j20_PassByValeue;

public class Co2_PassByValue {
    public static void main(String[] args) {
        // task-> verilen fiyat için %11 %22ve %33 indirimle fiyat print eden code
        double fiyat=100;
        System.out.println("metod call öncesi fiyat degeri="+fiyat);
        System.out.println("indir11(fiyat) = " + indir11(fiyat));
        System.out.println("indir22(fiyat) = " + indir22(fiyat));
        System.out.println("indir33(fiyat) = " + indir33(fiyat));
        System.out.println("metodcall sonrası fiyat degeri="+fiyat);
    }

    private static double indir33(double fiyat) {
        return fiyat*=0.89;
    }

    private static double indir22(double fiyat) {
        return fiyat*=0.78;
    }

    private static double indir11(double fiyat) {
        return fiyat*=0.67;
    }
}
