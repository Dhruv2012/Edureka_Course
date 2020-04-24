import java.util.*;
public class casestudy2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>(); 
	    map.put("dhruv", 10); 
	    map.put("bhumil", 30); 
	    map.put("meet", 20); 
	    map.put("shankar", 40); 
	    System.out.println("Size of map is:- "
	                       + map.size()); 
	
	    print(map); 
	    ArrayList <String> key = new ArrayList <>();
	    ArrayList <Integer> val = new ArrayList <>();
	    for (Map.Entry<String, Integer> entry : map.entrySet()) {
	    	String k = entry.getKey();
	    	int v = entry.getValue();
	    	key.add(k);
	    	val.add(v);
	    	System.out.println("Key: " + k + ", Value: " + v);
	    }
	    System.out.println("Key values are: " + key);
	    System.out.println("values corresponding to each key are: " + val);
	    map.clear(); 
	    print(map); 

	}
	
	public static void print(Map<String, Integer> map) {
        if (map.isEmpty()) 
            System.out.println("map is empty"); 
        
        else 
            System.out.println(map); 
    
    }

}
