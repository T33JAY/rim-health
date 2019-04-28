/*
 * @name 			RIM Health
 * 
 * @author	 		Ruth Gideon
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Mon, 22nd April, 2019
 * 
 * */

public class Surgeon extends Doctor {


    private final String type;

    
    
    public Surgeon(String dname, String did, String dlevel, int sexp, String type) {
        
    	super(dname, did, dlevel, sexp);

        
    	this.type = type;
    
    }

    public String getType() {
        
    	return this.type;
    
    }
    
    @Override
    public String toString() {
        
    	return (super.getName() + " - " + this.type);
    
    }

    public void operate() {
        
    	System.out.println("Operation in progress");
    
    }

}
