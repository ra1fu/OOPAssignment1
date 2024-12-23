package Models;

import java.util.ArrayList;

public class Student extends Person {
    private int studentID;
    private int grade;
    private static int id = 1;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        studentID = id++;
        grades = new ArrayList<>();
    }

    public void addGrade(int grade) {

        grades.add(grade);
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            System.out.println("No grades available for " + getName());
            return 0.0;
        }
        double gpa = 0;
        for (int grade : grades) {
            gpa += grade;
        }
        gpa = 4 * ((gpa / grades.size()) / 100);
        return gpa;
    }

    public static boolean isGender(String a) {
        return "Male".equalsIgnoreCase(a);
    }



    private void generateID(){
        id++;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + " I am a student with ID " + studentID;
    }


}
