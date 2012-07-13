package com.korczak.kacper.mgr.refactoring.tdd.after.replaceconstructorswithmethods;

import java.util.Date;

public class Loan {
	static final int DEFAULT_STRATEGY = 5;
	static String TERM_LOAN = "TL";
	static String REVOLVER = "RC";
	static String RCTL = "RCTL";
	private String type;
	@SuppressWarnings("unused")
	private float notional;
	@SuppressWarnings("unused")
	private float outstanding;
	@SuppressWarnings("unused")
	private int customerRating;
	@SuppressWarnings("unused")
	private Date expiry;
	@SuppressWarnings("unused")
	private Date maturity;
	@SuppressWarnings("unused")
	private int strategy;

	public String getType() {
		return type;
	}

	public Loan(float notional, float outstanding,
			int customerRating, Date expiry) {
		this(TERM_LOAN, DEFAULT_STRATEGY, notional, outstanding, customerRating, expiry, null);
	}
	public Loan(float notional, float outstanding,
			int customerRating, Date expiry, Date maturity) {
		this(RCTL, DEFAULT_STRATEGY, notional, outstanding, customerRating, expiry, maturity);
	}

	public Loan(int strategy, float notional, float outstanding,
			int customerRating, Date expiry, Date maturity) {
		this(RCTL, strategy, notional, outstanding, customerRating, expiry, maturity);
	}

	public Loan(String type, int strategy, float notional,
			float outstanding, int customerRating, Date expiry) {
		this(type, strategy, notional, outstanding, customerRating, expiry, null);
	}

	protected Loan (String type, int strategy, float notional,
			float outstanding, int customerRating, Date expiry, Date maturity) {
		this.type = type;
		this.strategy = strategy;
		this.notional = notional;
		this.outstanding = outstanding;
		this.customerRating = customerRating;
		this.expiry = expiry;
		if (RCTL.equals(type)) {
			this.maturity = maturity;
		}
	}
	public static Loan newTerm(float notional, float outstanding,
			int custRating, Date expiry) {
		return new Loan(TERM_LOAN, DEFAULT_STRATEGY, notional, outstanding, custRating, expiry, null);
	}

	public static Loan newTermWithStrategy(int strategy, float notional, float outstanding,
			int custRating, Date expiry) {
		return new Loan(TERM_LOAN, strategy, notional, outstanding, custRating, expiry, null);
	}

	public static Loan newRevolver(float notional, float outstanding,
			int customerRating, Date expiry) {
		return new Loan(REVOLVER, DEFAULT_STRATEGY, notional, outstanding, customerRating, expiry, null);
	}

	public static Loan newRevolerWithStrategy(
			int strategy, float notional, float outstanding,
			int customerRating, Date expiry) {
		return new Loan(REVOLVER, strategy, notional, outstanding, customerRating, expiry, null);
	}

	public static Loan newRCTL(float notional, float outstanding, int customerRating,
			Date expiry, Date maturity) {
		return new Loan(RCTL, DEFAULT_STRATEGY , notional, outstanding,
				customerRating, expiry, maturity);
	}

	public static Loan newRCTLWithStrategy(
			String type, int strategy, float notional, float outstanding,
			int customerRating, Date expiry, Date maturity) {
		return new Loan(type, strategy, notional, outstanding, customerRating, expiry, maturity);
	}
}