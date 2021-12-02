public class FootballMatchReports {    
    public static String onField(int shirtNum) {
    	String strang = "";
    		switch (shirtNum) {
    		case 1:
    			strang = "goalie";
    			break;
    		case 2:
    			strang = "left back";
    			break;
    		case 3:
    			strang = "center back";
    			break;
    		case 4:
    			strang = "center back";
    			break;
    		case 5:
    			strang = "right back";
    			break;
    		case 6:
    			strang = "midfielder";
    			break;
    		case 7:
    			strang = "midfielder";
    			break;
    		case 8:
    			strang = "midfielder";
    			break;
    		case 9:
    			strang = "left wing";
    			break;
    		case 10:
    			strang = "striker";
    			break;
    		case 11:
    			strang = "right wing";
    			break;
    		default:
    			throw new IllegalArgumentException("Illegal Argument Exception");
    				}
		return strang;
    	} 
    }
