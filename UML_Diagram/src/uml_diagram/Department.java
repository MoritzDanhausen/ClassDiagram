package uml_diagram;

public class Department {
	
	public String name;
	public Employee employee[];
	public Professor chair[] = new Professor [1];
	public Course courses[];
	
	Department(String name, Employee employee[], Professor chair[], Course courses[]) {
	};
	
	//one-to-many & 0..* multiplicity: 1 department can have 0 to infinite courses
	//one-to-many & 0..* multiplicity: 1 department can have 0 to infinite employees
	//aggregation relationship: department represent whole and employees a are a part of a department
}
