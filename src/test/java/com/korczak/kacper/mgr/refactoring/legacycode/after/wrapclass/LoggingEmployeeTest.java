package com.korczak.kacper.mgr.refactoring.legacycode.after.wrapclass;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LoggingEmployeeTest {

	@Mock ConsoleLogger mockConsoleLogger;
	@Mock PayDispatcher mockPayDispatcher;

	@Test
	public void test() {
		doNothing().when(mockConsoleLogger).log();
		Employee employee = new Employee(mockPayDispatcher);
		LoggingEmployee loggingemployee = new LoggingEmployee(employee, mockPayDispatcher, mockConsoleLogger);

		loggingemployee.pay();

		verify(mockConsoleLogger).log();
	}

}
