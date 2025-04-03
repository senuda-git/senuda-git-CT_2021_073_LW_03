package Q_05;

public class Student {
    //Data member
    private String studentName;
    private String degreeName;
    private String courseFollowing;

    //constructor
    public Student(String studentName, String degreeName, String courseFollowing) {
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courseFollowing = courseFollowing;
    }

        //getter method for studentName
    public String getStudentName() {
        return studentName;
    }

    //setter method for studentName
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    //getter method for degreeName
    public String getDegreeName() {
        return degreeName;
    }

    //setter method for degreeName
    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    //getter method for courseFollowing
   public String getCourseFollowing() {
        return courseFollowing;
    }

    //setter method for courseFollowing
    public void setCourseFollowing(String courseFollowing) {
        this.courseFollowing = courseFollowing;
    }
}
