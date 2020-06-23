package collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//HashSet treeset,LinkedHashSet-these 3 classes implements Set Interface
		//Set interface doesnot accepts duplicate values
		//there is no gaurantee that elements gets stored in sequential order, they may b stored in random order
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		
		System.out.println(hs);
		System.out.println(hs.remove("UK"));
		System.out.println(hs);
		
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String> i= hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		
		}
	
		
	}

}
