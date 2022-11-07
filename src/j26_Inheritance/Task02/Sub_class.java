package j26_Inheritance.Task02;

public class Sub_class extends SuperClass{
    public static void main(String[] args) {
        Sub_class obj = new Sub_class();
        obj.my_method();
    }

    int num2=10;
public void my_method(){
    goster();// subclass tan call
    super.goster();// superclass dan call
    System.out.println("sub class num: "+num2);
}
    @Override
    public void goster() {
        System.out.println("Bu method Sub classsın görüntülenme methodudur. " );





    }
}
