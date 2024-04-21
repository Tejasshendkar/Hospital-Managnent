package hospitalmanagement;

import java.util.Date;



public class AppointmentRecord {
          String patientId,doctorId,appointmentId;
          String appointmentDate;
          
          public AppointmentRecord() {
			
		}

		public AppointmentRecord(String appointmentId,String patientId, String doctorId,  String appointmentDate) {
			this.patientId = patientId;
			this.doctorId = doctorId;
			this.appointmentId = appointmentId;
			this.appointmentDate = appointmentDate;
		}

		public String getPatientId() {
			return patientId;
		}

		public void setPatientId(String patientId) {
			this.patientId = patientId;
		}

		public String getDoctorId() {
			return doctorId;
		}

		public void setDoctorId(String doctorId) {
			this.doctorId = doctorId;
		}

		public String getAppointmentId() {
			return appointmentId;
		}

		public void setAppointmentId(String appointmentId) {
			this.appointmentId = appointmentId;
		}

		

		
		@Override
		public String toString() {
			return "AppointmentRecord [patientId=" + patientId + ", doctorId=" + doctorId + ", appointmentId="
					+ appointmentId + ", appointmentDate=" + appointmentDate + "]";
		}

		public void displayAppointment() {
		System.out.println(	"patientId=" + patientId + ", doctorId=" + doctorId + ", appointmentId="
					+ appointmentId + ", appointmentDate=" + appointmentDate );
		}
         
		
		
          
}
