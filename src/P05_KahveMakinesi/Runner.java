package P05_KahveMakinesi;

public class Runner {
    public static void main(String[] args) {
        double accountBalance=1;
        Urun urun= new Urun();

   Option options= new Option();
 urun.setPrice(options.select(urun));
 accountBalance= options.balance(urun.getPrice(),accountBalance,urun);
        System.out.println(accountBalance);
        options.purchase(urun.getPrice(),accountBalance,urun);
    }
}
