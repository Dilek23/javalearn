package j33_Interfaces;

public class Sahin extends Tofas implements dısDonanım,icDonanım,Lastik {
    @Override
    public void ebat() {
        System.out.println("16inç lastik");
        System.out.println("dr. bu ne");
    }

    @Override
    public void jant() {
        System.out.println("janti adama çelik jant gider...:)");
    }

    @Override
    public void motor() {
        System.out.println("1.6 motor...");

    }

    @Override
    public void yakit() {
        System.out.println("Tüplü iyidir... ");

    }

    @Override
    public void kapi() {
        System.out.println("4 kapi sedan ...");

    }

    @Override
    public void kaporta() {
        System.out.println("akordion kaporta...");

    }

    @Override
    public void koltuk() {
        System.out.println("koltuklar deri olsun...");

    }

    @Override
    public void klima() {
        System.out.println("ac camı serinle klima neyine...");

    }// conc child class extend-> Tofas , imlement

}
