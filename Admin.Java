public class Admin {

    String adminID;
    String adminName;

    public Admin (String adminID, String adminName){
        this.adminID = adminID;
        this.adminName = adminName;
    }

    public String getAdminID() {
        return adminID;
    }

    public void setAdminID(String adminID) {
        this.adminID = adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public void generateBill(){
        //TO DO: Logic??
    }
    
    public void maintainRecords(){
        //TO DO: Logic??
    }

    public void assignNurse(Nurse nurseID, Patient patientID){
    
        System.out.println("You have successfully assigned a nurse to the patient with ID " + patientID);
    }

    public void admitPatient(Patient patientID){
        /* 
        TO DO: Check for unassigned ward (already existing instances)
               Assign to the ward to the patient with patientID 
        */
        System.out.println("You have successfully admitted " + patientName + " as a patient");
    }


    public void assignSurgeon(Doctor staffID, Patient patientName){
        System.out.println("You have successfully assigned a surgeon to " + patientName);
    }


}
