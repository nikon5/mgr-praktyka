package com.korczak.kacper.mgr.refactoring.tdd.before.chainconstructor;

import java.util.Date;

public class ChainConstructor {

	@SuppressWarnings("unused")
	private float notional;
	@SuppressWarnings("unused")
	private float outstanding;
	@SuppressWarnings("unused")
	private int rating;
	@SuppressWarnings("unused")
	private Date expiry;
	@SuppressWarnings("unused")
	private Date maturity;
	@SuppressWarnings("unused")
	private int strategy;

	public ChainConstructor(float notional, float outstanding, int rating, Date expiry) {
		this.notional = notional;
		this.outstanding = outstanding;
		this.rating = rating;
		this.expiry = expiry;
	}

	public ChainConstructor(float notional, float outstanding, int rating,
			Date expiry, Date maturity) {
		this.notional = notional;
		this.outstanding = outstanding;
		this.rating = rating;
		this.expiry = expiry;
		this.maturity = maturity;
	}

	public ChainConstructor(float notional, float outstanding, int rating,
			Date expiry, Date maturity, int strategy) {
		this.notional = notional;
		this.outstanding = outstanding;
		this.rating = rating;
		this.expiry = expiry;
		this.maturity = maturity;
		this.strategy = strategy;
	}
}
