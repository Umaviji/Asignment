
package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("java");
		ar.add("c++");
		ar.add("python");
		ar.add("Html");
		System.out.println(ar.contains("C"));
		System.out.println(ar.isEmpty());
		System.out.println(ar.size());
		// System.out.println(ar.remove(3));
		Iterator itr = ar.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
