package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "hello");
		hm.put(1, "GoodBye");
		hm.put(2, "Morning");
		hm.put(3, "evening");
		
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));
		
		Set sn=hm.entrySet();
		Iterator it= sn.iterator();
		
		//create a hashtable-pass it to set collections-and print key values
		//to seperate key and value,we can use Map.Entry casting as shown below
		while(it.hasNext()){
			
			
			Map.Entry mp=(Map.Entry)it.next();
			
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}

}
