package com.korczak.kacper.mgr.refactoring.tdd.before.replaceconstructorswithmethods;

import java.util.Date;

import org.junit.Test;

public class LoanTest {

	@Test
	public void canCreateReplaceConstructorsWithMethods1() {
		float notional = 1;
		float outstanding = 2;
		int customerRating = 3;
		Date expiry = new Date();

		new Loan(notional, outstanding, customerRating, expiry);
	}

	@Test
	public void canCreateReplaceConstructorsWithMethods2() {
		float notional = 1;
		float outstanding = 2;
		int customerRating = 3;
		Date expiry = new Date();
		Date maturity = new Date();

		new Loan(notional, outstanding, customerRating, expiry, maturity);
	}

	@Test
	public void canCreateReplaceConstructorsWithMethods3() {
		float notional = 1;
		float outstanding = 2;
		int customerRating = 3;
		Date expiry = new Date();
		Date maturity = new Date();
		int strategy = 5;

		new Loan(strategy, notional, outstanding, customerRating, expiry, maturity);
	}

	@Test
	public void canCreateReplaceConstructorsWithMethods4() {
		float notional = 1;
		float outstanding = 2;
		int customerRating = 3;
		Date expiry = new Date();
		int strategy = 5;
		String type = "default";

		new Loan(type, strategy, notional, outstanding, customerRating, expiry);
	}

	@Test
	public void canCreateReplaceConstructorsWithMethods5() {
		float notional = 1;
		float outstanding = 2;
		int customerRating = 3;
		Date expiry = new Date();
		Date maturity = new Date();
		int strategy = 5;
		String type = "default";

		new Loan(type, strategy, notional, outstanding, customerRating, expiry, maturity);
	}
}





