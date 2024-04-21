package hospitalmanagement;

import java.util.ArrayList;
import java.util.HashMap;

public class Hospital {
	HashMap<String, Patient> patients;
	HashMap<String, Doctor> doctors;

	public Hospital() {
		this.patients = new HashMap<>();
		this.doctors = new HashMap<>();
	}

	public void addPatient(Patient patient) {
		patients.put(patient.getPatientId(), patient);
		patient.displayPatient();
	}

	public void removePatient(String patientId) {	
		if(patients.containsKey(patientId)) {
		   patients.remove(patientId);
		   System.out.println("patient remove successfull of id:"+patientId);
		}
		else {
			System.out.println("patient not available of id:"+patientId);
		}
		
 	}
	
	public void updatePatient(String patientId,Patient updatedPatient ) {
		   
			for (Patient patient:patients.values()) {
				if(patient.getPatientId().equals(patientId)) {	
					patients.replace(patientId, updatedPatient);
					System.out.println("patient updated successful");
					updatedPatient.displayPatient();
		
		      }
			}
		
		
	}
	
	
	public void addDoctor(Doctor doctor ){
		doctors.put(doctor.getDoctorId(), doctor);
		doctor.displayDoctor();
	}
	
	public void removeDoctor(String doctorId){
		
		doctors.remove(doctorId);
	}
	
	public void updateDoctor(String doctorId,Doctor updatedDoctor ) {
		
		doctors.replace(doctorId, updatedDoctor);
		
	}
	
	public ArrayList<Doctor> searchDoctorBySpecialization(String specialization1) {
		
		
		ArrayList<Doctor> doctList=new ArrayList<>();
		for(Doctor doctor:doctors.values()) {
		if( doctor.getSpecialization().equals(specialization1))
		{
			doctList.add(doctor);
		}
		}
		return doctList;
		}
	
	public void dispayPatient(String patientId) {
		int flag = 0;
		for (Patient patient:patients.values()) {
			if(patient.getPatientId().equals(patientId)) {
				patient.displayPatient();
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			throw new UserNotFoundException("Patient id not found");
		}
		
	}
	
	
	public void dispayDoctor(String doctorId) {
		int flag = 0;
		for (Doctor doctor:doctors.values()) {
			if(doctor.getDoctorId().equals(doctorId)) {
				doctor.displayDoctor();
				flag = 1;
			}
		}
		
		if(flag == 0) {
			throw new UserNotFoundException("Doctor id not found");
		}
	}
	
	
	public void displayAllPatients() {
		
		int flag=0;
		for (Patient patient:patients.values()) {
			patient.displayPatient();
			flag=1;
		}
		
		if(flag==0) {
			System.out.println("no patient available");
		}
	}
	public void displayAllDoctors(){
		int flag=0;
		for (Doctor doctor:doctors.values()) {
			doctor.displayDoctor();	
			flag=1;
			}
		
		if(flag==0) {
			System.out.println("no Doctor available");
		}
	}
	
}