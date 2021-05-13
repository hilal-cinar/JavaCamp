package kodlamaio;

public class Student extends User {

	private String DateOfRegistration;

	public Student() {
	}

	public Student(String DateOfRegistration) {
		this.DateOfRegistration = DateOfRegistration;
	}

	public String getDateOfRegistration() {
		return DateOfRegistration;
	}

	public void setDateOfRegistration(String DateOfRegistration) {
		this.DateOfRegistration = DateOfRegistration;
	}
}
