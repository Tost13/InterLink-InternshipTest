package institution;

import java.util.ArrayList;
import person.consciousness.Knowledge;
import person.Student;

public class University {
	String name;
	ArrayList<Student> students=new ArrayList<Student>();
	
    public University() {
	name = "None";
	   }
	public University(String name) {
    	this.name = name; 
    }
    public String getName(){
        return this.name;
        }
    public void setName(String name){
        this.name = name;
    }
    public void getStudents() {
    for(Student item: students){
        System.out.println(item.getName());
    }}
    
    /*public ArrayList<Student> getStudentsList() {
    	return students;
    }*/
    public Student getStudent(int i) {
    	if(i>=0 && i<students.size()) 
    	return students.get(i);
    	else return null;
    }

    public void setStudent(Student student) {
     	for(Student item: students){
            if (item.getName()== student.getName()) {
            	item.setKnowledge();
            };
        }
    }
    public void setStudent(Student student, int i) {
     	for(Student item: students){
            if (item.getName()== student.getName()) {
            	Knowledge know = new Knowledge(i);
            	item.setKnowledge(know);
            };
        }
    }
    public void addStudent(Student student) {
    		students.add(student);
    }
    public void addStudent(Student student,int i) {
    	Knowledge know = new Knowledge(i);
    	student.setKnowledge(know);
		students.add(student);
}
}
