import java.io.*;
import java.util.*;

public class DigitsQ{
    /* works as intended :D */

    public void solve(String s) throws IOException{
	/* read in file specified */
	File f = new File(s);
	String input = "";
	try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                input+=sc.nextLine();
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
	/* write new file */
	File output = new File("DIGIT.OUT.txt");
	FileWriter fWriter = new FileWriter(output);
	PrintWriter pWriter = new PrintWriter(fWriter);
	pWriter.println(compute(Integer.parseInt(input)));
	pWriter.close();
    }

    public String compute(int i){//helper function
	String s =i+" ";
	while (i>9){
	    int[] digits = new int[String.valueOf(i).length()];
	    for (int a=0;a<digits.length;a++){
	        digits[a]=i%10;
		i=i/10; 
	    }
	    i=1;
	    for (int b=0;b<digits.length;b++){
		i*=digits[b];
	    }
	    s+=i+" ";
	}
	return s;
    }
	 

    public static void main (String[] args) throws IOException{
	DigitsQ dq = new DigitsQ();
	dq.solve("DIGIT.IN.txt");
    }
    
}
