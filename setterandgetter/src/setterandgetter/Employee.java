package setterandgetter;

public class Employee {
	
	int EmpId;
	String EmpName;
	double EmpSalary;
	public Employee() {
		
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public void setEmpSalary(double empSalary) {
		EmpSalary = empSalary;
	}
	public void getInfo()
	{
		System.out.println(EmpId);
		System.out.println(EmpName);
		System.out.println(EmpSalary);
	}

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setEmpId(1001);
		e.setEmpName("Akshaya");
		e.setEmpSalary(56789.88);
		
		e.getInfo();
		// TODO Auto-generated method stub

	}

}
