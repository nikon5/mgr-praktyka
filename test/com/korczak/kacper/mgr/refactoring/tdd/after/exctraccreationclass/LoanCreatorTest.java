package com.korczak.kacper.mgr.refactoring.tdd.after.exctraccreationclass;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.korczak.kacper.mgr.refactoring.tdd.before.exctraccreationclass.Loan;

public class LoanCreatorTest {

	@Test
	public void shouldReturnNewAdvisorWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date maturity = new Date();
		int riskRating = 5;

		LoanCreator.newAdvisor(notional, start, maturity, riskRating);
	}

	@Test
	public void shouldReturnNewLetterOfCreditWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date maturity = new Date();
		int riskRating = 5;

		LoanCreator.newLetterOfCredit(notional, start, maturity, riskRating);
	}

	@Test
	public void shouldReturnNewRCTLWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date expiry = new Date();
		Date maturity = new Date();
		int riskRating = 5;

		LoanCreator.newRCTL(notional, start, expiry, maturity, riskRating);
	}

	@Test
	public void shouldReturnNewRevolverWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date expiry = new Date();
		int riskRating = 5;

		LoanCreator.newRevolver(notional, start, expiry, riskRating);
	}

	@Test
	public void shouldReturnNewSPLCWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date maturity = new Date();
		int riskRating = 5;

		LoanCreator.newSPLC(notional, start, maturity, riskRating);
	}

	@Test
	public void shouldReturnNewTermLoanWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date maturity = new Date();
		int riskRating = 5;

		LoanCreator.newTermLoan(notional, start, maturity, riskRating);
	}

	@Test
	public void shouldReturnNewVarialbeLoanWhenGivenParameters() {
		double notional = 1000;
		Date start = new Date();
		Date expiry = new Date();
		Date maturity = new Date();
		int riskRating = 5;

		LoanCreator.newVaribleLoan(notional, start, expiry, maturity, riskRating);
	}
}
