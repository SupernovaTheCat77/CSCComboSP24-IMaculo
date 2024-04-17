import java.util.ArrayList;

public class CSClasses {

	public static void main(String[] args) {
		ArrayList<Course> courseList = new ArrayList<>();
		
		courseList.add(new InPersonCourse ("CSC1060", 14, 20, 4, "BP116"));
		courseList.add(new FullRemoteCourse("ENG1020", 37, 50, 3, "jdoe@frontrange.edu"));
		courseList.add(new RealTimeRemoteCourse("GEO1034", 18, 20, 5, "hEok9W"));
		
		for (int i = 0; i < courseList.size(); i++) {
			System.out.println(courseList.get(i).toString() + "\n");
		}
	}
	
	public static void printCourse(Course course) {
		System.out.println("Room number: " + course.get);
	}

}
