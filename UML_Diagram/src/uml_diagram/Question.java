package uml_diagram;

public class Question {
	
	public String task;
	public Integer maxValue;
	public Integer qId;
	
	Question(Integer id, String task, Integer value) {
	}
	
	//composition relationship: exam contains questions, if exam gets deleted, questions will get deleted
}
