package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Maria Perechrest"));

        Internship internship = new Internship("Interlink");
        internship.setStudent(university.getStudent(0));
        internship.setStudent(university.getStudent(1));
        internship.setStudent(university.getStudent(5));
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
       
        
    }
}
