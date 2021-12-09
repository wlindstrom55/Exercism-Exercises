class DifferenceOfSquaresCalculator {
	
/*
 * In the first method, we are looking to find the square of the sum of the natural numbers
 * determined by our int input parameter. Natural numbers are numbers that start from 1 and end at infinity.
 * They include whole numbers in them except the number 0.
 * So we first determine our sum by using the following 
 * formula for determining the sum of natural numbers:
 * n(n+1)/2
 * Then we square that result and return it to find the square of the sum.
 * 
 */
    int computeSquareOfSumTo(int input) {
        int sum = input * (input + 1)/2;
        return sum * sum;
    }

/*
 * In the second method, we want to square each natural number based off our input
 * and then return the sum of those numbers. To do so, we use an algebraic formula for finding 
 * the sum of squares of n Natural numbers:
 * Sum n^2 = (n x (n+1) x (2n + 1)) / 6
 */
    int computeSumOfSquaresTo(int input) {
        int sum = input * (input + 1) * (2*input + 1) / 6;
        return sum;
    }

/*
 * In the last method, we pretty simply subtract the sumofsquares from the squareofsum to find our answer.
 */
    int computeDifferenceOfSquares(int input) {
    	int squareOfSum = this.computeSquareOfSumTo(input);
    	int sumOfSquares = this.computeSumOfSquaresTo(input);
    	return squareOfSum - sumOfSquares;
    }

}
