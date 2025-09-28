import java.util.ArrayList;

public class Student {
    private int rollno;
    private String name;
    private String course;

    public Student(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "John Doe", "Computer Science"));
        students.add(new Student(2, "Jane Smith", "Mathematics"));
        students.add(new Student(3, "Alice Johnson", "Physics"));
        students.add(new Student(4, "Bob Williams", "Chemistry"));
        students.add(new Student(5, "Emily Brown", "Biology"));

        for (Student student : students) {
            System.out.println("Roll No: " + student.getRollno());
            System.out.println("Name: " + student.getName());
            System.out.println("Course: " + student.getCourse());
            System.out.println();
        }
    }
}