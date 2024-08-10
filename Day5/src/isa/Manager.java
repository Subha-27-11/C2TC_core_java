package isa;

public class Manager extends Employee {
	private int teamSize;
	
	public Manager() {
		super();

	}

	public Manager(String name, int employeeId, String department, int teamSize) {
		super();
		this.teamSize = teamSize;
	}

	// getter/setter methods
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}
	public String toString() {
		return "Manager [TeamSize=" + teamSize + ", Name=" + getName () + ", EmployeeId=" + getEmployeeId()+ ", Department=" + getDepartment() + "]";
	}

}
