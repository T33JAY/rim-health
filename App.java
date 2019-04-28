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


import java.util.ArrayList;
import java.util.Scanner;


public class App {

    private static ArrayList<Surgeon> surgeons = new ArrayList<Surgeon>();
    private static ArrayList<Specialist> specialists = new ArrayList<Specialist>();
    private static ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    private static ArrayList<Nurse> nurses = new ArrayList<Nurse>();
    private static ArrayList<Patient> patients = new ArrayList<Patient>();
    private static ArrayList<Appointment> appointments = new ArrayList<Appointment>();
    private static Hospital fmcHospital = new Hospital("FMC", "Yola", doctors, nurses, patients);
    private static Admin admin = new Admin("FMC-Admin-01", "Jon Snow");


    public static void main(String[] args) {

        //creation of doctor instances
        Specialist docJeff = new Specialist("Jeff Hardy", "FMC-D-03", "Junior", 7, "Addiction");
        Specialist docJames = new Specialist("James Bae", "FMC-D-01", "Senior", 3, "Cardiovascular");
        Surgeon docPhil = new Surgeon("Phillip Foden", "FMC-D-02", "Junior", 12, "Orthopedic");

        specialists.add(docJeff);
        specialists.add(docJames);

        surgeons.add(docPhil);

        doctors.add(docJames);
        doctors.add(docJeff);
        doctors.add(docPhil);

        //creation of nurse instances
        Nurse nurseJess = new Nurse("FMC-N-01", "Jessica", "Alba", "Senior");
        Nurse nurseDiana = new Nurse("FMC-N-02", "Diana", "Douglas", "Senior");
        Nurse nurseDanny = new Nurse("FMC-N-03", "Danny", "Darko", "Junior");

        nurses.add(nurseJess);
        nurses.add(nurseDiana);
        nurses.add(nurseDanny);

        //creation of patient instance
        int identity = identityCheck();
        staff_login(identity);
        displayOptions(identity);
    }

    public static int inputChecker(int firstOption, int lastOption) {
        Scanner input = new Scanner(System.in);
        boolean check;
        int userResponse = -1;

        do {
            System.out.print("Please enter the number of the option here: ");
            if (input.hasNextInt()) {
                userResponse = input.nextInt();
                if (userResponse < firstOption || userResponse > lastOption) {
                    System.out.println("\nInvalid input");
                    check = false;
                } else {
                    check = true;
                }
            } else {
                System.out.println("\nInvalid input");
                input.next();
                check = false;
            }
        } while (!check);

        return userResponse;
    }


    public static int identityCheck() {

        int response;

        // create instance of hospital here

        System.out.println("\nFederal Medical Center Management System");


        while (true) {
            System.out.println("\nWhich category do you fall under");
            System.out.println("\n1.) Patient\n2.) Doctor\n3.) Admin\n");

            response = inputChecker(1, 3);

            if (response == 1 || response == 2 || response == 3) {

                System.out.println("===============================================\n");

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

            case 1: // Patient
                System.out.print("Please enter your name: ");

                String patientName = input.nextLine();

                //TO DO: enter date of birth

                System.out.print("\nPlease enter your age: ");

                int patientAge = input.nextInt();
                input.nextLine();

                System.out.print("\nPlease specify your gender (Male/Female): ");

                String patientGender = input.nextLine();

                System.out.print("\nPlease enter your address: ");

                String patientAddress = input.nextLine();

                System.out.print("\nPlease specify condition if known, else input 'Unknown': ");

                String patientCondition = input.nextLine();

                Patient newPatient = new Patient(patientName, patientAge, patientGender, patientAddress, patientCondition);
                patients.add(newPatient);

                break;

            case 2:
                while (true) {

                    System.out.print("Enter Doctor ID: ");

                    String doctorID = input.next();

                    System.out.print("Enter Password: ");

                    String doctorPassword = input.next();

                    if (doctorPassword.equals("ValarMoghulis")) {
                        break;
                    } else {
                        System.out.println("Invalid Doctor ID or Password. \n");
                    }
                }


                break;

            case 3:

                while (true) {

                    System.out.print("Enter AdminID: ");

                    String adminID = input.next();

                    System.out.println("Enter Admin Name: ");

                    String adminName = input.nextLine();

                    System.out.print("Enter Password: ");

                    String adminPassword = input.next();

                    if (adminPassword.equals("EarthIsFlat")) {
                        Admin newAdmin = new Admin(adminID, adminName);
                        break;
                    } else {
                        System.out.println("Invalid Admin ID or Password. \n");
                    }

                }

                break;

            default:

                System.out.println("A serious error has occurred");

        }

    }


    public static void displayOptions(int response) {

        Scanner input = new Scanner(System.in);

        switch (response) {

            case 1:
                System.out.println("\nDear patient, what would you like to do today\n");
                System.out.println("1.) Book an appointment\n");
                int patientResponse = inputChecker(1, 1);
                if (patientResponse == 1) {
                    System.out.println("What date would you like to book an appointment (dd/mm/yy): ");
                    String date = input.nextLine();
                    System.out.println("What time would be appropriate for the selected day: (24hr format - hh/mm): ");
                    String time = input.nextLine();
                    Appointment newAppointment = new Appointment(date, time, patients.get(0));
                    appointments.add(newAppointment);

                } else {
                    System.out.println("A serious error has occurred");
                }
                break;

            case 2:
                System.out.println("\nHello Doc! Good to have you back, which category do you fall under\n");
                System.out.println("1.) Specialist \n2.) Surgeon\n");
                int doctorResponse = inputChecker(1, 2);
                switch (doctorResponse) {
                    case 1:
                        System.out.println("\nWhat would you like to do today\n");
                        System.out.println("1.) View appointment list \n2.) View patient list" +
                                "\n3.) Diagnose patient");
                        // TO DO: Specialist specific things
                        int specialistResponse = inputChecker(1, 2);
                        switch (specialistResponse) {
                            case 1:
                                for (Appointment appointment : appointments) {
                                    System.out.println(appointment.getInfo() + '\n');
                                }
                                break;

                            case 2:
                                for (Patient patient : patients) {
                                    System.out.println(patient.toString());
                                }
                                break;

                            case 3:
                                specialists.get(0).diagnosepatient();
                                break;

                            default:
                                System.out.println("A serious error has occurred");
                        }
                        break;
                    case 2:
                        System.out.println("What would you like to do today\n");
                        System.out.println("1.) View pending operations \n2.) View patient list\n");
                        // TO DO: Surgeon specific things
                        int surgeonResponse = inputChecker(1, 2);
                        switch (surgeonResponse) {
                            case 1:
                                for (Appointment appointment : appointments) {
                                    System.out.println(appointment.getInfo() + '\n');
                                }
                                break;

                            case 2:
                                for (Patient patient : patients) {
                                    System.out.println(patient.toString());
                                }
                                break;

                            case 3:
                                surgeons.get(0).operate();
                                break;

                            default:
                                System.out.println("A serious error has occurred");
                        }

                        break;
                    default:
                        System.out.println("A serious error has occurred");

                }
                break;
            case 3:
                System.out.println("\nHello Administrator, Good to have you back. What would you like to do today");
                System.out.println("1.) Admit Patient\n2.) Assign Nurse\n3.) Assign Surgeon\n" +
                        "4.) Generate Bill\n5.) Maintain records\n");
                int adminResponse = inputChecker(1, 5);

                switch (adminResponse) {
                    case 1:
                        System.out.println("What type of ward would you like to assign to the patient: ");
                        String wardType = input.nextLine();
                        admin.admitPatient(patients.get(0), fmcHospital, wardType);
                        break;

                    case 2:
                        System.out.println("Which nurse would you like to assign to the patient\n");
                        for (Nurse nurse : nurses) {
                            System.out.println(nurse.toString());
                        }
                        System.out.print("Enter the ID of the nurse here: ");
                        String adminChoice = input.nextLine();
                        for (Nurse nurse : nurses) {
                            if (nurse.getstaffID() == adminChoice) {
                                admin.assignNurse(nurse, patients.get(0));
                                break;
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Which surgeon would you like to assign to the patient\n");
                        for (Surgeon surgeon : surgeons) {
                            System.out.println(surgeons.toString());
                        }
                        System.out.print("Enter the ID of the surgeon here: ");
                        String adminChoice2 = input.nextLine();
                        for (Surgeon surgeon : surgeons) {
                            if (surgeon.getStaffID() == adminChoice2) {
                                admin.assignSurgeon(surgeon, patients.get(0));
                                break;
                            }
                        }
                        break;

                    case 4:
                        admin.generateBill();
                        break;

                    case 5:
                        admin.maintainRecords();
                        break;

                    default:
                        System.out.println("A serious error has occurred.");

                }
    
                break;

            default:
                System.out.println("A serious error has occurred");

        }

    }
}

