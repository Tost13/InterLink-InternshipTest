package institution.interlink;

import java.util.ArrayList;

import person.Student;

public class Internship {
	String name;
	ArrayList<Student> students=new ArrayList<Student>();
	public Internship() {
        name = "None";
    }
    public Internship(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
        }
    public void setName(String name){
        this.name = name;
    }
    public void setStudent(Student student) {
    	students.add(student);
    }

    public String getStudents() {
    	String s = null;
    	for(Student item: students){
            s +=item.getName();
    	}
    	if(s == null) s="none";
        return s;
    }
}
