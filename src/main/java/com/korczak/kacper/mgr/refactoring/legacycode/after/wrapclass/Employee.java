package com.korczak.kacper.mgr.refactoring.legacycode.after.wrapclass;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Employee {

	private PayDispatcher payDispatcher;
	private List<Timecard> timecards;
	private Set<Calendar> payPeriod;
	private int payRate;

	public Employee(PayDispatcher payDispatcher) {
		super();
		this.payDispatcher = payDispatcher;
		initialize();
	}

	public void pay() {
		dispatchPayment();
	}

	private void dispatchPayment() {
		Money amount = new Money();
		Calendar date = Calendar.getInstance();
		for (Timecard card : timecards) {
			if(payPeriod.contains(date)) {
				amount.add(card.getHours() * payRate);
			}
		}
		payDispatcher.pay(this, date, amount);
	}

	private void initialize() {
		initializeTimecards();
		initializePayPeriod();
		initializePayRate();
	}

	private void initializePayRate() {
		this.payRate = 10;
	}

	private void initializeTimecards() {
		this.timecards = new ArrayList<Timecard>();
		timecards.add(new Timecard());
		timecards.add(new Timecard());
		timecards.add(new Timecard());
	}

	private void initializePayPeriod() {
		this.payPeriod = new HashSet<Calendar>();
		payPeriod.add(Calendar.getInstance());
	}

}
