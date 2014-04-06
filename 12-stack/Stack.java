import java.io.*;
import java.util.*;

public class Stack{

    private String[] Stack;
    private int top;

    public Stack(){//constructor;
	Stack = new String[10];
	top = Stack.length-1;
    }
    
    /*public boolean isEmpty(){
	return Stack[top]==null;
	}*/

    public void push(String s){
	if (Stack[top] == null){
	    Stack[top] = s;
	}
	else if (top == 0)
	    grow();
	top--;
	Stack[top] = s;
    }

    public String pop(){
	String s = Stack[top];
	top++;
	return s;
    }

    public String peek(){
	return Stack[top];
    }

     public void grow(){
	String[] temp = new String[Stack.length+1];
	for (int i=0;i<Stack.length;i++)
	    temp[i+1] = Stack[i];
	Stack = temp;
	top+=1;
     }

    public String toString(){//toString
	String s = "";
	for (int i=0;i<Stack.length;i++){
	    s+=i+": "+Stack[i]+", ";
	}
	s+="\ntop: "+top;
	return s;
    }

}
