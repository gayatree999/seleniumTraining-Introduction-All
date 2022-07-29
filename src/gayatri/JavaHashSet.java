package gayatri;

import java.util.HashSet;
import java.util.Iterator;

public class JavaHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> str = new HashSet<String>();
		
		//there is no guarantee that the elements will be stored in sequential order
		//HashSet does not accept duplicate values
		//Hashset, treesset, LinkedHashset implements Set Interface
		
		str.add("gayat");
		str.add("blr");
		str.add("jayanagar");
		str.add("jayanagar");
		System.out.println(str);
		str.remove("jayanagar");
		System.out.println(str);
		System.out.println(str.isEmpty());
		System.out.println(str.size());
		
		
		str.add("test1");
		str.add("test2");
		//Iterator
		Iterator<String> i = str.iterator();
		//System.out.println("printing hasset" +i.next());
		//System.out.println(i.next());
		
		while(i.hasNext()) {
			System.out.println("hasset value="+i.next());
		}
		

	}

}
