package j25_Encapsulation.encapsulation02;

public class Kisi {// pojo class
    /*
    Kişi pojo class için field ad, soyad.password(String),yas
    tüm fieldları kulllanıcı görebilmeli ve password hariç  update edebilmeli.
    password encapsulated update edilmeli yas variable negatif degere kaşı encapsulated edilsin
    runner class da obj ile field print eden code
     */
     String ad;
     String soyAd;
    private String password;
    private int yas;// negatiflik koruması için private edildi

    public Kisi(String ad, String soyAd, String password, int yas) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.password = password;
        this.yas = yas;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getPassword() {
        return password;
    }


    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas =Math.abs(yas);// eksi girilen yaşı iki yolla artı yaparız maths.abs yada if sartı ile

    }
}
