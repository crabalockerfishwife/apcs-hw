import java.io.*;
import java.util.*;

public class Stack{

    private String[] Stack;
    private int top;

    public Stack(){//constructor;
	Stack = new String[10];
	top = 0;
    }
    
    /*public boolean isEmpty(){
	return Stack[top]==null;
	}*/

    public void push(String s){
	if (Stack[top].equals(null)){
	    Stack[top] = s;
	}
	else{
	    Stack[top+1] = s;
	    top++;
	}
    
    }

    public String pop(){
	String s = Stack[top];
	top++;
	return s;
    }

    public String peek(){
	return Stack[top];
    }

    /*public void grow(){
	String[] temp = new String[Stack.length+1];
	for (int i=0;i<Stack.length;i++)
	    temp[i+1] = Stack[i];
	Stack = temp;
	top+=1;
	}*/

    public String toString(){//toString
	String s = "";
	for (int i=0;i<Stack.length;i++){
	    s+=i+": "+Stack[i]+", ";
	}
	s+="\ntop: "+top;
	return s;
    }

}
