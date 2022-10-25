package j18_Constructor;

public class C04_Teacher {//ogretmen obje ureten kalıohane
    String ad;
    String soyad;
    String branş;
    double ortalama;
    int tecrübe;
    int id;

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", branş='" + branş + '\'' +
                ", ortalama=" + ortalama +
                ", tecrübe=" + tecrübe +
                ", id=" + id +
                ", emekli=" + emekli +
                ", maas=" + maas +
                '}';
    }

    public C04_Teacher(String ugur, String javacan, int i, int i1, int i2, boolean b) {//parameterlini ezdigi default cons. yerine parametrsiz cons.urettik

    }

    // king trick parametreli cons. default con.ezer.
    public C04_Teacher(String ad, String soyad, String branş, double ortalama, int tecrübe, int id, boolean emekli, int maas) {
        this.ad = ad;
        this.soyad = soyad;
        this.branş = branş;
        this.ortalama = ortalama;
        this.tecrübe = tecrübe;
        this.id = id;
        this.emekli = emekli;
        this.maas = maas;
    }

    boolean emekli;
    int maas;
    public void dersSaati(){
        System.out.println("haftada 20 saatten fazlası extraya girer. ");
    }


}
