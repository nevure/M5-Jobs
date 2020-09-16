package com.jobs.application;

import com.jobs.domain.IPaymentRate;

public class PaymentFactory {

	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.5;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployee(){
		return new IPaymentRate() {
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*0.85;
			}
		};
	}
	
	/*
	 * devuelve una instancia de la clase anónima que implementa  la interfaz IpaymentRate
	 * Aquí calculamos para el caso que el empleado sea manager.
	 */
	public static IPaymentRate createPaymentRateManager() {
		return new IPaymentRate() {
			
			@Override
			public double pay(double salaryPerMonth) {
				return salaryPerMonth*1.1;
			}
		};
	}
	
}
