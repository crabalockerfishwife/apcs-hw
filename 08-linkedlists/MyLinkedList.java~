import java.io.*;
import java.util.*;

public class MyLinkedList{

    //notes
    //i = i+1 ... tmp = tmp.getNext

    private Node head;
    private int size;
    
    public MyLinkedList(){//dont even need
	head = null;//by default
	size = 1;
    }

    public void add(String d){//0
	Node tmp = new Node(d);
	for (int i =0; i<size; i++){
	    tmp.setNext(head); //you must do this first
	}
	head = tmp; //you must do this second
	size++;
    }

    public String toString(){//1
	String s = ""+head;
	for (int i = 1; i<size; i++){
	    s+=" "+head.getNext();
	}
	return s;
    }

    public void add(int i, String s){//2
	try {
	    for (int i2=i; i2<size; i2++){
		Node tmp = new Node(s);
		tmp.setNext(head);
		head = tmp;
	    }
	    size++;
	}catch (Exception e){
	    System.out.println("Error: trying to add past end");
	}

    }





}