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
    	if (student!=null)
    	students.add(student);
    }

    public String getStudents() {
    	String s = "";
    	for(Student item: students){
    		if (item!=null)
            s +=item.getName();
    		s+="\n";
    	}
    	if(s == "") s = "None";
        return s;
    }
}
