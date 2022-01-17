package assignments;
 
import java.io.IOException;
		
	public class thread extends Thread{

		public void run(){		

			System.out.println("Thread :"+Thread.currentThread().getId() +" is Running");
		 }

			public static void main (String [] args){
				int n =30;
				for (int i=0; i < n;i++)
				{
								
					thread object = new thread() ;
					object.start();
					
				}
		}

}
