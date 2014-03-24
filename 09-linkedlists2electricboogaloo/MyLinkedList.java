import java.io.*;
import java.util.*;

public class MyLinkedList{

    //notes
    //i = i+1 ... tmp = tmp.getNext

    private Node head;
    
    public MyLinkedList(){//dont even need
	head = new Node("");//dummy node
    }

    public void add(String d){//0
	Node tmp = new Node(d);
        tmp.setNext(head.getNext()); //you must do this first
	head.setNext(tmp); //you must do this second
    }

    public String toString(){//1
        String s = "";
	Node temp = head.getNext();
	while (temp != null) {
	    s = s + temp + " ";
	    temp = temp.getNext();
	}
	return s;
    }

    public void add(int i, String s){//2
	try{
	    Node tmp = head.getNext();
	    Node n = new Node(s);
	    for (int j = 0; j!=i-1; j++){
		tmp = tmp.getNext();
	    }
	    n.setNext(tmp.getNext());
	    tmp.setNext(n);
	}catch(NullPointerException e){
	    System.out.println("Null Exception Whoops");
	}
    }

    public String get(int i){//3
	Node tmp = head.getNext();
	for (int j = 0; j<i; j++){
	    tmp = tmp.getNext();
	}
	return tmp.getData();        	
    }

    public String set(int i, String s){//4
	Node tmp = head.getNext();
	for (int j=0; j<i; j++){
	    tmp = tmp.getNext();
	}
	String output = tmp.getData();
	tmp.setData(s);
	return output;
    }

    public String remove(int i){//5
	Node tmp = head.getNext();
	if (i == 0) {
	    head = head.getNext();
	}
	for (int j=0; j<(i-1); j++){
	    tmp = tmp.getNext();
	}
	String output = tmp.getNext().getData();
	tmp.setNext(tmp.getNext().getNext());
	return output;
    }

    public int find(String s){//6
	Node temp = head.getNext();
	int pos = 0;
        while (temp != null){
	    if (temp.getData().equals(s)){
		return pos;
	    }else{
		pos++;
		temp = temp.getNext();
	    }
	}
	return -1;
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
