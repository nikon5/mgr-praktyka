package com.korczak.kacper.mgr.refactoring.tdd.before.replaceconstructorswithmethods;

import java.util.Date;

public class Loan {
	private static String TERM_LOAN = "TL";
	private static String RCTL = "RCTL";
	@SuppressWarnings("unused")
	private static String REVOLVER = "RC";
	@SuppressWarnings("unused")
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

	public Loan(float notional, float outstanding,
			int customerRating, Date expiry) {
		this(TERM_LOAN, (int) Math.random(), notional, outstanding, customerRating, expiry, null);
	}
	public Loan(float notional, float outstanding,
			int customerRating, Date expiry, Date maturity) {
		this(RCTL, (int)Math.random(), notional, outstanding, customerRating, expiry, maturity);
	}

	public Loan(int strategy, float notional, float outstanding,
			int customerRating, Date expiry, Date maturity) {
		this(RCTL, strategy, notional, outstanding, customerRating, expiry, maturity);
	}

	public Loan(String type, int strategy, float notional,
			float outstanding, int customerRating, Date expiry) {
		this(type, strategy, notional, outstanding, customerRating, expiry, null);
		}

	public Loan (String type, int strategy, float notional,
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
}



