import java.io.*;
import java.util.*;

public class MyLinkedList{

    private Node head;
    
    public MyLinkedList(){//dont even need
	head = null;//by default
    }

    public void add(String d){
	Node tmp = new Node(d);
	//head = tmp;
	tmp.setNext(head); //you must do this first
	head = tmp; //you must do this second

    }
    public String toString(){
	return ""+head+head.getNext();
    }






}