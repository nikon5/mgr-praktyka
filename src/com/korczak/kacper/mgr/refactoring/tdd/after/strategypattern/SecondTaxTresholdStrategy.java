package com.korczak.kacper.mgr.refactoring.tdd.after.strategypattern;

public class SecondTaxTresholdStrategy implements TaxTreshold {

	private static final int ONE_THOUSAND = 1000;
	private static final int TEN_THOUSAND = 10000;
	private static final double TWENTY_PERCENT = 0.2;

	@Override
	public boolean isApplicableFor(double taxableAmount) {
		return taxableAmount > ONE_THOUSAND && taxableAmount <= TEN_THOUSAND;
	}

	@Override
	public double apply(double taxableAmount) {
		return TWENTY_PERCENT * taxableAmount;
	}

}
