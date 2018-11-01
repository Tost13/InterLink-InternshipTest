package person;

import person.consciousness.Knowledge;

public class Student {
	String name;
	Knowledge knowledge = new Knowledge();
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
    	this.knowledge.setLevel(knowledge.getLevel());
    }
    public void setKnowledge() {
    	this.knowledge.setLevel();
    }
    public int getKnowledge() {
    	
		return knowledge.getLevel();
    }
}
