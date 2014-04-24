import java.io.*;
import java.util.*;

public class MyQueue{

    private Node head; //=null;
    private Node tail; //=null;
    
    public MyQueue(){//tech dont need: above, auto set to null, etc;
	head=null;
	tail=null;
    }
    
    public void enqueue(String s){
	Node n = new Node(s);
	if (head==null){
	    head = n;
	    tail = n;
	}
	else{
	    tail.setNext(n);
	    tail = tail.getNext();
	}
    }

    public String dequeue(){
	String s = null;
	if (head!=null){
	    s = head.getData();
	    head = head.getNext();
	}
	if (head==null){
	    tail.setNext(n);
	    tail = n;
	}
	return s;
    }

    public boolean isEmpty(){
	return head==null;
    }
    
    public String front(){
	if (head==null){
	    return null;
	}
	return head.getData();
    }
    
    public String toString(){
	String s = "head -->";
	if (head==null){
	    s+=
	}
    }

    public static void main (String[] args){
	MyQueue q = new MyQueue();
	System.out.println(q);
	
	
    }
}