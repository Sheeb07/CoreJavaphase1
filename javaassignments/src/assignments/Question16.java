package assignments;

import java.util.Scanner;

public class Question16 {
				
			 void div(int a, int b) throws ArithmeticException
			{
				if(b==0){
					throw new ArithmeticException();
				}
				else {
					int c=a/b;
					System.out.println(c);
				}
			}
			 public static void main (String[] args){

					Scanner sc= new Scanner(System.in);
					System.out.println("Enter the value of A :");
					int a=sc.nextInt();
					System.out.println("Enter the value of S :");
					int b=sc.nextInt();
					
				Question16 tc = new Question16();
					
				try{
				tc.div(a, b);
				   }
				catch (Exception e)
				{
					System.out.println("Exception Occured : The value of S is O");
				}
				
				finally{
					System.out.println("Succesfully Oparated The Code");
				}
			}
		}


