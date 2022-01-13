import java.util.Arrays;

class Triangle {
	/*
	 * Solution inspired by (https://exercism.org/tracks/java/exercises/triangle/solutions/elshize)
	 * Determine if a triangle is equilateral, isosceles, or scalene. 
	 * An equilateral triangle has all three sides the same length. 
	 * An isosceles triangle has at least two sides the same length. 
	 * (It is sometimes specified as having exactly two sides the same length,
	 * but for the purposes of this exercise we'll say at least two.)
	 * A scalene triangle has all sides of different lengths.
	 * Note: For a shape to be a triangle at all, all sides have to be of length > 0,
	 * and the sum of the lengths of any two sides must be greater than or equal
	 * to the length of the third side (otherwise we should throw exception!)
	 */
	private double[] sides;
	
    Triangle(double side1, double side2, double side3) throws TriangleException {
        sides = new double[] {side1, side2, side3}; //instantiating our doubles array that makes up our Triangle object
        Arrays.sort(sides); //this Arrays method sorts the sides in ascending order by default
      //this if statement below is our check to make sure the triangle is legal based on input parameters.
        //Since we sorted our array from highest to lowest, & we know any two sides must be greater than or equal to the last side, we can do the following:
        if (sides[0] + sides[1] <= sides[2]) { 
        	throw new TriangleException();
        }
    }

    boolean isEquilateral() { //all sides must be equal
    	return areTheyEqual(sides[0], sides[1], sides[2]);
    	//return sides[0] == sides[1] && sides[1] == sides[2];
    	//the statement above would work, and returns true if side0=side1 AND side1=side2
    	//we can't do 'return sides[0] == sides[1] == sides[2];' here. 'a==b==c' will not compile unless c is a boolean, which makes sense when you think about it.
    	//This is roughly because java doesn't have a shortcut operator for '=='. So we must do individual equalities.
    }

    boolean isIsosceles() { //two sides must be equal
        return sides[0] == sides[1] || sides[1] == sides[2];
    }

    boolean isScalene() { //sides must all be unequal
        return sides[0] != sides[1] && sides[1] != sides[2];
    }
    
    boolean areTheyEqual(double... a) { //this is a method I added in for determining equality of various inputs, mostly for the isEquilateral() method.
    	//it is an unnecessary method but I was annoyed at not being able to easily compare 3 inputs
    	double VALUE = a[0]; //this method is mainly useful if you think you will need functionality w/ varying number of args.
    	for(double i: a) {
    		if(i != VALUE) {
    			return false;
    		}	
    	}
    	return true;
    }
} //end class
