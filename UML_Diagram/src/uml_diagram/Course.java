package uml_diagram;

public class Course {
	
	public Integer id;
	public String name;
	public Integer maxCapacity;
	public boolean isFull;
	public Professor prof;
	public Student student;
	public Exam exam;
	
	Course(Integer id, String name, Integer cap, Professor prof){};
	
	public void enroll (Student student) {};
	
	public void apply (TeachingAssistant ta) {};
	
	public void setMaxCap (Integer max) {};
	
	public Professor getProf() {
		return null;
	}

	public TeachingAssistant getTeachingAssitant() {
		return null;
	}
	
	public void setNewTeachingAssitant (TeachingAssistant ta) {
	}

	public void setName (String s) {
	}
	
	//one-to-many & 1..* multiplicity: 1 course can have 1 to infinite projects exams
}
