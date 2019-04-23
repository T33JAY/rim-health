/*
 * @name 			RIM Health
 * 
 * @authors 		Inagbo Tamuno
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Tue, 23rd April, 2019
 * 
 * */

import java.util.Scanner;


public class App {


    public static int identityCheck() {

        int response;

        System.out.println("\nFederal Medical Center Management System");
        
        while (true) {
        	
            Scanner input = new Scanner(System.in);
            
            System.out.println("\nWhich category do you fall under");
            
            System.out.println("\n1.) Patient\n2.) Doctor\n3.) Admin\n");
            
            System.out.print("Please input the number of the category here: ");
            
            response = input.nextInt();
            
            
            if (response == 1 || response == 2 || response == 3) {
            
            	System.out.println("=========================\n");
                
            	break;
            
            } else {
              
            	System.out.println("\nPlease enter the correct input!");
            
            }
        
        }
        
        return response;
    
    }


    public static void staff_login(int response) {

        Scanner input = new Scanner(System.in);
	    
        switch (response) {
            
        	case 1:
                
        		System.out.print("Please enter your name: ");
                
        		String patientName = input.nextLine();
                
        		System.out.print("Please enter your address: ");
                
        		String patientAddress = input.nextLine();
                
        		// patient1 = new Patient(patientName, patientAddress, "N/A", "N/A");
                
        		break;
            
        	case 2:
                
        		System.out.print("Enter Doctor ID: ");
                
        		String doctorID = input.next();
                
        		System.out.print("Enter Password: ");
                
        		String doctorPassword = input.next();
                
        		//TO DO: perform check on hash on existing doctors
                
        		//TO DO: if check is valid create instance of doctors
                
        		break;
            
        	case 3:
                
        		System.out.print("Enter AdminID: ");
                
        		String adminID = input.next();
                
        		System.out.print("Enter Password: ");
                
        		String adminPassword = input.next();
                
        		//TO DO: perform check on hash on existing admins
                
        		//TO DO: if check is valid create instance of adminID
                
        		break;
            
        	default:
                
        		System.out.println("A serious error has occurred");

        }

    }
    
    public static void main (String[] args) {
    	
    	//TO DO: Methods to display options
    	
    	//TO DO: Methods to actually do something on this here app
    	
    }

}
