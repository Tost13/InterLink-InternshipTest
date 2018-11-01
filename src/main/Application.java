package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;

public class Application {
    public static void main(String[] args) {
    	
    	
        University university = new University("CH.U.I.");
        university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Maria Perechrest"),5);

        university.setStudent(new Student("Andrew Kostenko"),4);
        university.setStudent(new Student("Julia Veselkina"),5);
        university.setStudent(new Student("Maria Perechrest"),3);
        

        Internship internship = new Internship("Interlink");
        
        for (Student s: university.getStudentsList()) {
        	if(s.getKnowledge()>=university.getAvarageLevel()) internship.setStudent(s);
        	
        }
        
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
       
       // university.getStudents();
        //System.out.println(university.getAvarageLevel());
    }
}
