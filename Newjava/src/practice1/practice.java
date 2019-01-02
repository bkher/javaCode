package practice1;

import java.util.HashMap;
import java.util.Map.Entry;

public class practice{
	
	public static void main(String[] args) {
	
		String str ="bhagat";
//		int len = str.length();
		HashMap<Character, Integer> charCountMap 
        = new HashMap<Character, Integer>();
		char ch[] = str.toCharArray();
		for (char c : ch) { 
            if (charCountMap.containsKey(c)) { 
  
                // If char is present in charCountMap, 
                // incrementing it's count by 1 
                charCountMap.put(c, charCountMap.get(c) + 1); 
            } 
            else { 
  
                // If char is not present in charCountMap, 
                // putting this char to charCountMap with 1 as it's value 
                charCountMap.put(c, 1); 
            } 
              
        } 
		 for (Entry<Character, Integer> entry : charCountMap.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 
    } 
		
		
}
		
	
        
		

	



