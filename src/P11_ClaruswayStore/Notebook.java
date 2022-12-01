package P11_ClaruswayStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Notebook extends Product {
    int nId;
    ArrayList<Notebook>noteBook=new ArrayList<>();
Scanner sc= new Scanner(System.in);

    public Notebook(Scanner sc, int id, String name, double price, double discountRate, int amount, Brand brand, double screenSize, int ram, int memory) {
        super(sc, id, name, price, discountRate, amount, brand, screenSize, ram, memory);
    }


    @Override
    public void menu() {

        System.out.println("1-Yeni notbook ekleme\n"+
        "2- notebook listesini görüntüleme\n" +
                "3-notebook silme\n");

        System.out.println("Yapmak istediginiz işlemi secin:");
        int options=sc.nextInt();
        if(options==1) addItem();
        if (options==2)getProduct();
        if (options==3)deleteItem();

    }

    @Override
    public void addItem() {
        System.out.println("ürünün fiyatı");
        double price=sc.nextDouble();
        System.out.println("ürünün adı");
        String name=sc.next();
        System.out.println("ürünün indirim oranı ");
        double discountRate=sc.nextDouble();
        System.out.println("ürünün stoğu:");


    }

    @Override
    public void getProduct() {

    }

    @Override
    public void deleteItem() {
getProduct();
        System.out.println("silmek istediginiz ürünün id sini giriniz");
        int id = sc.nextInt();
        noteBook.remove(id-1);// istenen indexi silmesi için id-1 dedik
        System.out.println("mevcut ürün listesi");
        getProduct();

    }
    public void print(List<Notebook>noteBoks) {
        //Todo
        /*
        for each kullam
         */
    }

}
