package project1;

import java.util.Scanner;

public class ArithmaticCalculator {


	  public static void main(String[] args) {

	    char operator;
	    Double n1, n2, result;

	    
	    Scanner input = new Scanner(System.in);    //  object of Scanner class

	 
	    System.out.println("Choose an operator: A, B, C,D  or E");
	    operator = input.next().charAt(0);

	    	   
	    System.out.println("Enter first number");
	    n1 = input.nextDouble();

	    System.out.println("Enter second number");
	    n2 = input.nextDouble();

	    switch (operator) {

	      
	      case 'A':
	        result = n1 + n2;
	        System.out.println( "Addtion of two numbres are "+ n1 + " + " + n2 + " = " + result);   // addition
	        break;

	      
	      case 'B':
	        result = n1 - n2;
	        System.out.println("Subtraction of two numbres are "+n1 + " - " + n2 + " = " + result); // subtraction
	        break;

   	      case 'C':
	        result = n1 * n2;
	        System.out.println("Multiplication of two numbres are "+n1 + " * " + n2 + " = " + result); // multiplication
	        break;

	      
	      case 'D':
	        result = n1 / n2;
	        System.out.println("Division of two numbres are "+n1 + " / " + n2 + " = " + result); //division
	        break;

	        
	      case 'E':
		        result = n1 % n2;
		        System.out.println("Modulus of two numbres are "+n1 + " % " + n2 + " = " + result); //modulus
		        break;
		        
		        
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }
	}


