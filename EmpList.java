import java.util.ArrayList;
import java.util.Scanner;

public class EmpList {

	private static class Employee{
		private int empNum;
		private String empName;
		private double empSalary;

		public int getEmpNum() {
			return empNum;
		}

		public String getEmpName() {
			return empName;
		}

		public double getEmpSalary() {
			return empSalary;
		}

		public Employee(int empNum,String empName,double empSalary){
			this.empNum=empNum;
			this.empName=empName;
			this.empSalary=empSalary;

		}
	}

	private static void addEmployee(ArrayList <Employee>emp){

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of employee:");
		int n=sc.nextInt();

		for(int i=0;i<n;i++){

			System.out.println("Enter employee no.:");
			int empNum=sc.nextInt();

			System.out.println("Enter employee name:");
			String empName=sc.next();

			System.out.println("Enter employee salary:");
			double empSalary=sc.nextDouble();

			emp.add(new Employee(empNum,empName,empSalary));
		}


	}

	public static void main(String[] args) {


		ArrayList<Employee> emp=new ArrayList<Employee>();
		addEmployee(emp);

		for(Employee e:emp){

			int empNum = e.getEmpNum();

			String empName = e.getEmpName();

			double empSalary = e.getEmpSalary();

			System.out.println(empNum + "\t" + empName + "\t" + empSalary );

		}

	}

}
