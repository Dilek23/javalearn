package j15_Arrays.Tasks_Arrayeasy;

public class task_Denemeler {
    public static void main(String[] args) {
       /*
        12345
        1234
        123
        12
        1

*/
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(+i);
            }
        }
        System.out.println();
    }
}
