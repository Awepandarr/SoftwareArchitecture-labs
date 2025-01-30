//The class "Student" is abstract as it will be extended by other classes
public abstract class Student {
    // This is a constant variable so static and final should be written in SNAKE_CASE
    private static final String UNIVERSITY = "Example University";
    //Instance variable for student Information
    private String name = "Unknown";
    private int studentID;
    private String course = "Undeclared";

//Constructor intialize the studentId as other fields have default value
    public Student(int studentID) {
        this.studentID = studentID;
    }

    // Getters method for name has the get prefix
    public String getName() {
        return name;
    }
//Setter method for name has set prefix
    public void setName(String name) {
        this.name = name;
    }
//getter method for student ID
    public int getStudentID() {
        return studentID;
    }
//getter method for course
    public String getCourse() {
        return course;
    }
//set method for course
    public void setCourse(String course) {
        this.course = course;
    }
//Static methos to get the constant university follows the pattern for static fields
    public static String getUniversity() {
        return UNIVERSITY;
    }
//Abstract method that sub class implement for calculating the degree classification
    public abstract double calculateDegreeClassification();
//Overide to String method to provide custom string representation
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", major='" + course + '\'' +
                '}';
    }
}
