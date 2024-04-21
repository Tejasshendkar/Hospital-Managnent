package hospitalmanagement;



public class Patient {
      String patientId,patientName,gender,contactNumber;
      int age;
      
      public Patient() {
    	  
	}

	public Patient(String patientId, String patientName, String gender, String contactNumber, int age) {
		this.patientId = patientId;
		this.patientName = patientName;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.age = age;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public void displayPatient()  {
	      System.out.println("patientId=" + patientId + ", patientName=" + patientName + ", gender=" + gender
				+ ", contactNumber=" + contactNumber + ", age=" + age );
	}
	
	
	
	
      
      
}
