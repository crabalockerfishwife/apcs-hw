/*
copied and pasted linked list driver
 */
import java.io.*;
import java.util.*;

public class Node{

    private int data;
    private Node left,right;

    public Node (int d){
	int = d;
	left = null;
	right = null;
    }

    public void setData(String d){
	data = d;
    }

    public String getData(){
	return data;
    }

    public void setNext(Node n){
	next = n;
    }

    public Node getNext(){
	return next;
    }

    public String toString(){
	return data;
    }
}