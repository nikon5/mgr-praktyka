package com.korczak.kacper.mgr.refactoring.tdd.after.strategypattern;

public class FirstTaxThresholdStrategy implements TaxTreshold {

	private static final int ONE_THOUSAND = 1000;

	@Override
	public boolean isApplicableFor(double taxableAmount) {
		return taxableAmount >= 0 && taxableAmount <= ONE_THOUSAND;
	}

	@Override
	public double apply(double taxableAmount) {
		return taxableAmount;
	}

}
