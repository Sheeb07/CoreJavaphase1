package assignments;

 class A extends Thread {
		 
	 public void run(){
				int a=3;
				for (int k = 0; k< a; k++)
				{
				System.out.println("Thread : "+Thread.currentThread().getId()+" is running thread in SS");		
				}
				System.out.println("EXit From SS");
				}
				
			}
		
	class B extends Thread{
	
		public void sleep(){
		int g=3;
		for (int k = 0; k < g; k++)
		{
		System.out.println("Thread : "+Thread.currentThread().getId()+" is running thread IN AF");
				
			}
		System.out.println("EXit From AF");
		}
		
	}
	
	
	class C extends Thread {

		public void waiit(){
	int v=3;
	for (int j = 0; j < v; j++)
	{
	System.out.println("Thread : "+Thread.currentThread().getId()+" is running thread IN AS");
			
		}
	System.out.println("EXit From AF Thread");
	}

		
	}
		

	public class threadWN extends Thread {

		public static void main(String[] args) {
			
			// TODO Auto-generated method stub

			A  a = new A();
			B b= new B();
			C c = new C();
			 a.start();
			 b.sleep();
			 c.waiit();
			 
			 System.out.println("MultiThreading is over");

		}
				
		
}

