package Files;

public class Uchenik {
	private String name;
	private double averageGrade;
	
	public Uchenik(String name, double averageGrade) {
		super();
		this.name = name;
		this.averageGrade = averageGrade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(double averageGrade) {
		this.averageGrade = averageGrade;
	}

	@Override
	public String toString() {
		return "Uchenik [name=" + name + ", averageGrade=" + averageGrade + "]";
	}

	
}
