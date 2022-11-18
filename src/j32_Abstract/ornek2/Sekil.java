package j32_Abstract.ornek2;

public  abstract class Sekil {
    private String name;

    public Sekil(String name) {
      setName(name);
    }

    public Sekil(){

    }
  public void setName(String name){
      System.out.println(name);

  }
  public abstract  double alanHespla();
    public  abstract double cevreHesapla();

    public String ciz(){
        return this.name+"cizildi";
    }

    @Override
    public String toString() {// obje degerlerini valueleri print eder.
        return
                "name= isim" +this. name + '\'' +
                        "\n sekil alanı: "+this.alanHespla()+
                        "\n seikl cevre:"+this.cevreHesapla()+
                         "\n sekil"+this.ciz();// ciz metod call edildi

    }
}


