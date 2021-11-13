package uml_diagram;

public class Professor {
	
	public Course courses;
	public Exam exam;
	
	Professor(){};
	
	public void publishCourse(){};

	public void assignTeachingAssistant(){};
	
	public void addNewCourse(){};
	
	//one-to-many & 0..* multiplicity: 1 professor manages 0 to infinite courses
	//professor is a superclass for employees (his subclass)
	//many-to-many: 0 to infinite professors manage 0 to infinite exams
}
