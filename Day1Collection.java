import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Day1Collection {

	public static void main(String[] args) {

//		int values[] = new int[4];
//		Object values1[] = new Object[4];
//		values1[0]=1;
//		values1[1]="Pushpa";
//		values1[2]="Chotii";
		
		List <Integer >values=new ArrayList<>();
		values.add(122);
		values.add(849);
		values.add(435);
		values.add(223);
//		values.remove(1);
//		values.add(1, 2);
//		values.add("Pushpa");
//		values.add("1.09");
		
//		Comparator<Integer> com = new day1ComImpl(); // we can use anonymous class as well rather than creating new class altoghether eg below
		
		Comparator <Integer> com = new Comparator <Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
		      if (o1%100>o2%100)
			    return 1;

				return -1;
			}
		};
		Collections.sort(values,com);
		
//		values.forEach(System.out::println); // Stream API
		
//		Iterator i = values.iterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next());
		
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
		
		for(int i : values) {
			System.out.println(i);
		}
	}

}
