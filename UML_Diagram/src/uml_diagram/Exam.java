package uml_diagram;

public class Exam {
	
	public Integer max_value;
	public Course course;
	public Question question;
	public Student student;
	
	Exam(){};
	
	public boolean register(Student s){
		return false; //set boolean
	};
	
	public void addQuestion (Integer id, String task, Integer value) {};
	
	public Student getRegisteredStudents() {
		return null;
	}
	
	public void setMaxValue(Integer max) {};
	
}
