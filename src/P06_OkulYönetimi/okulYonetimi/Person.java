package P06_OkulYönetimi.okulYonetimi;

public abstract class Person {
    String ad;
    String soyad;
    String kimlikNo;
    int yas;
    public abstract void ekleme();
    public abstract void arama();
    public abstract void listeleme();
    public abstract void silme();
    public Person() {
        this.ad = this.ad;
        this.soyad = this.soyad;
        this.kimlikNo = this.kimlikNo;
        this.yas = this.yas;
    }

}
