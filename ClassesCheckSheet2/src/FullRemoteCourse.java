
public class FullRemoteCourse extends OnlineCourse {
	String email;

	public FullRemoteCourse() {
		super();
	}

	public FullRemoteCourse(String courseNum, int numStuds, int maxStuds, int creds, String email) {
		super(courseNum, numStuds, maxStuds, creds);
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nEmail: " + email;
	}
	
}
