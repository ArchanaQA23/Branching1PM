package collectiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
	    System.out.println("Enter the two numbers: ");
	   Scanner sc = new Scanner(System.in);   // GET THE INPUT AT RUNTIME 
	   try
	   {
		   int num1 = sc.nextInt();  
		   int num2 = sc.nextInt();   
		   
		   System.out.println(num1/num2);  
	   }
	  
	  
	   catch(ArithmeticException e)
	   {
		   //System.out.println(e.getMessage());
		   System.err.println("Arithmetic exception handled ");
		 // e.printStackTrace();	 
	   }
	   catch (InputMismatchException e)
	   {
		   System.err.println("Input mismatch exception handled ");
	   }
	   
	   catch (Exception e)
	   {
		   System.err.println("Unknown error occcured ..");
	   }
	   
	   finally
	   {
		   System.out.println("Always execute ... ");
	   }
	   
	   System.out.println("Program completed ...");
	   
	   

	}
	
	

}
