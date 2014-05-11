import java.io.*;
import java.util.*;

public class Heap{

    /*problems getting the HeapSort to fully work T_T*/


    public int[] myHeap = new int[10]; /* default size 10 */
    public int length;
    //arbitrary array that needs sorting:
    public int[] mySortArray = {15,19,10,7,17,16};

    public Heap(){
	length=0;
    }

    public int findMax(){
	return myHeap[0];
    }

    public void insert(int x){ //still slightly flawed :P;
	length+=1;
	myHeap[length] = x;//lowest leftest;
	if (x<myHeap[length/2]){//already at correct position
	    return;
	}
	else
	    swap(length, length/2);
    }

    public void swap(int a, int b){//numbers refer to positions not values;
	/*if (myHeap[a]<myHeap[b]||a==0||b==0)//base case;
	  return;*/
	int tmp = myHeap[b];
	myHeap[b] = myHeap[a];
	myHeap[a] = tmp;
	//swap(b,b/2);
    }

    public void HeapSort(){//it doesn't work ahhhhhhh;
	for (int i=mySortArray.length/2;i>0;i--){
	    if (i==1&&mySortArray[i]>mySortArray[i+2]){
		HeapSwap(i-1,i);
	    }
	    else if (i==1&&mySortArray[i]<mySortArray[i+2]){
		HeapSwap(i-1,i+1);
	    }
	    if (mySortArray[i-1]<mySortArray[(i*2)-1])
		HeapSwap((i*2)-1,i-1);
	    else if (mySortArray[i-1]<mySortArray[(i*2)])
		HeapSwap((i*2),i-1);
		
	}
    }

    public void HeapSwap(int a, int b){//numbers refer to positions not values;
	int tmp = mySortArray[b];
	mySortArray[b] = mySortArray[a];
        mySortArray[a] = tmp;
    }

    public String toString(){
	/*String s ="length: "+length+"\n";
	for (int i=0;i<myHeap.length;i++){
	    s+=" "+i+": "+myHeap[i]+",";
	}
	return s.substring(0,s.length()-1)+"\n";*/
	String s="";
	for (int i=0;i<mySortArray.length;i++){
	    s+=" "+i+": "+mySortArray[i]+",";
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

