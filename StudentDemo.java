import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String studentName;
    private int rollNumber;
    private int marksSubject1;
    private int marksSubject2;
    private int marksSubject3;
    private double percentage;

    public Student(String studentName, int rollNumber, int marksSubject1, int marksSubject2, int marksSubject3) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marksSubject1 = marksSubject1;
        this.marksSubject2 = marksSubject2;
        this.marksSubject3 = marksSubject3;
        calculatePercentage();
    }

    private void calculatePercentage() {
        int totalMarks = marksSubject1 + marksSubject2 + marksSubject3;
        percentage = (totalMarks / 3.0);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public double getPercentage() {
        return percentage;
    }

    public String toString() {
        return "Name: " + studentName + ", Roll Number: " + rollNumber + ", Percentage: " + percentage;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Adding 5 students to the ArrayList
        students.add(new Student("John", 101, 90, 85, 78));
        students.add(new Student("Alice", 102, 78, 92, 87));
        students.add(new Student("Bob", 103, 85, 89, 76));
        students.add(new Student("Eve", 104, 92, 88, 90));
        students.add(new Student("Charlie", 105, 79, 75, 83));

        // Sorting the ArrayList in descending order of percentage
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getPercentage(), s1.getPercentage());
            }
        });

        // Displaying the sorted student information
        System.out.println("Student Information (Sorted by Percentage in Descending Order):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
