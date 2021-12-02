abstract class Fighter {
	
    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) { //if wizard is vulnerable, do 10 dmg, otherwise 6.
    	if (wizard.isVulnerable()) {
    		return 10;
    	}
    	return 6;
    }
}

class Wizard extends Fighter {

	private boolean isSpellPrepared = false; //no spell prepared by default
	
	@Override
	public String toString() {
		return "Fighter is a Wizard";
	}
	
    @Override
    boolean isVulnerable() {
    	//this return value is predicated a bit on the prepareSpell() method. Here, this method is checking
    	//If the wizard is vulnerable or not. The answer depends on if he has a spell prepared, so we can use
    	//the opposite of the return value of prepareSpell(). If he IS prepared, he ISNT vulnerable, and
    	//vice versa.
        return (!this.isSpellPrepared);
    }

    @Override
    int damagePoints(Fighter warrior) {
        //if true, return 12. Otherwise return 3.
    	if(this.isSpellPrepared) {
    		return 12;
    	}
    	return 3;
    }

    void prepareSpell() { //simple method to set the instance of Wizard to true if called.
    	this.isSpellPrepared = true;
    }

}
