package examples.strings.N;

import java.util.*;

public class MapInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "vijay");
		map.put(102, "Rahul");
		for(Map.Entry m:map.entrySet()) {
			
			System.out.println(m.getKey()+ " " + m.getValue());
		}
				

	}

}
