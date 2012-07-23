package com.korczak.kacper.mgr.refactoring.legacycode.before.sproutmethod;

public class Element {

	private int number;

	public Element(int initialNumber) {
		number = initialNumber;
	}

	public void process() {
		System.out.println(number);
	}
}