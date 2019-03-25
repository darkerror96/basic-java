package examples;

public class EmployeeTemp {
	private int empId;
	private String name;
	private String address;

	public EmployeeTemp() {
	}

	public EmployeeTemp(int empId) {
		this.empId = empId;
	}

	public EmployeeTemp(int empId, String name, String address) {
		// super();
		this(empId);
		this.name = name;
		this.address = address;
	}

	public EmployeeTemp(EmployeeTemp employee) {
		this.empId = employee.getEmpId();
		this.name = employee.getName();
		this.address = employee.getAddress();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}

}