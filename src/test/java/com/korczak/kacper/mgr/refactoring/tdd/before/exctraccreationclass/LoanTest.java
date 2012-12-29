package com.korczak.kacper.mgr.refactoring.tdd.before.exctraccreationclass;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class LoanTest {

	@Test
	public void canCreateLoan() {
		double notional = 1000;
		Date start = new Date();
		Date expiry = new Date();
		Date maturity = new Date();
		int riskRating = 8;
		int strategy = 5;

		new Loan(notional, start, expiry, maturity, riskRating, strategy);
	}

	@Test
	public void shouldReturnNewAdvisorWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date maturity = new Date();
		int riskRating = 5;

		Loan.newAdvisor(notional, start, maturity, riskRating);
	}

	@Test
	public void shouldReturnNewLetterOfCreditWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date maturity = new Date();
		int riskRating = 5;

		Loan.newLetterOfCredit(notional, start, maturity, riskRating);
	}

	@Test
	public void shouldReturnNewRCTLWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date expiry = new Date();
		Date maturity = new Date();
		int riskRating = 5;

		Loan.newRCTL(notional, start, expiry, maturity, riskRating);
	}

	@Test
	public void shouldReturnNewRevolverWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date expiry = new Date();
		int riskRating = 5;

		Loan.newRevolver(notional, start, expiry, riskRating);
	}

	@Test
	public void shouldReturnNewSPLCWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date maturity = new Date();
		int riskRating = 5;

		Loan.newSPLC(notional, start, maturity, riskRating);
	}

	@Test
	public void shouldReturnNewTermLoanWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date maturity = new Date();
		int riskRating = 5;

		Loan.newTermLoan(notional, start, maturity, riskRating);
	}

	@Test
	public void shouldReturnNewVarialbeLoanWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date expiry = new Date();
		Date maturity = new Date();
		int riskRating = 5;

		Loan.newVaribleLoan(notional, start, expiry, maturity, riskRating);
	}
}





