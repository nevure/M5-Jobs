package com.jobs.domain;

public class Volunteer extends AbsStaffMember {
	
	String description;
	

	public Volunteer(String name, String address, String phone, String description) throws Exception {
		super(name, address, phone);
		this.description = description;
	}

	
	@Override
	public void pay() {
		/*los voluntarios no cobran */
	}

	/**
	 * Sobreescribimos el método toString para adaptarlo al voluntario.
	 */
	@Override
	public String toString() {
		return "Nombre: "+name+ ". Voluntario. "+description;
	}
}
