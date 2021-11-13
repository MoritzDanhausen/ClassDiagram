package uml_diagram;

public class Project {
	
	public String name;
	public Student members;
	public Course course;
	
	Project(){};
	
	public String getName() {
		return name;
	}
	
	public void setName (String n) {
		this.name = n;
	}
	
	public void addNewMember (Student s) {	
	}
	
	public Student getMembers() {
		return null;
	}
	
	//one-to-many & 0..* multiplicity: 1 course can have 0 to infinite projects

}
