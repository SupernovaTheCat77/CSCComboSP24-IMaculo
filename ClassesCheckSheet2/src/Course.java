
public class Course {
	String courseNum;
	int numStuds;
	int maxStuds;
	int creds;
	
	public Course() {
		super();
		this.courseNum = "ABC0000";
		this.numStuds = 0;
		this.maxStuds = 0;
		this.creds = 0;
	}

	public Course(String courseNum, int numStuds, int maxStuds, int creds) {
		super();
		this.courseNum = courseNum;
		this.numStuds = numStuds;
		this.maxStuds = maxStuds;
		this.creds = creds;
	}

	public String getCourseNum() {
		return courseNum;
	}

	public void setCourseNum(String courseNum) {
		this.courseNum = courseNum;
	}

	public int getNumStuds() {
		return numStuds;
	}

	public void setNumStuds(int numStuds) {
		this.numStuds = numStuds;
	}

	public int getMaxStuds() {
		return maxStuds;
	}

	public void setMaxStuds(int maxStuds) {
		this.maxStuds = maxStuds;
	}

	public int getCreds() {
		return creds;
	}

	public void setCreds(int creds) {
		this.creds = creds;
	}

	@Override
	public String toString() {
		return "Course: " + courseNum + "\nNumber of students: " + numStuds + "\nMaximum number of students: " + maxStuds + "\nCredits: " + creds;
	}
	
	
}
