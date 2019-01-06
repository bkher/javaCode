package practice1;

import java.util.Scanner;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
	Scanner in = new Scanner(System.in);
	int a = in.nextInt();
	
	
	
	int status =1;
	
//	for(int i=2;i<100;i++) 
//	{
		for(int j=2;j<=Math.sqrt(a);j++) 
		{
			if(a%j==0) {
				status=0;
				break;
			}
		}
		if(status!=0)
		{
			System.out.println(a +"is prime number");
			
		}else {
			System.out.println(a +" is not prime number");
		}
	/*	status=1;
		a++;
	*/	
	//}
	
	
	
	}
}
