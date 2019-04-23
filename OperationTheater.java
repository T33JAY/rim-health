/*
 * @name 			RIM Health
 * 
 * @authors 		Ross Hart
 * 					Ruth Gideon
 * 					Inagbo Tamuno
 * 					Maryam Modibbo
 * 
 * @description 	A CSC 306 course project to implement a Health Management System in Java.
 * 
 * @date			Sat, 20th April, 2019
 * 
 * */

public class OperationTheater {
  
    String theatreID;
    String type;
    String facility;


    public OperationTheatre(String theatreID, String type, String facility) {

        this.theatreID = theatreID;

        this.type = type;

        this.facility = facility;
    }

    public String getTheatreID() {

        return theatreID;

    }

    public void setTheatreID(String staffID) {

        this.theatreID = theatreID;

    }

    public String getType() {

        return type;

    }

    public void setType(String type) {

        this.type = type;

    }

    public String getFacility() {

        return facility;

    }

    public void setFacility(String facility) {

        this.facility = facility;

    }


}
