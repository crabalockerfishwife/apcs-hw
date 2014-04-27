import java.io.*;
import java.util.*;

public class BST{

    /* i think my code is good, though i have no idea how to implement toString methods and such to check it */

    private Node root;

    public BST(){
	root = null;
    }

    public String toString(){
	return null;
    }

    public Node getRoot(){
	return root;
    }

    public void insert(int x){
	Node prev = null;
	Node tmp = root;
	while (tmp!=null){
	    if (tmp.getData()==x){
		return;
	    }
	    else if(tmp.getData()>x){
		prev = tmp;
		tmp = tmp.getLeft();
	    }
	    else{
		prev = tmp;
		tmp = tmp.getRight();
	    }
	}
	if (prev==null){
	    root = new Node(x);
	}
	else if (tmp.getData()>x){
	    prev.setLeft(new Node(x));
	}
	else{
	    prev.setRight(new Node(x));
	}   
    }

    public Node search(int x){
	Node tmp = root;
	while (tmp!=null&&tmp.getData()!=x){
	    if (x<tmp.getData()){
		tmp = tmp.getLeft();
	    }
	    else{
		tmp = tmp.getRight();
	    }
	}
	return tmp;
    }

    public Node search2(Node c, int x){
	if (c==null || c.getData()==x){
	    return c;
	}
	else if(c.getData()>x){
	    return search2(c.getLeft(),x);
	}
	else{
	    return search2(c.getRight(),x);
	}
    }
    
    
}
