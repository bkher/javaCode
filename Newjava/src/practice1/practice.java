package practice1;

public class practice{
	
	public static void main(String[] args) {
	
		String str ="my name is bhagasinh";
		int len = str.length();
		
		char ch[] = new char[str.length()]; 
        for (int i = 0; i < len; i++) { 
            ch[i] = str.charAt(i); 
            int find = 0; 
            for (int j = 0; j <= i; j++) { 
  
                // If any matches found 
                if (str.charAt(i) == ch[j])  
                    find++;                 
            } 

            if (find == 1)  
                System.out.println("Number of Occurrence of " + 
                 str.charAt(i) + " is:" + find);             
        } 
    } 
		
		
}
		
	
        
		

	



