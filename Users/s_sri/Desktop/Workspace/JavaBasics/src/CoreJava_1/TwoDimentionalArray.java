package CoreJava_1;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		int a [][]=new int [3][5];
		// first row
		a [0][0]=1;
		a [0][1]=2;
		a [0][2]=3;
		a [0][3]=4;
		a [0][4]=5;
	    
		//second row
		a [1][0]=6;
		a [1][1]=7;
		a [1][2]=8;
		a [1][3]=9;
		a [1][4]=10;
		// third row
		a [2][0]=11;
		a [2][1]=12;
		a [2][2]=13;
		a [2][3]=14;
		a [2][4]=15;
		
		//System.out.println("Total number of columns"+" "+a.length);
		//System.out.println("Total number of columns"+" "+a[2].length);
		//System.out.println(a[1][3]);
		
		// to print all values of the 2d array eg Usage: fetch values from excel 
		for (int row=0;row<a.length;row++)  {
			for (int column=0;column<a[0].length;column++) // inner loop{
				
				System.out.println(a[row][column]);
			}
			
			
		}
			
		
		}
		
	


