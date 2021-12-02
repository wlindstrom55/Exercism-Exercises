import java.time.LocalDate;
import java.time.LocalDateTime;

/*
 * Instructions:
 * The LocalDate represents only the date without time and zone id, while the LocalDateTime represents date
 * with time, so in order to convert LocalDate to LocalDateTime we must append the time with the LocalDate.
 * -Given a moment in time, add a gigasecond onto that.
 */
public class Gigasecond {
	public LocalDateTime birth; //instantiation of the moment we are adding a gigasecond to.
	private static Long GIGA = (long)Math.pow(10, 9); //this is our representation of a gigasecond
	/*
	 * Math.pow(arg1, arg2) returns the value of the first arg raised to the power of the second arg. (arg1
	 * is the base, arg2 the exponent)
	 * Here, we are instantiating the giga-second as a Long, and casting the result of the math operation into
	 * a primitive long.
	 */
	
    public Gigasecond(LocalDate birthDate) { //local date constructor for class
    	this.birth = birthDate.atStartOfDay();
    	/*
    	 * atStartOfDay() 
    	 * This method returns the LocalDateTime after *appending the mid night*
    	 * time at the end of the LocalDate.
    	 */
      
    }

    public Gigasecond(LocalDateTime birth) { //localdateTime constructor for class
    	this.birth = birth;
        
    }

    public LocalDateTime getDateTime() {
        return birth.plusSeconds(GIGA); 
        /*
         * plusSeconds() is a localdatetime method that returns a copy of this 
         * LocalDateTime with the specified number of seconds added. We are adding one GS
         */
    	
    }
}
