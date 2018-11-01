package person;

import java.util.ArrayList;

import person.consciousness.Knowledge;

public class Student {
	String name;
	ArrayList<Knowledge> skills=new ArrayList<Knowledge>();
	public Student() {
        name ="None";
    }
    public Student(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
        }
    public void setName(String name){
        this.name = name;
    }
    public void setKnowledge(Knowledge knowledge) {
    	skills.add(knowledge);
    }
    public void setKnowledge() {
    	Knowledge knowledge = new Knowledge();
    	skills.add(knowledge);
    }
}
