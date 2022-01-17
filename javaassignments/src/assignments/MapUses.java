package assignments;

import java.util.*;

public class MapUses {

    public static void main(String[] args) {
	        
	          HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	          hm.put(1,"sheeb");    
	          hm.put(2,"saba");    
	          hm.put(3,"muzammil");   
	           
	          System.out.println("The elements of Hashmap are ");  
	          for(Map.Entry m:hm.entrySet()){    
	           System.out.println(m.getKey()+" "+m.getValue());    
	          }
	              
	          Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	          ht.put(3,"asm");  
	          ht.put(4,"awm");  
	          ht.put(5,"zar42");  
	          ht.put(6,"n3");  

	          System.out.println("\nThe elements of HashTable are ");  
	          for(Map.Entry n:ht.entrySet()){    
	           System.out.println(n.getKey()+" "+n.getValue());    
	          }
	          
	          TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	          map.put(8,"eagle");    
	          map.put(9,"shadab");    
	          map.put(10,"zara");       
	          
	          System.out.println("\nThe elements of TreeMap are ");  
	          for(Map.Entry l:map.entrySet()){    
	           System.out.println(l.getKey()+" "+l.getValue());    
	          }    
	          
	       }  
}
