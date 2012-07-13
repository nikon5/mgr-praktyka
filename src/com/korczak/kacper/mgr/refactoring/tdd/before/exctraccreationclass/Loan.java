package com.korczak.kacper.mgr.refactoring.tdd.before.exctraccreationclass;

import java.util.Date;


public class Loan {

	@SuppressWarnings("unused")
	private double notional;
	@SuppressWarnings("unused")
	private Date start;
	@SuppressWarnings("unused")
	private Date expiry;
	@SuppressWarnings("unused")
	private Date maturity;
	@SuppressWarnings("unused")
	private int riskRating;
	@SuppressWarnings("unused")
	private int strategy;

	public Loan(double notional, Date start, Date expiry, Date maturity, int riskRating, int strategy) {
		this.notional = notional;
		this.start = start;
		this.expiry = expiry;
		this.maturity = maturity;
		this.riskRating = riskRating;
		this.strategy = strategy;
	}

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