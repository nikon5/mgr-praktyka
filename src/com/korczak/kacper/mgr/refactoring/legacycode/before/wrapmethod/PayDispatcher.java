package com.korczak.kacper.mgr.refactoring.legacycode.before.wrapmethod;

import java.util.Calendar;

public class PayDispatcher {

	public void pay(Employee employee, Calendar date, Money amount) {
		System.out.println("Dummy method saying that Employee is being paid.");
	}
}