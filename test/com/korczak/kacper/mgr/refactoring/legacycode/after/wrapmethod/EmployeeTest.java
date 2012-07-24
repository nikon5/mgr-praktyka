package com.korczak.kacper.mgr.refactoring.legacycode.after.wrapmethod;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeTest {

	@Mock ConsoleLogger mockConsoleLogger;
	@Mock PayDispatcher payDispatcher;

	@Test
	public void shouldInvokeLogPaymentWhenCallingPay() {
		doNothing().when(mockConsoleLogger).log();
		Employee employee = new Employee(payDispatcher, mockConsoleLogger);

		employee.pay();

		verify(mockConsoleLogger).log();
	}

}
