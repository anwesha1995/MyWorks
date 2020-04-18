import java.util.ArrayList;
import java.util.Iterator;


public class Employee {
	
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

		
		public void setEmpNum(int empNum) {
			this.empNum = empNum;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

		public void setEmpSalary(double empSalary) {
			this.empSalary = empSalary;
		}

		public static void main(String[] args) {
			
			
			ArrayList<Employee> emp = new ArrayList<Employee>();
			Employee employee=new Employee();
			employee.setEmpNum(1001);
			employee.setEmpName("emp1");
			employee.setEmpSalary(5000);
			
			emp.add(employee);
			
			employee=new Employee();
			employee.setEmpNum(1002);
			employee.setEmpName("emp2");
			employee.setEmpSalary(6000);
			
			emp.add(employee);
			
			employee=new Employee();
			employee.setEmpNum(1003);
			employee.setEmpName("emp3");
			employee.setEmpSalary(7000);
			
			emp.add(employee);
			
			employee=new Employee();
			employee.setEmpNum(1004);
			employee.setEmpName("emp4");
			employee.setEmpSalary(8000);
			
			emp.add(employee);
			
			employee=new Employee();
			employee.setEmpNum(1005);
			employee.setEmpName("emp5");
			employee.setEmpSalary(10000);
			
			emp.add(employee);
			
			Iterator<Employee> iterator=emp.iterator();
			
			while(iterator.hasNext()){
				Employee e=iterator.next();
				int empNum=e.getEmpNum();
				String empName=e.getEmpName();
				double empSalary=e.getEmpSalary();
				System.out.println(e+" : "+empNum+"\t"+empName+"\t"+empSalary);
			}

		}

			

	}
