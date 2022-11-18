package P06_OkulYönetimi.myMethod;

public class Ogrenci {

    String name;
    int stuNo;
    String sinif;
    Kurs mat;
    Kurs fiz;
    Kurs tur;
    double ortalamaGenel;
    public Ogrenci(){}

    public Ogrenci(String name, int stuNo, String sinif, Kurs mat, Kurs fiz, Kurs turkce) {
        this.name = name;
        this.stuNo = stuNo;
        this.sinif = sinif;
        this.mat = mat;
        this.fiz = fiz;
        this.tur= tur;

    }

    public void topluSinavNotEkle(Kurs kurs,int notYazili,int notSozlu){
kurs.noteYazili=notYazili;
kurs.noteSozlu=notSozlu;

    }
    public double ortalama(Kurs mat,Kurs fiz,Kurs tur){
        return ortalamaGenel=((mat.noteSozlu*mat.sozluNotuEtki+mat.noteYazili)*(1-mat.sozluNotuEtki)+
                (fiz.noteSozlu* fiz.sozluNotuEtki)+ fiz.noteYazili*(1- fiz.sozluNotuEtki)+
                (tur.noteSozlu*tur.sozluNotuEtki)+tur.noteYazili*(1-tur.sozluNotuEtki))/3;
    }

    public boolean gectiMi(){
        if (ortalamaGenel<50){

            return false;
        }else
            return true;

    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "name='" + name + '\'' +
                ", stuNo=" + stuNo +
                ", sinif='" + sinif + '\'' +
                ", mat=" + mat +mat.noteYazili+mat.noteSozlu+
                ", fiz=" + fiz +fiz.noteYazili+fiz.noteSozlu+
                ", tur=" + tur +tur.noteYazili+tur.noteSozlu+
                ", ortalamaGenel=" + ortalamaGenel +
                "Gecti mi "+gectiMi()+
                '}';
    }
}
