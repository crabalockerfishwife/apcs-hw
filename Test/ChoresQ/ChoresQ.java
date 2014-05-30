import java.io.*;
import java.util.*;

public class ChoresQ{
    /* no works T_T */
    
    public void solve(String s) throws IOException{
	/*read in file specified */
	File f = new File(s);
	String input = "";
	try {
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                input+=sc.nextLine()+" \n";
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
	System.out.println(input);
	/* write new file */
	File output = new File("DIGIT.OUT.txt");
	FileWriter fWriter = new FileWriter(output);
	PrintWriter pWriter = new PrintWriter(fWriter);
	pWriter.println(compute(input));
	pWriter.close();
    }

    public int compute(String s){
	int output =0; //will be most efficient time to perform chores;
	String[] inputlines = s.split("\n");
	int[][] data = new int[inputlines.length][102];
	for (int r=0;r<inputlines.length;r++){
	    int countdown=inputlines[r].length();
	    for (int c=0;countdown>0;){
		//try{
		    if (!(inputlines[r].substring(c,c+1)).equals(" ")){
			    data[r][c] = Integer.parseInt(inputlines[r].substring(c,c+1));
			    c++;
		    }
		    countdown--;
		    //}catch(StringIndexOutOfBoundsException e){}
	    }
	}
	//2d array of data has been established;
	System.out.println(data[2][2]);
	
	return output;

    }


    public static void main (String[] args) throws IOException{
	ChoresQ cq = new ChoresQ();
	cq.solve("CHORE.IN.txt");
    }


}
