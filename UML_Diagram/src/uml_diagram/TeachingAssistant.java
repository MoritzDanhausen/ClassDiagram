package uml_diagram;

public class TeachingAssistant {
	
	public Course courses;
	public String name;
	
	TeachingAssistant(){};
	
	public Course getCourse() {
		return courses;
	};
	
	public String getName() {
		return name;
	};
	
	public void extendContract (Course course) {};
	
	public void setName (String name) {
		this.name = name;
	};
	
	//many-to-many: 0 to infinite teaching assistants teaches 1 to infinite courses
	//many-to-many & 1..* multiplicity: 1 to infinite teaching assistants manages 1 to infinite exams
	

	
	

}
