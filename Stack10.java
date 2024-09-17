// Input: Stack: (Top to Bottom) [10 -> 20 -> 30 -> 40]
// Output: Stack: (Top to Bottom) [40 -> 30 -> 20 -> 10]

// Input:  Stack: [6 -> 5 -> 4]
// Output: Stack: [4 -> 5 -> 6]
// Reverse a Stack using Queue

/**
 * Stack10
 */
// Java code to reverse a stack using queue

import java.io.*;
import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

class GFG {

	static void reverse(Stack<Integer> stk)
	{
		Queue<Integer> qu = new LinkedList<>();

		// Enqueue all into queue
		while (!stk.isEmpty()) {
			qu.add(stk.peek());
			stk.pop();
		}

		// Now stack is empty thus push all elements back
		// into the stack - FIFO order
		while (!qu.isEmpty()) {
			stk.push(qu.peek());
			qu.remove();
		}
	}

	public static void main(String[] args)
	{
		Stack<Integer> stk = new Stack<>();

		stk.push(40);
		stk.push(30);
		stk.push(20);
		stk.push(10);

		// Function call
		reverse(stk);

		// 40 30 20 10 (top to bottom)
		System.out.println(
			"After Reverse : (Top to Bottom)");

		while (!stk.isEmpty()) {
			System.out.print(stk.peek() + " ");
			stk.pop();
		}
		System.out.println();
	}
}

// This code is contributed by lokeshmvs21.
