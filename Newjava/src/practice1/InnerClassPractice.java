package practice1;

public class InnerClassPractice {

	 private int myVar= 1;
	 
	 public void innerInstance()
	   {
		 String name ="local variable";
		 
		 class MyInnerClassDemo {
		      public void seeOuter () {
		         System.out.println("Value of myVar is :" + myVar);
		         System.out.println("Value of name is :" + name);
		      }
		      
		    } 
		 MyInnerClassDemo inner1 = new MyInnerClassDemo();
	       inner1. seeOuter();
	   }
	 
	 
	   public static void main(String args[]){
		   InnerClassPractice inner= new InnerClassPractice();
	       inner.innerInstance();
	       
	       
	       
	   }

	   
	   
	
}
