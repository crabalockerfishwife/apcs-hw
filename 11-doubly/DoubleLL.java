import java.io.*;
import java.util.*;

public class DoubleLL<E>{

    private class Node<E>{
	E data;
	Node<E> next, prev;
    
	public Node(E d){
	    this.data=d;
	}

	public String toString(){
	    return ""+data;
	}

	public void setData(E d){
	    data = d;
	}

	public E getData(){
	    return data;
	}
	
	public void setNext(Node<E> n){
	    next = n;
	}

	public Node<E> getNext(){
	    return next;
	}

	public void setPrev(Node<E> p){
	    prev = p;
	}

	public Node<E> getPrev(){
	    return prev;
	}
    }

    private Node<E> current;
    
    public void insert (E d){
	Node<E> n = new Node<E>(d);
	if (current==null){
	    current=n;
	    current.setNext(n);
	    current.setPrev(n);
	}
	else if(current.getPrev() == null){
	    n.next=current;
	    n.setPrev(current.getPrev());
	    current.getPrev().setNext(n);
	    current.setPrev(n);
	    current=n;
	}
	else{
	    n.setNext(current);
	    n.setPrev(current.getPrev());
	    current.getPrev().setNext(n);
	    current.setPrev(n);
	    current = n;
	}
    }
    
    public E getCurrent(){
	return current.getData();
    }

    public void forward(){
	if (current.getNext()!=null)
	    current = current.getNext();
    }

    public void back(){
	if (current.getPrev()!=null)
	    current=current.getPrev();
    }

    public String toString(){
	if (current==null)
	    return "";
	Node<E> tmp = current;
	while (tmp.getPrev()!=current)
	    tmp = tmp.getPrev();
	String s = "";
	while (tmp!=current){
	    s = s+tmp.getData()+" ";
	    tmp=tmp.getNext();
	}
	s = s+current.getData()+"";
	return s;
    }

    public static void main(String[] args){
	DoubleLL<String> L = new DoubleLL<String>();
	System.out.println(L);
	L.insert("hello");
	System.out.println(L);
	L.insert("world");
	System.out.println(L);
	L.insert("three");
	System.out.println(L);

	//stop
	System.out.println();

	System.out.println(L.getCurrent());
	L.forward();
	System.out.println(L.getCurrent());
	L.insert("inserted");
	System.out.println(L);

	//stop2

    }
}