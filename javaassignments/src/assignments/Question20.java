package assignments;
	
	//You are given a project to work and resolve the diamond problem using OOPs concepts.
	
   interface parent1{
		
	    default void show(){
	    	System.out.println("Default Parent1");
		}
	}

	interface parent2{
		default void Show(){
			System.out.println("Default Parent2");	
		}
	}

	public class Question20 implements parent1,parent2  {
		
		public void Show(){
			parent1.super.show();
			parent2.super.Show();
		}
	 public static void main (String [] args){
		 Question20 tc =new Question20();
		 tc.Show();
	 }
	}
