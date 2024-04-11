import java.util.ArrayList;

public class CSClasses {

	public static void main(String[] args) {
		
		ArrayList<Course> courseList = new ArrayList<>(); //Creating an ArrayList that holds all of the courses we're using.
		
		//ArrayLists are like arrays, but much better for more complex objects. They have a lot more functionality and usability for non-primitive variable types.
		
				courseList.add(new Course("CSC1060", 15, 20, 5)); //Adding three courses that are fully declared
				courseList.add(new Course("CSC1019", 17, 28, 3));
				courseList.add(new Course("ENG2012", 20, 30, 6));
				courseList.add(new Course()); //Adding three empty courses to declare later
				courseList.add(new Course());
				courseList.add(new Course());
				
				//Declarations of the empty courses begin here
				courseList.get(3).setCourseNum("PSY1021"); //Like an array, the index starts at zero, so it goes from 0-5 instead of 1-6
				courseList.get(3).setNumStudents(27); //This is how to manually set an object within an ArrayList, as is the previous one line and the next twelve.
				courseList.get(3).setMaxStudents(40);
				courseList.get(3).setCredits(3);
				
				courseList.get(4).setCourseNum("ENG1021");
				courseList.get(4).setNumStudents(23);
				courseList.get(4).setMaxStudents(30);
				courseList.get(4).setCredits(4);
				
				courseList.get(5).setCourseNum("GEO1021");
				courseList.get(5).setNumStudents(12);
				courseList.get(5).setMaxStudents(15);
				courseList.get(5).setCredits(6);
				
				//System.out.println(courseList.toString()); //Classic toString. Works, but looks bad.
				printList(courseList); //Calling the method below.
	}
	
	public static void printList(ArrayList<Course> courseList) { //Basically like toString but since we don't have ArrayList ourselves, we create a new method to print it as we want it.
		for (int i = 0; i < courseList.size(); i++) { //Goes through every value in the ArrayList and prints the associated course as well as a new line.
			System.out.println(courseList.get(i).toString() + "\n");
		}
	}
	

}
