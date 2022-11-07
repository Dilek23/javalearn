package j25_Encapsulation.encapsulation01;

public class C02_Encapsulation {
    private String name="Gamze";
   private int id=1001;

    public C02_Encapsulation() {

    }

    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }
public String isimVer(){// getter metodu
        return name;

}

public int idVer(){// getter metod
        return id;
}
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", id=" + id ;

    }
  public void isimDegis(String isim){
        this.name=isim;
  }
// ÖNEMLİ sag tuş generate yapılarak getter ve setter yapılır
}
