import java.util.*;
import java.io.*;

public class QuickSort2 {

    //I missed about 92.682927% of class on friday, so Anya and I worked together on this
    //dont work whoops

    public Integer[] a;
    Random rnd;

    public static void main(String[] args) {
        QuickSort2 qs2 = new QuickSort2(5);
	System.out.println(qs2.toString());
	//System.out.println(qs2.quicksort());
    }

    public QuickSort2(int n){
	rnd = new Random();
	a = new Integer[n];
	for (int i=0;i<n;i++)
	    a[i]=rnd.nextInt(100);
    }
    
    
    public QuickSort2(){
	this(10);
    }

    public String toString(){
	String s = "";
        s+=Arrays.toString(a);
	return s;
    }

    public Integer[] quicksort() {
	if (a.length <= 1) {
	    return a;
	}
	else {
	    int low = 0;
	    int high = a.length - 1;
	    return partition(a, low, high);
	}
    }

    public Integer[] partition(Integer[] a, int L, int R) {
	int p = L + (int)(Math.random()*(R - L + 1));
	int t = a[p];
	a[p] = a[R];
	a[R] = t;
	int wall = L;
	for(int x = L; x < R; x++) {
	    if(a[x] < a[R]) {
		t = a[x];
		a[x] = a[wall];
		a[wall] = t;
		wall++;
	    }
	}
	t = a[wall];
	a[wall] = a[R];
	a[R] = t;
	return wall;
    }
    



}
