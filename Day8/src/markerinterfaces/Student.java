package markerinterfaces;

public class Student implements Registrable  {
	private int id;
	private String name;
	private double fees;
	private String course;

	Student() {
		super();
	}

	public Student(int id, String name, double fees, String course) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
}



