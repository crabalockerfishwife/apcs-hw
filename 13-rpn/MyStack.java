//i got like all of this from elvin
import java.io.*;
import java.util.*;

public class MyStack {
	private String[] stack; // The backend array; changed elvin's instance variable name
	private int top; /* Index of the highest item in the stack; if this is 0,				   * then the stack is empty */
	private int capacity;

	public MyStack(){
		stack = new String[10]; 
		top = 0; // indicates empty array; popping gives null
		capacity = 10; 
	}

	private void increaseCapacity() {
		// Increases capacity by 10. 

		capacity = capacity + 10; 
		String[] newArray = new String[capacity];

		for (int i = 0; i < stack.length; i++) {
			newArray[i] = stack[i];  
		}

		stack = newArray; 
	}

	public void push(String s){
		try {
			stack[top + 1] = s; 
		} catch (ArrayIndexOutOfBoundsException e) {
			increaseCapacity(); 
			stack[top + 1] = s; 
		}
		top = top + 1;
	}

	public String pop() {
		String popped = stack[top];
		stack[top] = null;
		top = top - 1;
		if (top < 0) { // Handle the "popping an empty stack" case 
			top = 0;
		} 
		return popped;
	}

	public String peek() {
		String peeked = stack[top];
		return peeked; 
	}

	public int size() {
		return top; 
	}

	public boolean isEmpty() {
		return (top != 0); 
	}
	public String toString() {
		String result = ""; 
		for (int i = 1; i <= top; i++) {
			result += stack[i];
			if (i != top) {
				result += ", ";
			}
		}
		result += " ";
		return result;
	}

    public static void main (String[] args){//added this driver
	MyStack ms = new MyStack();
	System.out.println(ms);
	ms.push("lol");
	ms.push("hehe");
	System.out.println(ms);
	//seems to work yay
    }
}
