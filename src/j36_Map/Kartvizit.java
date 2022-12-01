package j36_Map;

public class Kartvizit {//pojo obje uretecek
  String  isim;
  String email;
  String telefon;
  String  adres;
   int id=100;

    public Kartvizit(String isim, String email, String telefon, String adres, int id) {
        this.isim = isim;
        this.email = email;
        this.telefon = telefon;
        this.adres = adres;
        this.id++;

    }

    @Override
    public String toString() {
        return "Kartvizit{" +
                "isim='" + isim + '\'' +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres='" + adres + '\'' +
                ", id=" + id +
                '}';
    }
}
