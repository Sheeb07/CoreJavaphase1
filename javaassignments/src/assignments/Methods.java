package assignments;
	
  
 class methodExecution {
	 
	public int multipynumbers(int a,int b) {
	    int Result=a*b;
	    return Result;
	}
}
	
 
	class callMethod {

	int val=330;

	int operation(int val) {
	    val =val*10/200;
	    return(val);
	}
}


 class methodoverloading {
	    
      void area(int b,int h)
	  {
	       System.out.println("Area of Triangle : "+(0.7*b*h));
	   }
      
	   public void area(int r) 
	    {
	         System.out.println("Area of Circle : "+(4.14*r*r));
	    }
	 }

 
	   public class Methods{
	    public static void main(String args[])
	   {

		    System.out.println("----Method Exicution-----");
		    methodExecution b=new methodExecution();
		    int ans= b.multipynumbers(10,3);
		    System.out.println("Multipilcation is :"+ans);
		    
		    
		    System.out.println("\n-----Method calling by value----");
	    	callMethod d = new callMethod();
	 	    System.out.println("Before operation value of data is "+d.val);
	 	    d.operation(100);
	 	    System.out.println("After operation value of data is "+d.val);
	    	
		    System.out.println("\n-----Method Overloading----");
	        methodoverloading ob=new methodoverloading();
	        ob.area(10,12);
	        ob.area(5);  
	   }
}