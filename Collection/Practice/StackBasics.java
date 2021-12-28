
package Collection.Practice;

import java.util.Iterator;
import java.util.Stack;

public class StackBasics {
	public static void main(String[] args) {
		Stack<String> st = new Stack<String>();
		st.push("Order");
		st.push("delivery");
		st.push("Cancel");
		st.push("payment");
		st.push("price");
		// System.out.println("Enter the shopping detail:");

		Iterator<String> itr = st.iterator();

		// Printing the stack
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		st.pop();

		itr = st.iterator();

		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

	}

}
