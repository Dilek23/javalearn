package P01_Proje;

public class Runner {
    public static void main(String[] args) {
       Employes employes=new Employes("Drake",20000,41,2020);
        System.out.println("name: "+employes.name);
        System.out.println("maaş: "+employes.salary);
        System.out.println("odenecek vergi: "+employes.tax());
        System.out.println("odenecek bonus= "+50);
        System.out.println("Mas artış"+employes.raisSalary());

        System.out.println("toplam odenecek ucret: "+((employes.salary)+(employes.raisSalary())));
    }
}
