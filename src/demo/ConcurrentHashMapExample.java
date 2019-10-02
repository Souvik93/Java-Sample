package demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
	
	public void exampleConcurrentHashMap() {
		ConcurrentHashMap m=new ConcurrentHashMap();
		 m.put("100", "Hello"); 
	     m.put("101", "Geeks");
	     m.put("102", "For");
	     m.put("103", "Geeks"); 
	     
	     HashMap hm = new HashMap();
	     hm.put("100", "Helloo"); 
	     hm.put("101", "Geekss");
	     hm.put("102", "Forr");
	     hm.put("103", "Geekss"); 
	     
	     System.out.println("Before Changing HashMap");
	     System.out.println(m);
	     System.out.println(hm);
	     // m.replace(101, "Hello", "For"); //Fr Replacing
	     System.out.println("After Updating HashMap");
	     
	     
	     
	     // m.clear(); // For Clearing 
	     
	     Iterator<String> it = m.keySet().iterator();
	     
	     while(it.hasNext()){
				String key = it.next();
				if(key.equals("103")) m.put(key+"It1", "new3");
		}
	     
	     Iterator<String> it2 = hm.keySet().iterator();
	     
	     while(it2.hasNext()){
				String key = it2.next();
				if(key.equals("103")) hm.put(key, "new3");
		}
	     
	     Set s = m.entrySet();
	     System.out.println(m);
	     System.out.println(hm);
	     
	}

}
