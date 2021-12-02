public class Hamming {
	public int hammingD;
	
    public Hamming(String leftStrand, String rightStrand) {
    		//first we check if the two strings have the same length, if not, exception is thrown
    	if(leftStrand.length() != rightStrand.length()) {
    		throw new IllegalArgumentException();
    	}
    		//if both lengths are the same, we continue further comparison
    		//we iterate over both strings comparing chars. If both are the same, nothing happens. If one is different, we add it to our counter.
    	for(int i = 0; i <leftStrand.length(); i++) {
    		if(leftStrand.charAt(i) != rightStrand.charAt(i)) {
    			hammingD += 1;
    		}
    	}
    
    }

    public int getHammingDistance() {
        return this.hammingD = hammingD;
    	//throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
