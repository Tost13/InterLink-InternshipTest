package institution;

import java.util.ArrayList;

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
    public void Cout() {
    for(Student item: students){
        System.out.println(item.getName());
    }
}
    public void setStudent(Student student) {
    	
       /* if(students.contains(student)) {
        	
        }*/
    }

    public void addStudent(Student student) {
    		students.add(student);
    	
        
    }
}
