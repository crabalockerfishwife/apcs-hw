import java.io.*;
import java.util.*;

public class MyLinkedList{

    //notes
    //i = i+1 ... tmp = tmp.getNext

    private Node head;
    
    public MyLinkedList(){//dont even need
	head = null;//by default
    }

    public void add(String d){//0
	Node tmp = new Node(d);
        tmp.setNext(head); //you must do this first
	head = tmp; //you must do this second
    }

    public String toString(){//1
        return ""+head;
    }

    public void add(int i, String s){//2
	try{
	Node tmp = head;
	Node n = new Node(s);
	for (int j = 0; j!=i; j++){
	    tmp = tmp.getNext();
	}
	n.setNext(tmp.getNext());
	tmp.setNext(n);
	}catch(NullPointerException e){
	    System.out.println("Null Exception Whoops");
	}
    }

    public String get(int i){//3
	Node tmp = head;
	for (int j = 0; j!=i; j++){
	    tmp = tmp.getNext();
	}
	return tmp.getData();        	
    }

    public String set(int i, String s){//4
	Node tmp = head;
	for (int j=0; j!=i; j++){
	    tmp = tmp.getNext();
	}
	String output = tmp.getData();
	tmp.setData(s);
	return output;
    }

    public String remove(int i){//5
	Node tmp = head;
	if (i == 0) {
	    head = head.getNext();
	}
	for (int j=0; j!=(i-1); j++){
	    tmp = tmp.getNext();
	}
	String output = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	return output;
    }

    public int find(String s){//6
	//wasnt sure how to do this one
        return 0;
    }

    public int length(){//7
	Node tmp = head;
	int i = 0;
	for (; tmp!=null;i++){
	    tmp = tmp.getNext();
	}
	return i;
    }


}
