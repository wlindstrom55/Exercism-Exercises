class RotationalCipher {
	/* Breakdown: 
	 * Create an implementation of the rotational cipher, also sometimes called the Caesar cipher.
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the letters in the alphabet using 
	 * an integer key between 0 and 26. Using a key of 0 or 26 will always yield the same output due to modular arithmetic.
	 * The letter is shifted for as many values as the value of the key.
     * The general notation for rotational ciphers is ROT + <key>. The most commonly used
     * rotational cipher is ROT13.
     * A ROT13 on the Latin alphabet would be as follows:
     * Plain:  abcdefghijklmnopqrstuvwxyz
     * Cipher: nopqrstuvwxyzabcdefghijklm
	 * Note: this is a rotational cipher, meaning that if given a shift key = 0 || 26, you will simply receive the input text as normal
	 */
	private int shiftKey;
	
    RotationalCipher(int shiftKey) {
        this.shiftKey = shiftKey;
    }
    
    int rot(int ch) {
        if (!Character.isLetter(ch)) { //Character method to determine if the specified char is a letter
            return ch;
        }
        char first = Character.isUpperCase(ch) ? 'A' : 'a'; //ternary operation to see if 'first' should be A or a to match the case of ch. 
        return first + (ch + shiftKey - first) % 26; //return statement in which the rotational part of the cipher takes place. 
    } //Complicated part: 'ch' - 'A' gives you the ASCII number of the letter 0-25, which is then shifted up by the shiftkey.
    //Then, after dividing that number by 26, the remainder is added to 'A' to give back up the proper char for the letter.
    
    String rotate(String data) {
        return data.codePoints() //intstream source operation that returns the ASCII values of the chars passed as an argument
                .mapToObj(this::rot) //intermediate intstream operation that returns an object-valued stream consisting of the
                //results of applying the given function to the elements of this stream
                //in this case, we are mapping our ascii chars by applying the 'rot' function above (?)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append) //.collect() is a
                //terminal operation which allows us to perform mutable fold operations (repackaging elements to some 
                //data structures and applying some additional logic, concatenating them, etc.)
                .toString(); //turns stringbuilder to string to be returned
    }
}
