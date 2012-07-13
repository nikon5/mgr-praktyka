package com.korczak.kacper.mgr.refactoring.tdd.after.replaceconstructorswithmethods;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class LoanTest {

	private float notional;
	private float outstanding;
	private int customerRating;
	private Date expiry;

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() {
		notional = 1;
		outstanding = 2;
		customerRating = 3;
		expiry = new Date(2000, 5, 5);
	}

	@Test
	public void canCreateReplaceConstructorsWithMethods1() {

		new Loan(notional, outstanding, customerRating, expiry);
	}


	@Test
	public void canCreateReplaceConstructorsWithMethods2() {
		Date maturity = new Date();

		new Loan(notional, outstanding, customerRating, expiry, maturity);
	}

	@Test
	public void canCreateReplaceConstructorsWithMethods3() {
		Date maturity = new Date();
		int strategy = 5;

		new Loan(strategy, notional, outstanding, customerRating, expiry, maturity);
	}

	@Test
	public void canCreateReplaceConstructorsWithMethods4() {
		int strategy = 5;
		String type = "RCTL";

		new Loan(type, strategy, notional, outstanding, customerRating, expiry);
	}

	@Test
	public void canCreateReplaceConstructorsWithMethods5() {
		Date maturity = new Date();
		int strategy = 5;
		String type = "RCTL";

		new Loan(type, strategy, notional, outstanding, customerRating, expiry, maturity);
	}

	@Test
	public void termReplaceConstructorsWithMethodsTest() {
		Loan replaceConstructorsWithMethods =
		Loan.newTerm(notional, outstanding, customerRating, expiry);

		assertThat(Loan.TERM_LOAN, is(equalTo(replaceConstructorsWithMethods.getType())));
	}

	@Test
	public void termWithStrategyTest() {
		int strategy = 5;
		Loan replaceConstructorsWithMethods =
				Loan.newTermWithStrategy(strategy, notional, outstanding,
						customerRating , expiry);

		assertThat(Loan.TERM_LOAN, is(equalTo(replaceConstructorsWithMethods.getType())));
	}

	@Test
	public void revolverTest() {
		Loan replaceConstructorsWithMethods =
				Loan.newRevolver(notional, outstanding, customerRating, expiry);

		assertThat(Loan.REVOLVER, is(equalTo(replaceConstructorsWithMethods.getType())));
	}

	@Test
	public void revolverWithStrategyTest() {
		int strategy = 5;
		Loan replaceConstructorsWithMethods =
				Loan.newRevolerWithStrategy(strategy, notional, outstanding,
						customerRating, expiry);

		assertThat(Loan.REVOLVER, is(equalTo(replaceConstructorsWithMethods.getType())));
	}
	@Test
	public void RCTLTest() {
		Date maturity = new Date();
		Loan replaceConstructorsWithMethods =
				Loan.newRCTL(notional, outstanding, customerRating, expiry, maturity);

		assertThat(Loan.RCTL, is(equalTo(replaceConstructorsWithMethods.getType())));
	}

	@Test
	public void RCTLWithStrategyTest() {
		Date maturity = new Date();
		int strategy = 5;
		String type = "RCTL";
		Loan replaceConstructorWithMethods =
				Loan.newRCTLWithStrategy(type, strategy, notional, outstanding,
						customerRating, expiry, maturity);

		assertThat(Loan.RCTL, is(equalTo(replaceConstructorWithMethods.getType())));
	}
}





