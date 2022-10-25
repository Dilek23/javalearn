package P01_Proje;

public class Employes {
    /*
    Java da fabrika çalışanlarını temsil eden bir class oluşturunuz.
Class Name: Employee
Nitelikleri:
name: İşçi Adı
salary: İşçi Maaşı
workHours: Haftalık Çalışma Saati
year: Çalışmaya Başladığı Yıl
Metotları:
Parametreli Constructor create edilmelidir. Sınıfın nitelikleri aynı zamanda constructor ın parametresi olmalıdır.
vergi() → Maaşa uygulanan vergiyi hesaplamayabilen bir metot oluşturunuz.
salary < 10000 $
vergi = 0
salary >= 10000 $
vergi = (salary *3 /100)
bonus() → Haftalık Çalışma Saatine göre bonus verilebilen bir metot oluşturunuz.
workHours > 40
Her bir saate 50$
maasArtis() → İşçinin işe başlangıç yılına göre maaş artışına etki edebilecek oranı hesaplayan bir metot oluşturunuz.
5 yıldan az çalışıyor ise
artis = ((salary + tax) *5)/100
** Maaş Artışlarına uygulanan vergiyi de dahil ediniz.
[5-15) arası
artis = ((salary + tax)  * 10)/100
[+15-Now]
artis = ((salary + tax)  * 20)/100
toString() → Çalışanın bilgilerini konsola yazdıracak bir metot oluşturunuz (İşçi Adı, Maaş , Uygulanan Vergi, Toplam Maaş (Maaş + Bonus), Maaş Artışı)
     */
    String name;
    int salary;
  int workHours;
  int year;

    public Employes(String name, int salary, int workHours, int year) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.year = year;
    }
        public double tax(){
        double paymentOffTax=0;
        if(salary<10000){
            paymentOffTax=0;
        }else {
            paymentOffTax=salary*0.03;
        }
        return paymentOffTax;
        }
     public int bonus(){
        int paymentOffBonus=0;
        int addinitionalBonus=50;
        if(workHours>4){
            paymentOffBonus=(workHours-40)*addinitionalBonus;
        }
        return paymentOffBonus;
     }
     public double raisSalary(){
        int timeoffYear=2021;
        int sumOffYear=timeoffYear-year;
        double raising=0;
        if(sumOffYear<5){
            raising=(salary+tax()*0.05);
        } else if (sumOffYear<15) {
            raising=salary+tax()*0.10;
        }else{
            raising=salary+tax()*0.2;
        }
        return raising;
     }

    @Override
    public String toString() {
        return "Employes{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", year=" + year +
                '}';
    }
}



