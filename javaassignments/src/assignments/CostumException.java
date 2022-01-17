package assignments;

import javax.imageio.IIOException;


public class CostumException extends Exception {
	

	//You are given a project to demonstrate a program implementing the concept of exception handling available in Java and the custom exception handlers.

		public CostumException(String s)
		{		
			super(s);				
		}

	public static class TestExcep1{
		
		static void validate (int age) throws IIOException {
			if (age<17)
			{
				throw new IIOException ("Age is not valid"); 
			}
			else
			{
				System.out.println("welcome to vote");   
			}
		}
		public static void main (String [] args){
			try
			{
				validate(80);
			}
			catch (Exception e)
			{
				System.out.println("Exception occured : Age is not Valid");  
			}
			finally{
				System.out.println("Rest Of the code");  
			}
		}
	}
}
	
