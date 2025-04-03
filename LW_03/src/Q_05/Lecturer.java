package Q_05;

public class Lecturer {

    //Data member
    private String lecturerName;
    private String courseTeaching;

    //constructor
    public Lecturer(String lecturerName, String courseTeaching) {
        this.lecturerName = lecturerName;
        this.courseTeaching = courseTeaching;
    }

    //getter method for lecturerName
    public String getLecturerName() {
        return lecturerName;
    }

    //setter method for lecturerName
    public void setLecturerName(String lecturerName) {
        this.lecturerName = lecturerName;
    }

    //getter method for courseTeaching
    public String getCourseTeaching() {
        return courseTeaching;
    }

    //setter method for courseTeaching
    public void setCourseTeaching(String courseTeaching) {
        this.courseTeaching = courseTeaching;
    }
}
