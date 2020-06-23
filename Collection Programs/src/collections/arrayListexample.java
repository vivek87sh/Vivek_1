package collections;

import java.util.ArrayList;
//can accept duplicate values with diff indexes
//array has fixed size,where arraylist can grow dynamically

public class arrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("java");
		
		
		System.out.println(a);
		
		a.add(0, "student");
		
		System.out.println(a);
		
		a.remove(1);
		
		a.remove("student");
		
		System.out.println(a);
		
		
		
		
		//add or delete element anytime,dynamic in nature

	}

}
