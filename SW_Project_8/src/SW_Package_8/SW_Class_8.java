package SW_Package_8;

import java.util.Scanner;

public class SW_Class_8 // Class definition
{
	public int sum(int a, int b) // Method to add two integers - Returns result - NON-VOID
	  { int c;
	    c= a+b;
	    System.out.println("Sum result is:"+c);
	    return c;	 
	  }
	
	public int subtract(int c, int d) // Method to subtract one integer from another - Returns result - NON-VOID
	  { int e;
	    e=c-d;
	    System.out.println("Subtract result is:"+e);
	    return e;	 
	  }
	public int multi(int f, int g) // Method to multiply two integers - Returns result - NON-VOID 
	 { int h;
	   h=f*g;
	   System.out.println("Multplicated result is:"+h);
	   return h;	 
	 }
		
	 public int div(int i, int j) // Method to divide two integers - Result not returned - VOID 
	 { int k;
	   k=i/j;
	   System.out.println("Final result is:"+k);
	   return k;	 
	 }	
	 
	 public static void main(String[] args) 
	 {
		 System.out.println("Please enter six integer values below:"); // Prompt user for input
		 Scanner s=new Scanner(System.in); // Creates object of Predefined Class - Scanner to access Scanner methods
		 int x1; int x2; int x3; int x4; int x5; int x6; // Define input fields
		 x1=s.nextInt(); // receive user input for x1
		 x2=s.nextInt(); // receive user input for x2
		 x3=s.nextInt(); // receive user input for x3
		 x4=s.nextInt(); // receive user input for x4
		 x5=s.nextInt(); // receive user input for x5
		 x6=s.nextInt(); // receive user input for x6
	
		 SW_Class_8 ob=new SW_Class_8(); // Create object of SW_Class_8
		 int sumresult1=ob.sum(x1,x2);
	     int subresult=ob.subtract(sumresult1,x3);
	     int sumresult2=ob.sum(subresult,x4);
	     int multresult=ob.multi(sumresult2,x5);
	     int finalresult=ob.div(multresult,x6);
	 
	 }
}
