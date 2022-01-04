import java.util.Arrays;

/* Breakdown:
 * In this exercise you are given a string representing a matrix of numbers. Our task is to return 
 * the rows and columns of that matrix in the correct order. So given a string with embedded newlines like:
 * 9 8 7
 * 5 3 2
 * 6 6 7
 * representing this matrix:
 *     1  2  3
 *    |---------
 *  1 | 9  8  7
 *  2 | 5  3  2
 *  3 | 6  6  7
 * our code should be able to spit out:
 *  - A list of the rows, reading each row left-to-right while moving top-to-bottom across the rows
 *  - A list of the columns, reading each column top-to-bottom while moving from left-to-right.
 *  Using our example here, the return output (rows) would be as follows:
 *   - 9,8,7
 *   - 5,3,2
 *   - 6,6,7
 *  and columns would be as follows:
 *   - 9,5,6
 *   - 5,3,2
 *   - 7,2,7
 */

class Matrix {

	private int[][] matrix; //2D array declaration. Array of arrays.
	//In java, when accessing the element from a 2D array using arr[first][second],
	//the first index can be thought of as the desired row, and the second index is 
	//used for the desired column. Just like 1d arrays, 2d arrays are indexed starting at 0.
	
    Matrix(String matrixAsString) {
    	//First we take our param, matrixAsString, and split it up by 'row', stored in a new string array
    	//split here is a String[] method that splits the string around matches of the given regular expression (regex)
    	String[] lines = matrixAsString.split("\n"); //"\n" here matches a line-feed (newline) char. That's where we want to split it.
    	int i = 0;
    	for(String line : lines) { // for each line in our split-up String[] 'lines,' 
    		//we want to 'split' up our individual rows by column. 
    		//Arrays.stream() means basically we want to take the elements of an array and return
    		//a sequential stream of all the elements of that array. We will "split" these elements by " ".
    		//mapToInt() returns an IntStream consisting of the results of applying the given
    		//function to the elements of this stream. syntax = mapToInt(LongToIntFunction mapper)
    		//"::" is called method reference. It is basically a reference to a single method (in this case Integer.parseint()).
    		//Instream.toArray() returns an array containing the elements of this stream
    		int[] maLine = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).toArray();
    		//So at the end of this chain we are left with an int array, maLine, that was formerly
    		//our String array lines (which was rows of 3 numbers).
    		//Now our arrays elements should be individual ints.
    		
    		if(matrix == null) {
    			matrix = new int[lines.length][maLine.length];
    		}
    		//if the matrix instance is null, we create a new int matrix w/ the matrices described above
    		//is this our initialization?
    		matrix[i] = maLine; //matrix index of (iterator) = maLine array
    		i++;
    		//'i' is our iterator. 
    		
    	} //end of for statement!
    }
    
    //This method returns a list of the rows, reading each row left-to-right while moving top-to-bottom across the rows.
    //notice that the rowNumber is decremented, as we are dealing w/ arrays and looking for the index position required.
    int[] getRow(int rowNumber) {
        return matrix[--rowNumber];
    }

    //This method returns a list of the columns, reading each column top-to-bottom while moving from left-to-right.
    int[] getColumn(int columnNumber) {
        return Arrays.stream(matrix).mapToInt(ints -> ints[columnNumber - 1]).toArray(); 
        //here we are returning a stream and lambda expression which decrements the columnNumber for array index positioning
        //notice it actually is converted to an array at the end
    }
}
