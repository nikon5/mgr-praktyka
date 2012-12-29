package com.korczak.kacper.mgr.refactoring.tdd.after.strategypattern;

import java.util.ArrayList;
import java.util.List;

public class TaxCalculator {

	public double calculate(double taxableAmount) {
		List<TaxTreshold> strategyList = prepareStrategies();
		for(TaxTreshold strategy : strategyList) {
			if(strategy.isApplicableFor(taxableAmount)) {
				return strategy.apply(taxableAmount);
			}
		}
		throw new RuntimeException("Taxable amount below zero.");
	}

	private List<TaxTreshold> prepareStrategies() {
		List<TaxTreshold> strategyList = new ArrayList<TaxTreshold>();
		strategyList.add(new FirstTaxThresholdStrategy());
		strategyList.add(new SecondTaxTresholdStrategy());
		strategyList.add(new ThirdTaxTresholdStrategy());
		return strategyList;
	}
}