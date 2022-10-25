package Task_WhileLoop_odeveler;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
		 int kacSayıi=0;
		for(int i=999;i>100;i--){


			if(i%4==0&& i%6==0){
				System.out.print(i+"  ");
				i--;
				kacSayıi++;

			}
		}

		System.out.println(kacSayıi+"\n tane sayı vardır");

		
		
			
	}

}
