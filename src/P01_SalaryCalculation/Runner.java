package P01_SalaryCalculation;

public class Runner {
    public static void main(String[] args) {
       Employee employee =new Employee("Dilek",20000,41,2020);
        System.out.println("name: "+ employee.name);
        System.out.println("maaş: "+ employee.salary);
        System.out.println("odenecek vergi: "+ employee.tax()+"₺");
        System.out.println("odenecek bonus= "+50);
        System.out.println("Maas artış"+ employee.raisSalary()+"₺");

        System.out.println("toplam odenecek ucret: "+((employee.salary)+(employee.raisSalary())));
    }
}
