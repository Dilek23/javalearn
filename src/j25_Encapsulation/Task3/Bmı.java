package j25_Encapsulation.Task3;

public class Bmı {
    /*
 Bmı classfields -> name, age, weight,height: encapsulated
getBMI() method -> bmi=weight/(height*height) returb type olmalı
 getStatus() method -> bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 30 dan kucukse kilolu, 30 ustu obez return type
 runner class obj ile dataları print eden code create ediniz
  */
 private String name;
    private int age;
    private double weight;
    private  double height;

    public Bmı(String name, int age, double weight, double height) {// full paramtreli cons.
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public String getStatus() {
        if(getBMI()<18.5){
            return "Zayif";
        } else if (getBMI()<25) {
            return "Normal";

        } else if (getBMI()<30) {
            return "Kilolu";

        }else return "Obezzz:(";

    }


public double getBMI(){
   double bmi=weight/(height*height);
        return bmi;
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}//class sonu
class Runner{
    public static void main(String[] args) {
 Bmı obj=new Bmı("Tugba",33,60,1.60);
        System.out.println("BMı: "+obj.getName()+" "+obj.getStatus()+" "+obj.getBMI());




    }//main sonu
}//inner class sonu