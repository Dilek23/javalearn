package P06_OkulYönetimi.myMethod;

public class Kurs {
    Ogretmen ogretmen;
    String name;
    String prefix;
    int code;

    int noteYazili;
    int noteSozlu;
    double sozluNotuEtki;
    public Kurs(){

    }

    public Kurs(String name, String prefix, int code, double sozluNotuEtki) {
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.sozluNotuEtki = sozluNotuEtki;
    }
    public void addOgretmen(Ogretmen ogrt){
        this.ogretmen=ogrt;
    }
    public void printOgretmen(Ogretmen ogrt){
        System.out.println("Ogretmen:" + ogrt.getName()+" "+ogrt.getBranch()+" "+ogrt.getId());

    }

    @Override
    public String toString() {
        return "Kurs{" +
                "teacher=" + ogretmen +
                ", name='" + name + '\'' +
                ", prefix='" + prefix + '\'' +
                ", code=" + code +
                ", noteYazili=" + noteYazili +
                ", noteSozlu=" + noteSozlu +
                ", sozluNotuEtki=" + sozluNotuEtki +
                '}';
    }
}
