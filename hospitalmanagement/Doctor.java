package hospitalmanagement;


public class Doctor {
        String doctorId,doctorName,specialization,contactNumber;
        
        public Doctor() {
		}

		public Doctor(String doctorId, String doctorName, String specialization, String contactNumber) {
			super();
			this.doctorId = doctorId;
			this.doctorName = doctorName;
			this.specialization = specialization;
			this.contactNumber = contactNumber;
		}

		public String getDoctorId() {
			return doctorId;
		}

		public void setDoctorId(String doctorId) {
			this.doctorId = doctorId;
		}

		public String getDoctorName() {
			return doctorName;
		}

		public void setDoctorName(String doctorName) {
			this.doctorName = doctorName;
		}

		public String getSpecialization() {
			return specialization;
		}

		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}

		
		
		
		@Override
		public String toString() {
			return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
					+ ", contactNumber=" + contactNumber + "]";
		}

		public void displayDoctor() {
			System.out.println("doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
					+ ", contactNumber=" + contactNumber );
		}
        
        
}
