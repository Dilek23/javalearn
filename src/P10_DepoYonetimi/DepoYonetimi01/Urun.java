package P10_DepoYonetimi.DepoYonetimi01;

public class Urun {
  private   String urunIsmi;
  private   int urunId;
  private   String uretici;
  private   int miktar;
  private   String birim;
  private String raf;

    public Urun(String urunIsmi, String uretici, int miktar, String birim, String raf) {
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = miktar;
        this.birim = birim;
        this.raf = raf;
    }

    public Urun(String isim, String uretici, String miktar, String birim, Object raf) {



    }


    public String getUrunIsmi() {
        return urunIsmi;
    }

    public void setUrunIsmi(String urunIsmi) {
        this.urunIsmi = urunIsmi;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {

    this.urunId= urunId;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }
//{100=Urun{urunIsmi='ELMA', uretici='ELMACI', miktar=6, birim='PAKET', raf='null'}, 101=Urun{urunIsmi='ARMUT', uretici='ARMUTCU', miktar=4, birim='TR'
    @Override
    public String toString() {
        return  "Urunleriniz "+

                ", urunIsmi='" + urunIsmi + '\'' +
                ", uretici='" + uretici + '\'' +
                ", miktar=" + miktar +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\'' +"\n"
                ;
    }
}
