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
	File output = new File("CHORE.OUT.txt");
	FileWriter fWriter = new FileWriter(output);
	PrintWriter pWriter = new PrintWriter(fWriter);
	pWriter.println(compute(input));
	pWriter.close();
    }

    public int compute(String s){
	int time=0; //will be most efficient time to perform chores;
	String[] inputlines = s.split("\n");
	int[][] data = new int[inputlines.length][102];
	for (int r=0;r<inputlines.length;r++){
	    int k=0;
	    for (int c=0;c<inputlines[r].length();c++){
		try{
		    if (!(inputlines[r].substring(c,c+1)).equals(" ")){
			data[r][k] = Integer.parseInt(inputlines[r].substring(c,c+1));
			k++;
		    }
		    }catch(StringIndexOutOfBoundsException e){}
	    }
	}
	//2d array of data has been established;
	int done = 0;
	int[] completed = {};
	while (completed<inputlines.length()){
	    for (int r=1;r<inputlines.length();r++){
		boolean cando = True;
		for (c=2;c<inputlines[r].length();c++){
		    if !(data[r][c]==0 || Arrays.asList(completed).contains(data[r][c])){
			    cando=False;
			
			}
		    if (cando.equals(True)){
			done++;
			time+=data[r][1];
			completed[r]=data[r][0];
			  
		    }
		}

		}
	    //time+=data[1][1]; 
	    }
	}
	return time;

    }


    public static void main (String[] args) throws IOException{
	ChoresQ cq = new ChoresQ();
	cq.solve("CHORE.IN.txt");
    }


}
