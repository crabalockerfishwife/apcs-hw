import java.io.*;
import java.util.*;

public class RPN{

    private String[] Stack;
    private int top;

    public RPN(){//constructor;
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

    public String evaluate(String s){//it doesnt work blahhhhhh
	String ans = "";
	String[] inputs = s.split(" ");
	for (int i =0;i<inputs.length;i++){
	    System.out.println(Stack.toString());
	    if (s=="+"||s=="-"||s=="*"||s=="/"){//not all the operators blah
	        ans+=pop();
	    }
	    else{
		push(s);
	    }
	}
	return ans;

    }

    public static void main(String[] args){//Driver
	RPN r = new RPN();
	Scanner sc = new Scanner(System.in);
	try{
	    Thread.sleep(1000);
	}catch(Exception e){}
	System.out.println("Enter expression to be evaluated (in postfix notation; for example 3 5 +)");
	String s = sc.nextLine();
	try{
	    Thread.sleep(1000);
	}catch(Exception e){}
	System.out.println("Entered: " +s);
	try{
	    Thread.sleep(1000);
	    System.out.println("Computing...");
	    Thread.sleep(3000);
	}catch(Exception e){}
	System.out.println("Output: " +r.evaluate(s));
    }
}
