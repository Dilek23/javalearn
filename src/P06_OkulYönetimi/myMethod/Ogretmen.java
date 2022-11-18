package P06_OkulYönetimi.myMethod;

public class Ogretmen {
  private String name;
     private String branch;
     private int id;

    public Ogretmen(String name, String branch,int id) {
       this.name = name;
        this.branch = branch;
         this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", id=" + id +
                '}';
    }
}
