
public class InPersonCourse extends Course {
	String roomNum;

	public InPersonCourse() {
		super();
	}

	public InPersonCourse(String courseNum, int numStuds, int maxStuds, int creds, String roomNum) {
		super(courseNum, numStuds, maxStuds, creds);
		this.roomNum = roomNum;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nRoom number: " + roomNum;
	}
	
	
}
