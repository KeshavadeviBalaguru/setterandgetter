package tostring;

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
	
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpSalary=" + EmpSalary + "]";
	}

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setEmpId(1002);
		e.setEmpName("Manikandan");
		e.setEmpSalary(23456.77);
		
		System.out.println(e.EmpId);
		System.out.println(e.EmpName);
		System.out.println(e.EmpSalary);
		// TODO Auto-generated method stub

	}

}
