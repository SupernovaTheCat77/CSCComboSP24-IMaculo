
public class RealTimeRemoteCourse extends OnlineCourse {
	String zoomPass;

	public RealTimeRemoteCourse() {
		super();
	}

	public RealTimeRemoteCourse(String courseNum, int numStuds, int maxStuds, int creds, String zoomPass) {
		super(courseNum, numStuds, maxStuds, creds);
		this.zoomPass = zoomPass;
	}

	public String getZoomPass() {
		return zoomPass;
	}

	public void setZoomPass(String zoomPass) {
		this.zoomPass = zoomPass;
	}
	
	@Override
	public String toString() {
		return "Course: " + courseNum + "\nNumber of students: " + numStuds + "\nMaximum number of students: " + maxStuds + "\nCredits: " + creds + "\nZoom password: " + zoomPass;
	}
}
