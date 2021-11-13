package uml_diagram;

public class Student {
	
	public String name;
	public Integer StudentId;
	public Project project;
	public Course courses;
	public Exam exam;
	
	Student(){};
	
	public String getName() {
		return name;
	}
	
	public Project getProjects() {
		return project;};
	
	//many-to-many & 0..* multiplicity: 0 to infinite students can register for 0 to infinite exams
	//many-to-many & 1..* multiplicity: 0 to infinite students can take 1 to infinite courses
	//aggregation relationship: student can be am member (part) of of project (whole)


}
