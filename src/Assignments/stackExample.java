package Assignments;

import java.util.Stack;

public class stackExample {
//push
//pop [3]
//peek
//search		

	public static void main(String[] args) {
		Stack <Integer> s = new Stack<Integer>();
		s.push(4);
		s.push(5);
		s.push(9);
		s.push(922);
		s.push(109);
		s.push(45);
		s.push(11);
		System.out.println(s.toString());
		s.pop();
		System.out.println(s.toString());
		System.out.println(s.peek());
		System.out.println(s.search(1));
	}

}
