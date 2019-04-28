/*
 * @name 			RIM Health
 *
 * @author	 		Ross Hart
 *
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 *
 * @date			Sun, 28th April, 2019
 *
 * */

import java.util.concurrent.atomic.AtomicInteger;


public class Appointment {

    private static final AtomicInteger count = new AtomicInteger(0);

    private String appointmentID;

    private String date;

    private String time;

    private Patient patient;




    public Appointment (String date, String time, Patient patient) {

        this.appointmentID = "FMC-A-0" + count.incrementAndGet();

        this.date =  date;

        this.time = time;

        this.patient = patient;


    }
    
    public String getAppointmentID(){
        
    	return this.appointmentID;
    
    }


    public String getDate() {
        
    	return this.date;
    
    }

    public String getTime() {
        
    	return this.time;
    
    }

    public Patient getPatient() {
        
    	return this.patient;
    
    }

    public String getInfo() {
        
    	return (
                "Appointment Info:\n"+
        		"Patient:"+this.patient.getpatientName()+"\n"+
                "Date:"+this.date+"\n"+
                "Time:"+this.time+"\n"
        );

    }
    
}
