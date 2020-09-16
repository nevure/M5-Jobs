package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository;
	
	public JobsController(){
		repository = new EmployeeRepository();
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(boss);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee managerEmployee = new Employee(name, address, phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(managerEmployee);
	}

	/*
	 * Método para la creación de voluntarios.
	 * 
	 */
	public void createVolunteer(String string, String string2, String string3, String descripcion) {
		try {
			Volunteer voluntario = new Volunteer(string, string2, string3, descripcion);
			repository.addMember(voluntario);

		} catch (Exception e) {
			System.out.println("Ha habido un error en la creación del voluntario:" +e);
			
		}
	}

	public void payAllEmployeers() {
		
		for(AbsStaffMember empleado: repository.getAllMembers()) {
			empleado.pay();
		}
		
		
	}

	public String getAllEmployees() {
		
		String empleadoString ="";
		
		for (AbsStaffMember e: repository.getAllMembers())
		{
			empleadoString = empleadoString + "\n"+e.toString();
		}
		
		return empleadoString;
	}

	
	
	
	
}
