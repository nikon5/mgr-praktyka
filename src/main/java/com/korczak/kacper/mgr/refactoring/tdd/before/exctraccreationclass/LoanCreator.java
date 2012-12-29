package com.korczak.kacper.mgr.refactoring.tdd.before.exctraccreationclass;

import java.util.Date;

public class LoanCreator {

	public static Loan newAdvisor(double notional, Date start, Date maturity, int riskRating) {
		return new Loan(notional, start, null, maturity, riskRating, 1);
	}

	public static Loan newLetterOfCredit(double notional, Date start, Date maturity, int riskRating) {
		return new Loan(notional, start, null, maturity, riskRating, 2);
	}

	public static Loan newRCTL(double notional, Date start, Date expiry, Date maturity, int riskRating) {
		return new Loan(notional, start, expiry, maturity, riskRating, 3);
	}

	public static Loan newRevolver(double notional, Date start, Date expiry, int riskRating) {
			return new Loan(notional, start, expiry, null, riskRating, 4);
	}

	public static Loan newSPLC(double notional, Date start, Date maturity, int riskRating){
		return new Loan(notional, start, null, maturity, riskRating, 5);
	}

	public static Loan newTermLoan(double notional, Date start, Date maturity, int riskRating) {
		return new Loan(notional, start, null, maturity, riskRating, 6);
	}

	public static Loan newVaribleLoan(double notional, Date start, Date expiry, Date maturity, int riskRating) {
		return new Loan(notional, start, expiry, maturity, riskRating, 7);
	}
}
