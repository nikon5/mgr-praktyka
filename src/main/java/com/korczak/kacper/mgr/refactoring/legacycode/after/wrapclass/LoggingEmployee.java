package com.korczak.kacper.mgr.refactoring.legacycode.after.wrapclass;

public class LoggingEmployee extends Employee{

	private Employee employee;
	private ConsoleLogger consoleLogger;

	public LoggingEmployee(Employee employee, PayDispatcher payDispatcher, ConsoleLogger consoleLogger) {
		super(payDispatcher);
		this.employee = employee;
		this.consoleLogger = consoleLogger;
	}

	@Override
	public void pay() {
		logPayment();
		employee.pay();
	}

	private void logPayment() {
		consoleLogger.log();
	}
}
