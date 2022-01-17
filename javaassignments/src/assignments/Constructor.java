package assignments;

class Bicycle{
	
	//default constructor
}

  class Car {
      
	  Car()
      {
 		 System.out.println("Non-parameterized user-defined Constructor");
    	 System.out.println("In Car class Constructor");
	 }
  }
    class Bike{
	  
	Bike(String brand)
	{
		 System.out.println("parameterized user-defined Constructor");
    	 System.out.println("Brand:"+brand);

	}
 }
	
 class ConstructorOverloading{
	  int s,h,b;
	  float r;
	 ConstructorOverloading(int s)
	{
      this.s=s;
	}
	 ConstructorOverloading(int h , int b)
	{
          this.h=h;
          this.b=b;	 
	}
	 ConstructorOverloading (float r)
	{
          this.r=r;

	}
	 void display() {
	System.out.println("\nsqaure of a number:"+(s*s));

	System.out.println("Area of rectangle:"+(h*b));

	System.out.println("Area of circle:"+(3.14*r*r));
    }
	
 }	
    
    
	public class Constructor{ 
		public static void main(String[] args) {
			
		System.out.println("start");//default constructor
		Bicycle B=new Bicycle();
		System.out.println("end");	
				
		System.out.println("\nstart");//non-parameterized user-defined constructor 
		Car c=new Car();
		System.out.println("end");	
		
		System.out.println("\nstart");//parametrized user-defined cnstructor
        Bike b=new Bike("suzuki");
		System.out.println("end");
		
		System.out.println("start");// constructorOverloading	
		ConstructorOverloading C1=new ConstructorOverloading(5);
		ConstructorOverloading C2=new ConstructorOverloading(6,6);
		ConstructorOverloading C3=new ConstructorOverloading(3.1f);
		C1.display();
		C2.display();
		C3.display();
       System.out.println("end");			

	}
}

