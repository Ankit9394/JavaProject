import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Array {

	public static void main(String[] args) {
		
		/*it is used to store mulitple values in single variable
		 size is the problem in array to overcome this situation we can user Arraylist
		 
		*/
		int ankit[] = new int[4];
		
		ankit[0]=10;
		ankit[1]=20;
		ankit[2]=30;
		ankit[3]=40;
		/*
		System.out.println(ankit[0]);
		System.out.println(ankit.length);*/

		
		//ArrayList has O(1) time complexity to access elements via the get and set methods
		 //ArrayList in Java is used to store dynamically sized collection of elements
		 //it provides slow manipulation on objects compared to List.
		//duplicate values are aalowed
		//insertion order follow
		ArrayList<String> ar =new ArrayList<>();
		
		ar.add("Ankit");
		ar.add("Dipali");
		ar.add("Rana");
		ar.add("null");
		ar.add("null");
		
		
		System.out.println(ar);
		
		//System.out.println(ar.get(0));
		System.out.println(ar.contains("Ankit"));
		
		ar.add(2, "Tailor");
		System.out.println(ar);
		
		System.out.println(ar.remove(2));
		System.out.println(ar.indexOf("Ankit"));
		
		ArrayList<String> ar1 =new ArrayList<>();
		ar1.add("Rob");
		ar1.add("John");
		ar1.add("Smart");
		
		//System.out.println(ar.addAll(ar1));
		System.out.println(ar1.addAll(ar));
		
		//System.out.println(ar1.remove("Rob"));
		System.out.println(ar1);
		
		
		System.out.println("************************");
		
		//The LinkedList provides constant time for add and remove operations
		//LinkedList has O(n/2) time complexity to access the elements
		//LinkedList is faster being node based as not much bit shifting required
		List<String> ar2 =new LinkedList<>();
		ar2.add("Ankit");
		ar2.add("Dipali");
		ar2.add("Rana");
		ar2.add("Tailor");
		
		System.out.println(ar2.get(2));
		System.out.println(ar2.contains("Rana"));
		System.out.println(ar2);
		
		
	
	}
}
/*ArrayList<String> ar1 =new ArrayList<>();
		
		ar1.add("Tailor");
		ar1.add("Bhargav");
		ar1.add("Patel");
		ar1.add(null);
		ar1.add(null);
		
		for(String sa: ar) {
		System.out.println(sa);
		}
		
		System.out.println(ar1.toString());

		Set<Integer> s= new HashSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(null);
		s.add(null);
		
		System.out.println(s.toString());
		System.out.println(s);
		System.out.println(s.size());
	}

}
*/