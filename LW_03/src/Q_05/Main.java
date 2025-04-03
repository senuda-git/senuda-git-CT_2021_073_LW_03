package Q_05;

public class Main {
    public static void main(String[] args) {

        //input data
        Lecturer lecturer01 = new Lecturer("Dr.Kesavan" , "JAVA");
        Course course01 = new Course("JAVA" , "IT01" , lecturer01);
        Student student01 = new Student("Silva" , "BICT" , "Gaming development");

        Lecturer lecturer02 = new Lecturer("Dr.Carl" , "Software Engineering");
        Course course02 = new Course("Networking" , "IT02" , lecturer01);
        Student student02 = new Student("Sammy" , "BCS" , "CyberSecurity");

        //output data
        System.out.println("\nstudent Name is : " + student01.getStudentName());
        System.out.println("Student Degree Name is : " + student01.getDegreeName());
        System.out.println("Student learning Course Name is : " + student01.getCourseFollowing());
        System.out.println("Course Name is : " + course01.getCourseName());
        System.out.println("Course Code is : " + course01.getCourseCode());
        System.out.println("Lecturer Name is : " + lecturer01.getLecturerName());
        System.out.println(lecturer01.getLecturerName() + " Teaching Course is : " + lecturer01.getCourseTeaching());

        System.out.println("\nstudent Name is : " + student02.getStudentName());
        System.out.println("Student Degree Name is : " + student02.getDegreeName());
        System.out.println("Student learning Course Name is : " + student02.getCourseFollowing());
        System.out.println("Course Name is : " + course02.getCourseName());
        System.out.println("Course Code is : " + course02.getCourseCode());
        System.out.println("Lecturer Name is : " + lecturer02.getLecturerName());
        System.out.println(lecturer02.getLecturerName() + " Teaching Course is : " + lecturer02.getCourseTeaching());

    }
}
