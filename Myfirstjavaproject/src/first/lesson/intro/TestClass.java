package first.lesson.intro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		Map<String, String> m1 = new HashMap<String, String>();
		TreeMap<Integer, String> hm = new TreeMap<Integer, String>(); 
		
		
		System.out.println("Initial size of al " + al.size());
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add(1, "A2");
		System.out.println("size of al after additions " + al.size());
		System.out.println("contents of al: " + al);
		al.remove("F");
		System.out.println("size of al after deletions " + al.size());
		System.out.println("contents of al: " + al);
		al.remove(2);
		System.out.println("size of al after deletions " + al.size());
		System.out.println("contents of al: " + al);
		
		for (int i = 1; i < 100; i ++ ) {
			
			if (i % 3 == 0 && i % 5 == 0 ) {
				a2.add(i);		
			}
		}
		a2.add(0,1);
		System.out.println("contents of a2: " + a2);
		System.out.println("size of a2 after additions " + a2.size());
		
		
		int count[] = {34, 22, 10, 60, 30, 22, 34};
		Set<Integer> s = new HashSet<Integer>();
		
			for(int i = 0; i < 5; i++) {
				s.add(count[i]);
			}
			System.out.println(s);
			TreeSet<Integer> sortedset = new TreeSet<Integer>(s);
			System.out.println(sortedset);
			System.out.println(sortedset.first());
			System.out.println(sortedset.last());
			sortedset.add(50);
			System.out.println(sortedset);
			
		m1.put("zara", "8");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		m1.put("Vani","India");
		System.out.println(m1.get("Vani"));
		for (Map.Entry<String, String> entry :m1.entrySet()) {
			System.out.println("Key : " +entry.getKey()+ " Value : " +entry.getValue());
		}
		
		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");
		for(Map.Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
		
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me.getKey() + ": ");
			System.out.println(me.getValue());
			
			
		}
		
		
		
	}
}
