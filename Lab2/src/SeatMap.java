import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SeatMap {

	
	public static String[][] seatMap(String filename, int rows, int columns) {
		// Reads in a file of names and outputs a 2 dimensional array
		String[][] seatmap = null;
		
		try {
	    	File inputFile = new File(filename);
		    Scanner input = new Scanner(inputFile);
		    seatmap = new String[(rows)][(columns)];
		    
		    
		    for(int x = 0; x < rows; x++) {
		    	for(int y = 0; y < columns; y++) {
		    		if(input.hasNextLine()) {
		    			seatmap[x][y] = input.nextLine();
		    		}else {
		    			seatmap[x][y] = "Empty Seat";
		    			}
		    		}
		    	}
		    	input.close();
		    	
		    	
		    }
		catch (IOException e) {
			System.err.println("\n Error in file input \n");
			
		}
		return seatmap;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("How many Rows? ");
		int rows = read.nextInt();
		System.out.println("How many Columns? ");
		int columns = read.nextInt();
		
		
		String[][] seats = seatMap("names.dat",rows,columns);
		
		String[] store;
		
		
		System.out.println("What seat do you want to look at?(make one -1 to quit) ");
		String studentloc = read.next();
		
		store = studentloc.split(",");
		
		//Integer.parseInt()
		int srow = Integer.parseInt(store[0]);
		
		int scol = Integer.parseInt(store[1]);
		
		System.out.println(seats[srow][scol]);
		
		read.close();
	}
	
	
}
