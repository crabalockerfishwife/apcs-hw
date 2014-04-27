import java.io.*;
import java.util.*;

public class Driver{
    
    public static void main (String[] args){
	BST b = new BST();
	System.out.println(b);
	b.search(5);
	b.search2(b.getRoot(),5);
	b.insert(7);
	/* as previously stated i have no idea how to test the above 3 methods */
	System.out.println(b);
    }

}
