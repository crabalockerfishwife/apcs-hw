import java.io.*;
import java.util.*;

public class Driver{
    public static void main (String[] args){
	MyStack m = new MyStack();
	m.push("one");
	m.push("two");
	m.push("three");
	System.out.println(m);
	while (!m.isEmpty()){
	    System.out.println(m.pop());
	}
	m.push("hello");
	System.out.println(m.peek());
	System.out.println(m.pop());
	//?System.out.println(m.peek());
    }
}