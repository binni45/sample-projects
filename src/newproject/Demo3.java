package newproject;

import org.testng.annotations.Test;

public class Demo3 {

	static double a[];
	 
	   public static void main(String args[]){       
	        a = new double[4];
	        try {
	            printElement(4);
	        }catch(ArrayIndexOutOfBoundsException e){
	            
	            System.out.println("Catch exception :" + e);
	        }catch(Exception e1){
	            
	        }
	   }
	 
	   static void printElement(int i) {
	       System.out.println("The 5th element is :" + a[i]);  
	       }
	   
	   @Test()
	   public void setuser() {
	   
		   
	   }
	 
	}
