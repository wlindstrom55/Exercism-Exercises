import java.util.HashMap;

class Scrabble {
/*
 * Scoring is as follows:
 * Letter                           Value
A, E, I, O, U, L, N, R, S, T       1
D, G                               2
B, C, M, P                         3
F, H, V, W, Y                      4
K                                  5
J, X                               8
Q, Z                               10
* "cabbage" should be scored as worth 14 points:
* 3 for c, 1 point for a x2, 3 points for b x2, 2 points for g x2, 1 point for e
* Additionally: you can play a double or a triple letter
* and you can play a double or a triple word
* Thoughts: probably need to iterate through string, and could maybe have a case statement flow that assigns points.
*  - do I need to deal with the problem (?) of upper-case and lower-case. Might be able to use a method.
 */
	
	//need a field for our score counter
	private int score = 0;
	//need a data structure that holds our scores for a given character
	private HashMap<Character, Integer> values = new HashMap<>();
	
    Scrabble(String word) {
    	//1
    	values.put('A', 1);
    	values.put('E', 1);
    	values.put('I', 1);
    	values.put('O', 1);
    	values.put('U', 1);
    	values.put('L', 1);
    	values.put('N', 1);
    	values.put('R', 1);
    	values.put('S', 1);
    	values.put('T', 1);
    	//2
    	values.put('D', 2);
    	values.put('G', 2);
    	//3
    	values.put('B', 3);
    	values.put('C', 3);
    	values.put('M', 3);
    	values.put('P', 3);
    	//4
    	values.put('F', 4);
    	values.put('H', 4);
    	values.put('V', 4);
    	values.put('W', 4);
    	values.put('Y', 4);
    	//5
    	values.put('K', 5);
    	//8
    	values.put('J', 8);
    	values.put('X', 8);
    	//10
    	values.put('Q', 10);
    	values.put('Z', 10);
  
    	/*
    	 * So now with our character values assigned in the HashMap, we want a way to iterate through our String parameter test input,
    	 * to do so, we will use an enhanced for loop iterating through the characters in the String, which we convert to an array of characters.
    	 * Then, the score equals the score + the corresponding value of the char in our HashMap. Note that we use .toUpperCase(characters)
    	 * to ensure that the character given to our HashMap is upper case, like the values of each of our pairs in the HashMap
    	 */
    	for(Character character: word.toCharArray()) {
    		score += values.get(Character.toUpperCase(character));
    	}
    }

    int getScore() {
    	return this.score;
    }

}
