package entities;

public class Task extends Lesson {
	
	private String description;
	private Integer quetionCount;
	
	public Task() {
	}
	
	public Task(String title, String description, Integer quetionCount) {
		super(title);
		this.description = description;
		this.quetionCount = quetionCount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuetionCount() {
		return quetionCount;
	}

	public void setQuetionCount(Integer quetionCount) {
		this.quetionCount = quetionCount;
	}

	@Override
	public int duration() {
		return quetionCount * 5 * 60;
	}
	
}
