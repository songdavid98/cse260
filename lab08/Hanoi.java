import java.util.Stack;

public class Hanoi {

	private static void move(Stack<Integer> s1, Stack<Integer> s2) {
		if (s1.isEmpty()) 
			s1.push(s2.pop());
		else if (s2.isEmpty())
			s2.push(s1.pop());
		else if (s2.peek() > s1.peek())
			s2.push(s1.pop());
		else
			s1.push(s2.pop()); 
	}

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		Stack<Integer> s3 = new Stack<Integer>();

		for (int i = 3; i > 0; i--) {
			s1.push(i);
		}
		int counter = 1;
		while ( !(s1.isEmpty() && s3.isEmpty()) ) {
			if (counter % 3 == 1)
				move(s1, s3);
			else if (counter %3 == 2)
				move(s1, s2);
			else
				move(s2, s3);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
			counter++;
		}
	}
}