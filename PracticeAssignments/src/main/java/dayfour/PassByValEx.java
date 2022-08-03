package dayfour;

public class PassByValEx {

	public static void main(String[] args) {
		// passing vals for the class
		EmployeePayroll ep = new EmployeePayroll();
		int empID = 101;
		ep.getEmpDet(empID);
		System.out.println(empID);

	}

}

class Employee
{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}

class EmployeePayroll
{
	public void calPayroll(Employee e)
	{
		
	}
	
	public void getEmpDet(Employee e)
	{
		
	}
	
}