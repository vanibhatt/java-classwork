package first.lesson.intro;

import java.util.Stack;

public class TestStack {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(7);
		System.out.println(st);
		Stack<Integer> st2 = new Stack<Integer>();
		while(! st.isEmpty()) {
			st2.push(st.pop());	
		}
		System.out.println(st2);
		System.out.println(st);
		
	}

}
