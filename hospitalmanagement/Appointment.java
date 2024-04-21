package hospitalmanagement;


import java.util.ArrayList;



public class Appointment {
         ArrayList<AppointmentRecord> appointments=new ArrayList<>();
         
         
        public void scheduleAppointment(String patientId ,String doctorId ,String appointmentId,String appointmentDate )
        {       
        	appointments.add(new AppointmentRecord(appointmentId, patientId, doctorId, appointmentDate));
        	System.out.println("Appointment cunfum");
        }
        
        public void cancelAppointment(String appointmentId1 ) {
        	boolean flag = false;
        	for(int i=0;i<appointments.size();i++) {
        	    if(appointments.get(i).getAppointmentId().equalsIgnoreCase(appointmentId1)) {
        	    	appointments.remove(i);
        	    	System.out.println("Appointment cancel succesfull");
        	    	flag=true;
        	    }
             }
        	
        	if(flag==false)
        	 System.out.println("Appointment not found of Id :"+appointmentId1);   
  }
        
       public void  displayAppointmentsByDoctor( String doctorId1) {
    	  boolean flag = false;
    	  for(int i=0;i<appointments.size();i++) {
    	    if(appointments.get(i).getDoctorId().equalsIgnoreCase(doctorId1)) {
    	    	System.out.println(appointments.get(i));
    	    	flag=true;
    	    }
          }
    	  if(flag==false)
         	 System.out.println("Doctor not found of Id :"+doctorId1);   
    	   
      }
       
      public void  displayAppointmentsByPatient(String patientId1) {
    	  boolean flag = false;
    	  for(int i=0;i<appointments.size();i++) {
      	    if(appointments.get(i).getAppointmentId().equalsIgnoreCase(patientId1)) {
      	    	System.out.println(appointments.get(i));
      	    	flag=true;
      	    }
         }
    	  
    	  if(flag==false)
         	 System.out.println("Patient not found of Id :"+patientId1);   
      }
     
      
      public void dispayAppointments() {
    	  boolean flag = false;
    	  
    	  for(int i=0;i<appointments.size();i++) {
    		  System.out.println(appointments.get(i));
    		  flag=true;
           } 
    	  if(flag==false)
          	 System.out.println("No Appointments"); 
      }
      
      





}
