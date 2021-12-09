public class Hamming {
	public int hammingD;
	
    public Hamming(String leftStrand, String rightStrand) {
    /*
     * first we do our checks to make sure neither String parameter is empty, and 
     * that they are of equal length.
     */
    	if(leftStrand.isEmpty() && !rightStrand.isEmpty()) {
    		throw new IllegalArgumentException("left strand must not be empty.");
    	}
    	if(!leftStrand.isEmpty() && rightStrand.isEmpty()) {
    		throw new IllegalArgumentException("right strand must not be empty.");
    	}
    	if(leftStrand.length() != rightStrand.length()) {
    		throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    	}
    	if(leftStrand.length() == rightStrand.length()) {
    		//if both lengths are the same, we continue further comparison
    		//we iterate over both strings comparing chars. If both are the same, 
    		//nothing happens. If one is different, we add it to our counter.
    	for(int i = 0; i < leftStrand.length(); i++) {
    		if(leftStrand.charAt(i) != rightStrand.charAt(i)) {
    			hammingD += 1;
    		}
    	}
    	}
    
    }

    public int getHammingDistance() { //this method returns the instance variable of our Hamming Distance.
        return this.hammingD = hammingD;
    }
}
