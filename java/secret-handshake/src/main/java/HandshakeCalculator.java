import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* Breakdown:
 * You and your friends in the "know" when it comes to binary decide to come up with a secret handshake.
 * Given a decimal #, convert it to the appropriate sequence of events for a secret handshake.
 * 1 = wink
10 = double blink
100 = close your eyes
1000 = jump
10000 = Reverse the order of the operations in the secret handshake.
  * For example:
  * Given the input 3, the function would return the array ["wink", "double blink"] because 3 is 11 in binary
  * Given the input 19, the function would return the array ["double blink", "wink"] because 19 is 10011 in binary. 
  * Notice that the addition of 16 (10000 in binary) has caused the array to be reversed.
  * * * * * * * * * * * * * * * * *
  * Thoughts: We have an enum 'Signals' with the responses to return based on our input
  * -we're going from decimal to binary here. SO here's our expectation:
  *  Decimal # 1 = 1 in binary = 'wink'
  *  # 2 = 10 = 'double blink'
  *  # 3 = 11    (contains wink & double blink)
  *  # 4 = 100 = 'close your eyes'
  *  # 5 = 101 (should contain wink and close your eyes)
  *  # 6 = 110 (should contain double blink and close your eyes)
  *  # 7 = 111 (should contain wink, double blink, close your eyes)
  *  # 8 = 1000 = 'jump'
  *  # 9 = 1001 (should contain wink, jump)
  *  # 10 = 1010 (should contain double blink, jump)
  *  #11 = 1011 (contains wink, double blink, jump)
  *  #12 = 1100 (should contain close your eyes, jump)
  *  #13 = 1101 (should contain wink, close your eyes, jump)
  *  #14 = 1110
  *  #15 = 1111  (contains wink, double blink, close your eyes, jump)
  *  #16 = 10000 = 'reverse the order of the operations in the secret handshake'
  *  #17 = 10001
  *  #18 = 10010
  *  #19 = 10011 = 'double blink & wink'
  *  #20 = 10100
  *  #21 = 10101
  *  #22 = 10110
  *  #23 = 10111
  *  #24 = 11000 (contains jump)
  *  #31 = 11111 ( contains jump, close your eyes, double blink, wink) 
  *  #35 = 100011 (contains wink, double blink)
  *  #51 = 110011 (contains double blink, wink)
  *  #111 = 1101111 (contains wink, DB, CYE, jump)...not reversed b/c no 10000!
 */
class HandshakeCalculator {
/* Breakdown 2:
	We will use bitwise operators to accomplish our task. Bitwise operators work on
	binary digits of input values. We can apply these to the integer types:
	long, int, short, char, and byte. Bitwise operators work on a binary
	equivalent of decimal numbers and perform operations on them bit by bit
	as per the given operator:
	
	 First, the operands are converted to their binary representation
	 Next, the operator is applied to each binary number and the result is calculated
	 Finally, the result is converted back to its decimal representation
	 
	Bitwise operators are further classified as bitwise logical and bitwise shift operators:
	Logical : AND(&), OR(|), XOR(^), NOT(~)  ---- but we are focused on & here.
		****The AND operator compares each binary digit of two integers and 
		gives back 1 if both are 1, otherwise it returns 0. (similar to && boolean)
	AKA: a bitwise & takes two binary strings and returns a new binary string.
	Given two binary bits, the bitwise & gives the following results:
	1 & 1 = 1
	1 & 0 = 0
	0 & 1 = 0
	0 & 0 = 0
	*/
	
    List<Signal> calculateHandshake(int number) { //method start
    	
    	List<Signal> signals = new ArrayList<Signal>();
    /*
    Breakdown 3:
    So are essentially converting our number into a binary string
    An expression of the form (number & x) == x essentially means that the binary representation
    of the number contains ones at every position the binary representation of x does moving right-to-left.
    13 & 5 == 5 is true, 13 is 1101 and 5 is 101. Since we are moving right-to-left checking values, it works.
    13 & 6 != 6 since 13 is 1101 and 6 is 110. Moving right-to-left, this does not equate, even though there is a 110 in the binary string.
    17 & 16 == 16 since 17 is 10001 and 16 is 10000.
    */
    	
    	if((number & 1) == 1) {
    		signals.add(Signal.WINK);
    	}
    	if ((number & 2) == 2) {
    		signals.add(Signal.DOUBLE_BLINK);
    	}
    	if ((number & 4) == 4) {
            signals.add(Signal.CLOSE_YOUR_EYES);
        }
        if ((number & 8) == 8) {
            signals.add(Signal.JUMP);
        }
        if ((number & 16) == 16) {
            Collections.reverse(signals); //collections method to reverse arraylist
        }
        return signals; //return arraylist
    }
}
