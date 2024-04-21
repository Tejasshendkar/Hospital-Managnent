package hospitalmanagement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestHospital {

	public static void main(String[] args) {
		boolean exit=true;
		Appointment appointment=new Appointment();
//		Doctor doctor=new Doctor();
		Hospital hospital=new Hospital();
		Scanner sc=new Scanner(System.in);
		
		while(exit) {
		System.out.println("\n1.Add Doctor \n2.Add Patient \n3.Take Appointment \n4.Display Appointment  \n5.Cancel Appointment"
						+" \n6.Remove Ptient\n7.Update Patient\n8.Remove Doctor\n9.Update Doctor"
						+ "\n10.Search Doctor By Specialization "
						+ " \n11.Display All Patients \n12.Display All Doctors \n0.Exit  ");
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		switch (choice) {
		case 1 : {
			String Did=Utillid.getdId();
			System.out.println("enter the doctor name:");
			String doctorName=sc.next();
			System.out.println("enter the specialization");
			String specialization=sc.next();
			System.out.println("enter contact number");
			String contactNumber=sc.next();
			
			hospital.addDoctor(new Doctor(Did,doctorName ,specialization, contactNumber));
			
			break; 
		}
		case 2 :{
			String pid=Utillid.getpId();
			System.out.println("enter the patient name ");
			String patientName=sc.next();
			System.out.println("enter gender");
			String gender=sc.next();
			System.out.println("enter contact number");
			String contactNumber=sc.next();
			System.out.println("enter age");
			int age=sc.nextInt();
			
		     hospital.addPatient(new Patient(pid, patientName, gender, contactNumber, age));
		     
		    break; 
		     }
		case 3 :
			{    
				
			String Aid=Utillid.getaId();
			System.out.println("enter Doctor id");
			String Did=sc.next();
			
			System.out.println("enter the patient id");
			String Pid=sc.next();
			
			System.out.println("enter date");
			String date=sc.next();
			
			if(hospital.patients.containsKey(Pid) && hospital.doctors.containsKey(Did)) {
			appointment.scheduleAppointment(Pid, Did, Aid, date);
			}
			else {
				System.out.println("Appointment unsucessfull");
			}
			
			break;
		   }
			
			
		case 4 :{
			appointment.dispayAppointments();
			break;
		}
		
		case 5: {
			System.out.println("enter the appointment id");
			String aid=sc.next();
			appointment.cancelAppointment(aid);
			break;
		}
		case 6 :{
			System.out.println("enter patient id");
			String pid=sc.next();
			hospital.removePatient(pid);
			break;
		}
		case 7: {
			try {
			System.out.println("enter patient id");
			
			String pid=sc.next();
			hospital.dispayPatient(pid);
			
			System.out.println("enter the patient name ");
			String patientName=sc.next();
			System.out.println("enter gender");
			String gender=sc.next();
			System.out.println("enter contact number");
			String contactNumber=sc.next();
			System.out.println("enter age");
			int age=sc.nextInt();
			
			hospital.updatePatient(pid,new Patient(pid, patientName, gender, contactNumber, age));
			}catch (Exception e) {
				e.printStackTrace();
			}
			break;
			
		}
		case 8 : {
			System.out.println("enter the doctor id :");
			String doctorid=sc.next();
			hospital.removeDoctor(doctorid);
			break;
		}
		case 9 :{
			System.out.println("enter doctor id");
			
			String dId=sc.next();
			hospital.dispayDoctor(dId);
			
			System.out.println("enter the doctor name:");
			String doctorName=sc.next();
			System.out.println("enter the specialization");
			String specialization=sc.next();
			System.out.println("enter contact number");
			String contactNumber=sc.next();
			hospital.updateDoctor(dId, new Doctor(dId, doctorName, specialization, contactNumber));
			break;
		}
			
		case 10:{
			System.out.println("enter the specialization");
			String specialization=sc.next();
			
			ArrayList<Doctor> doctlist=new  ArrayList<>();
			ArrayList<Doctor> Rdoctlist = hospital.searchDoctorBySpecialization(specialization);
			doctlist.addAll(Rdoctlist);
			
			Iterator itr=doctlist.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			
			break;
		}
		case 11:{
			hospital.displayAllPatients();
			break;
			
		}
		case 12: {
			hospital.displayAllDoctors();
			break;
			
		}
		case 0 :
			exit=false;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + choice);
		}

	}
	}

}
