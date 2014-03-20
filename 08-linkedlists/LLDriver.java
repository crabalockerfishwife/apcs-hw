import java.io.*;
import java.util.*;

public class LLDriver{

    public static void main (String[] args){
	MyLinkedList L = new MyLinkedList();
	System.out.println(L);
	System.out.println();

	L.add("Fish");//0
	System.out.println(L);
	System.out.println();

	L.add("Fishfish");//0
	System.out.println(L);
	System.out.println();

	/*L.add("Sully");
	System.out.println(L);
	L.add("Mike");
	System.out.println(L);
	L.add("Randall");
	System.out.println(L);
	L.add("Boo");
	System.out.println(L);*/
	
	L.add(1, "Lolfrogs");//2
	System.out.println(L);
	System.out.println();

	System.out.println(L.get(1));//3
	System.out.println();

	System.out.println(L.set(1, "Pants"));//4
	System.out.println();

	System.out.println(L.remove(1));//5
	System.out.println();

	System.out.println(L.find("Fish"));//6
	System.out.println();
	
	System.out.println(L.length());//7
	System.out.println();
    }
}
