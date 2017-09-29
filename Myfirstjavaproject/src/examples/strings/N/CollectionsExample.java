package examples.strings.N;

import java.util.*;

public class CollectionsExample {

	ArrayList<Integer> A1 = new ArrayList<Integer>();
	ArrayList<Integer> A2 = new ArrayList<Integer>();
	
	ArrayList storeEvenNumbers(int N) {
		
		for(int i = 2; i < N; i= i + 1) {
		
		if (i%2 == 0){
			this.A1.add(i);
   			}	
		}
		return this.A1;
	}
	
	ArrayList printEvenNumbers() {
		
		Iterator<Integer> itr= this.A1.iterator();
			
			while(itr.hasNext()) {
				int result = itr.next()*2;
				this.A2.add(result);
				System.out.println(result);
			}
			return this.A2;	
		}	

	int retrieveEvenNumber(int N) {
		Iterator<Integer> itr = this.A1.iterator();
		while(itr.hasNext()) {
			if(itr.next() == N) {
				return N;
			}
		}	
		return 0;
	}
}

	