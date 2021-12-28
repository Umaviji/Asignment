
	package Collection.Practice; 
	import java.util.ArrayList; 
	import java.util.Collections;
	import java.util.List;
	public class CollectionBasics { 
		public static void main(String[] args) {
			List<String> myList = new ArrayList<String>();
			myList.add("AWS");
			myList.add("Java");
			myList.add("Python"); 
			myList .add("Blockchain");
			System.out.println("Before Reversing"); 
			System.out.println(myList.toString());
			Collections.reverse(myList); 
			System.out.println("After Reversing"); 
			System.out.println(myList);
			} 
		}


