package emDetails;

public class Employee {
	
public void getEmployeeInfo(int id) {
	System.out.println("Employeeid="+id);
}
public void getEmployeeInfo(int id,String name) {
	System.out.println("Employeeid="+id+ "Emplployeename="+name);
}

public void getEmployeeInfo(String email,long phno) {
	System.out.println("EmployEmail="+email+"Employphno="+phno);
}

public static void main(String[] args) {
	
	Employee total = new Employee();
	total.getEmployeeInfo(26);
			
	total.getEmployeeInfo(26 , "leela");
	
	total.getEmployeeInfo("leela@gmail.com" , 7032352561L);

}
}
