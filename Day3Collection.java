import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Day3Collection {

	public static void main(String[] args) {
////		Map <String , String> map= new HashMap<>();
//		Map <String, String> map=new Hashtable<>();
//		map.put("myName", "Pushpa");
//		map.put("Actor", "Akshay");
//		map.put("CEO", "Akshay");
////		map.put("actor", "Akshay");
//		Set<String> keys = map.keySet();    // To get the entire keySet of elements
//		
//		for(String key : keys)
//		
//		System.out.println(key + "" + map.get(key));
		
		// To identify duplicate into Arraylist
//		ArrayList<String> list = new ArrayList<>();
//		list.add("golu");
//		list.add("bholu");
//		list.add("dholu");
//		list.add("dholu");
//		list.add("golu");
//		
//		Set <String> s = new HashSet<>();
//		
//		
//		for(String names : list) {
//			
//			if(s.add(names)==false)
//			System.out.println(names);
//		}
//		
		
		// To calculate the time for the program execution
//		long Start = System.currentTimeMillis();
//		ArrayList al = new ArrayList();
//		for (int i=1;i<=1000000;i++) {
//			al.add(i);
//		}
//		long End = System.currentTimeMillis();
//		System.out.println(End - Start);
//		
//		
//		
//		long values = System.currentTimeMillis();   // This calculates millis from Jan 1970
//		System.out.println(values);
		
		
		// Double braces initialization to add values into arraylist
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		{{    // Inner braces is instantiation initializer , so every time we create object this block gets called 
			list.add(57);
			list.add(67);
			list.add(990);
			
		}}; // outer braces is inner class
		
		for (int i : list) {
			System.out.println(i);
		}
	}

}
