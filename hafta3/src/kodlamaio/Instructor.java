package kodlamaio;

public class Instructor extends User {

	private String phoneNumber;
	private String detail;

	public Instructor() {
	}

	public Instructor(String phoneNumber, String detail) {

		this.phoneNumber = phoneNumber;
		this.detail = detail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}
}
