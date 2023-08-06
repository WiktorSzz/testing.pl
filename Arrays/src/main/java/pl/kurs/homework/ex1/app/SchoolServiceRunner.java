package pl.kurs.homework.ex1.app;

import pl.kurs.homework.ex1.models.Student;
import pl.kurs.homework.ex1.services.SchoolService;

public class SchoolServiceRunner {
    public static void main(String[] args) {
        SchoolService schoolService = new SchoolService(10);
        Student student = new Student("Andrzej", "Warka");
        Student student2 = new Student("Janusz", "Żubr");
        Student student3 = new Student("Monika", "Tatra");
        Student student4 = new Student("Wojtek", "Stodoła");
        Student student5 = new Student("Krzysztof", "Harnold");
        Student student6 = new Student("Witek", "Łukasiewicz");


        schoolService.addStudent(student);
        schoolService.addStudent(null);
        schoolService.addStudent(student2);
        schoolService.addStudent(student3);
        schoolService.addStudent(student4);
        schoolService.addStudent(student5);
        schoolService.addStudent(student6);
        schoolService.deleteLastAddedStudent();
        schoolService.deleteLastAddedStudent();
        schoolService.deleteLastAddedStudent();
        schoolService.deleteLastAddedStudent();
        schoolService.deleteLastAddedStudent();
    }
}
