import java.io.*;
import java.util.*;

public class BST{

    /* haven't figured out delete method...attmepted to write a toString method...*/

    private Node root;
    private int height;//variable added to help w toString method (lol)

    public BST(){
	root = null;
	height = 0;
    }

    public String toString(){
	return toString(root, "trololol");
    }

    public String toString(Node n, String type){//helper function
	/*as you can see, i tried to make a toString method. at the moment it..........seems to only work for the tree i created in the driver :P*/
	String s = "";	
	for (int i=0;i<=height-1&&n!=null;i++){
	    if (type.equals("left")){
		s+="\n";}
	    s+=n.toString();
		s+=toString(n.getLeft(),"left");
		s+=toString(n.getRight(),"right");
	}
	return s;
    }

    public Node getRoot(){
	return root;
    }

    public void insert(int x){
	//System.out.println("Initial height: " + height);
	Node prev = null;
	Node tmp = root;
	while (tmp!=null){
	    if (tmp.getData()==x){
		return;
	    }
	    else if(x<tmp.getData()){
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
	else if (x<prev.getData()){
	    prev.setLeft(new Node(x));
	    if (prev.getRight()==null){
		height++;
	    }
	}
	else{
	    prev.setRight(new Node(x));
	    if (prev.getLeft()==null){
		height++;
	    }
	}
	//System.out.println("Final height: " + height);
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

    /*
       //c.2 kids
       //1. find largest value on node's left subtree --> go left once then as far right as we can (or smallest on right)
       //2. copy that value over
       //3. recursively delete that value pretending the deletion node is the root
       //4.copy the value to replace the node to delete

       */
    
    public void delete (int x){/* bad code bad code bad code incomplete incomplete*/
        Node tmp = search(x);
	Node parent = tmp.getParent();//i do realize this method does not exist
	if (Node has zero children || Node has one child){
	    if (x<tmp.getData()&&tmp.getLeft()!=null){
		tmp.setLeft(null);
	    }
	    if (x>tmp.getData()&&tmp.getRight()!=null){
		tmp.setRight(null);
	    }

	}
	else if(Node has two children){
	    //ugh
	}
	
    }
    
    
}
