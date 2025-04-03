package Q_05;

public class Course {

    //Data member
    private String courseName;
    private String courseCode;
    private Lecturer lecturerInCharge;

    //constructor
    public Course(String courseName, String courseCode, Lecturer lecturer) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lecturerInCharge = lecturer;
    }

    //getter method for courseName
    public String getCourseName() {
        return courseName;
    }

    //setter method for courseName
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    //getter method for courseCode
    public String getCourseCode() {
        return courseCode;
    }

    //setter method for courseCode
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    //getter method for lecturerInCharge
    public Lecturer getLecturerInCharge() {
        return lecturerInCharge;
    }

    //setter method for lecturerInCharge
    public void setLecturerInCharge(Lecturer lecturerInCharge) {
        this.lecturerInCharge = lecturerInCharge;
    }
}
