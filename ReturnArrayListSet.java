import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReturnArrayListSet {

	public ArrayList<String> addValue() {
		ArrayList<String> name = new ArrayList<>();
		name.add("golu");
		name.add("naatu");
		return name;
	}
	
	public Set<String> printValue() {
		Set<String> set = new HashSet<>();
		set.add("hum");
		set.add("dono");
		set.add("pagal");
		set.add("hainnnnnnnnnnn");
		
		
		
		return set;
	}
	public static void main(String[] args) {
		ReturnArrayListSet returnArrayList = new ReturnArrayListSet();
		ArrayList<String> arr = returnArrayList.addValue();
		System.out.println(arr);
        //System.out.println(addValue());
		
		Set<String> newSet = returnArrayList.printValue();
		System.out.println(newSet);
	}

}
