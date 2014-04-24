import java.io.*;
import java.util.*;

public class MyStack{
    private Node top;

    public MyStack(){
	top = null;
    }

    public void push(String s){
	Node tmp = new Node(s);
	tmp.setNext(top);
	top = tmp;
    }

    public String pop(){
	String s = top.getData();
	top = top.getNext();
	return s;

    }

    public String peek(){
	return top.getData();
    }

    public boolean isEmpty(){
	return top ==null;
    }

    public String toString(){
	String s ="";
	for (Node tmp = top; tmp!=null; tmp = tmp.getNext()){
	    s += tmp.getData()+", ";
	}
	return s;
    }

}