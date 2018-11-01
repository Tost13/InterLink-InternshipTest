package person.consciousness;

public class Knowledge {
	int level;
	
	public Knowledge() {
		level = 0;
	}
    public int getLevel(){
        return this.level;
        }
    public void setLevel(int level){
        if(level<0 ||level>=5) {
        	this.level = level;
        }
        else {
        	this.level = 0;
        	System.out.println("Knowlage must be from 0 to 5. Set 0 by default:");
        }
    }
    public void setLevel(){
    	this.level=0;
    }
    public Knowledge(int level) {
    	this.level=level;
        
    }
    
}
