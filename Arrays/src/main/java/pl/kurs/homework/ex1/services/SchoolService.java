package pl.kurs.homework.ex1.services;

import pl.kurs.homework.ex1.models.Student;


public class SchoolService {
    private Student studentsArray[];
    private int howManyStudent;


    public SchoolService(int placesNumber) {
        this.studentsArray = new Student[placesNumber];
    }

    public void addStudent(Student student) {
        if (student == null)
            System.out.println("Nie podano studenta do dodania!");
        else if (studentsArray.length > howManyStudent) {
            studentsArray[howManyStudent] = student;
            howManyStudent++;
            System.out.println("Student dodany na listę " + student);
        } else {
            System.out.println("Lista jest pełna, nie można dodać nowych studentów");
        }
    }

    public void addStudent2(Student student) {
        if (student == null)
            System.out.println("Nie podano studenta do dodania!");
        else if (howManyStudent == studentsArray.length)
            System.out.println("Lista jest pełna, nie można dodać nowych studentów");
        else {
            studentsArray[howManyStudent++] = student;
            System.out.println("Student dodany na listę " + student);
        }
    }



    public void deleteLastAddedStudent() {
        if (howManyStudent > 0) {
            Student lastAddedStudent = studentsArray[howManyStudent - 1];
            studentsArray[howManyStudent - 1] = null;
            howManyStudent--;
            System.out.println("Usunięto ostatniego studenta z listy " + lastAddedStudent);
        } else if (howManyStudent == 0) {
            System.out.println("Lista jest pusta, nie można usunąć studentów");
        }
    }

    public void deleteLastAddedStudent2() {
        if (howManyStudent == 0)
            System.out.println("Lista jest pusta, nie można usunąć studentów");
        else {
            howManyStudent--;
            System.out.println("Usunięto ostatniego studenta z listy " + studentsArray[howManyStudent]);
            studentsArray[howManyStudent] = null;
        }


    }


}