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


public class Appointment {

	private String condition;
	
	private String day;
	
	private String month;
	
	private String year;
	
	private String hour;
	
	private String minute;
	
	private String meridian;
	
	private String date;
	
	private String time;
	
	private Doctor doctor;
	
	private Patient patient;
	
	
	
	public Appointment (
			String aCondition, String aDay, String aMonth, String aYear,
			String aHour, String aMinute, String aMeridian, Doctor aDoctor, 
			Patient aPatient
	) 
	{
    	
		condition = aCondition;
		
		day = aDay;
		
		month = aMonth;
		
		year = aYear;
		
		hour = aHour;
		
		minute = aMinute;
		
		meridian = aMeridian;
		
		date =  day+"/"+month+"/"+year;
		
		time = hour+":"+minute+" "+meridian.toUpperCase();
        
        doctor = aDoctor;
        
        patient = aPatient;
        
    }
	
	public String getCondition() {
		
		return this.condition;
		
	}
	
	public String getDate() {
		
		return this.date;
		
	}
	
	public String getTime() {
		
		return this.time;
		
	}
	
	public Doctor getDoctor() {
		
		return this.doctor;
		
	}
	
	public Patient getPatient() {
		
		return this.patient;
		
	}
	
	public String getInfo() {
		
		return (
			"Appointment Info:\n"+
			"Doctor:"+this.doctor.getName()+"\n"+
			"Patient:"+this.patient.getpatientName()+"\n"+
			"Date:"+this.date+"\n"+
			"Time:"+this.time+"\n"+
			"Condition:"+this.condition+"\n"
		);
		
	}
	
	
}
