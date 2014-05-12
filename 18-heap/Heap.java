import java.io.*;
import java.util.*;

public class Heap{

    /*problems getting the HeapSort to fully work T_T*/

    //arbitrary array that needs sorting:
    public int[] myHeap = {15,19,10,7,17,16};

    public Heap(){
    }

    public int findMax(){
	return myHeap[0];
    }

    public void insert(int x){ //still slightly flawed :P;
	myHeap[myHeap.length] = x;//lowest leftest;
	if (x<myHeap[myHeap.length/2]){//already at correct position
	    return;
	}
	else
	    swap(myHeap.length, myHeap.length/2);
    }

    public void HeapSort(){//it doesn't work ahhhhhhh [problems when multiple iterations needed];
	for (int i=myHeap.length/2;i>0;i--){
	    if (myHeap[i-1]<myHeap[(i*2)-1])
		swap((i*2)-1,i-1);
	    else if (myHeap[i-1]<myHeap[(i*2)])
		swap((i*2),i-1);
		
	}
    }

    public void swap(int a, int b){//numbers refer to positions not values;
	int tmp = myHeap[b];
	myHeap[b] = myHeap[a];
        myHeap[a] = tmp;
    }

    public String toString(){
	String s="";
	for (int i=0;i<myHeap.length;i++){
	    s+=" "+(i+1)+": "+myHeap[i]+",";
	}
	return s.substring(0,s.length()-1)+"\n";
    }

    public static void main (String[] args){
	Heap h = new Heap();

	/* TEST CODE
	System.out.println(h.toString());
	h.insert(16);
	System.out.println(h.toString());
	h.insert(18);
	System.out.println(h.toString());
	h.insert(22);
	System.out.println(h.toString());
	h.insert(19);
	System.out.println(h.toString());
	*/
	
	System.out.println("\nInitially unsorted array:\n");
	System.out.println(h);
	h.HeapSort();
	System.out.println("\nAfter HeapSort:\n");
	System.out.println(h);
	

	
	
    }



}

