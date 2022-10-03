package Task5;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu Metre cinsiden giriniz");
        double boy = scanner.nextDouble();
        System.out.println("Kilonuzu Kg cinsiden giriniz");
        double kg = scanner.nextDouble();
        boy = boy / 100;
        double bmi = kg / (boy * boy);

        /*if (bmi <= 20) {
            System.out.println("Oldukca zayifsiniz");
        } else if (bmi <= 25) {
            System.out.println("Normal Sinirlardasiniz");
        } else if (bmi <= 30) {
            System.out.println("Sisman kategorisindesiniz");
        } else System.out.println("Obez grubundasiniz");

       */
        System.out.println(bmi<=20? "Oldukça zayıfsınız":bmi<=25?"normal sınırladasınız":bmi<=30?"şişman kategorisindesiniz":"Obez gurbundasınız");
        }
    }

