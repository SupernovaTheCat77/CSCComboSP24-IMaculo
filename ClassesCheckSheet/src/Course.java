
public class Course {
	String courseNum; //This is where you declare all of the variables that make up the object.
	int numStudents;
	int maxStudents;
	int credits;
	
	//Constructors allow users to create an object of its type in the first place. In other words, immensely important.
	//Right click on starter line -> Source -> Generate constructor
	
	public Course() { //This constructor is empty. Unless otherwise decided, there will be one empty constructor and one full constructor to account for the necessary possibilities (user inputs no information or all information)
		super();
	}

	public Course(String courseNum, int numStudents, int maxStudents, int credits) { //Much like a method, one constructor will receive the variables that make up the object.
		super();
		this.courseNum = courseNum;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}

	public String getCourseNum() { //Right click on starter line -> Source -> Generate getters & setters
		return courseNum;
	}

	public void setCourseNum(String courseNum) { //Getters allow users to individually call pieces of information within one object, and setters allow users to set the values within an object to whatever they wish.
		this.courseNum = courseNum;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public int findOpenings() { //You can create normal methods, such as this one, that do tasks so the user doesn't have to do it themselves. Very useful.
		return (this.maxStudents - this.numStudents);
	}

	@Override
	public String toString() { //Right click on starter line -> Source -> Generate toString
		return "Course: " + courseNum + "\nNumber of students: " + numStudents + "\nMaximum number of students: " + maxStudents + "\nOpenings left: " + findOpenings() + "\nCredits: " + credits;
	} //The normal return line looks super messy when printed. It's recommended to alter what's returned so it looks nicer. (Capitalization, new lines, spaces, etc)
	
	
	
	
}
