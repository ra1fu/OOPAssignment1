import Models.Student;
import Models.Teacher;
import Models.Person;
import Models.School;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File studentsFile = new File("C:\\Users\\Rauan\\IdeaProjects\\asik1OOP\\src\\students (1).txt");
        File teachersFile = new File("C:\\Users\\Rauan\\IdeaProjects\\asik1OOP\\src\\teachers (1).txt");

        Scanner studentssc = new Scanner(studentsFile);
        Scanner teacherssc = new Scanner(teachersFile);

        School school = new School();

        while (studentssc.hasNext()) {

            String name = studentssc.next();
            String surname = studentssc.next();
            int age = studentssc.nextInt();
            boolean gender = studentssc.next().equals("Male");

            Student student = new Student(name, surname, age, gender);

            while (studentssc.hasNextInt()) {
                int grade = studentssc.nextInt();
                student.addGrade(grade);
            }

            System.out.println(student + " " + "and my GPA is: " + student.calculateGPA());

            school.addMember(student);

        }
        while (teacherssc.hasNextLine()) {
            String name = teacherssc.next();
            String surname = teacherssc.next();
            int age = teacherssc.nextInt();
            boolean gender = teacherssc.next().equals("Male");
            String subject = teacherssc.next();
            int experience = teacherssc.nextInt();
            int salary = teacherssc.nextInt();

            Teacher teacher = new Teacher(name, surname, age, gender, subject, experience, salary);

            if(experience > 10){
                System.out.println(name + " " + "get a raise on 10% and now his salary: " + teacher.giveRaise(10));
            }

            school.addMember(teacher);

        }

        System.out.println(school);
    }
}