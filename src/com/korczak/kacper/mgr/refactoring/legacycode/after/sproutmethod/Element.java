package com.korczak.kacper.mgr.refactoring.legacycode.after.sproutmethod;

public class Element {

	private int number;

	public Element(int initialNumber) {
		number = initialNumber;
	}

	public void process() {
		System.out.println(number);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Element other = (Element) obj;
		if (number != other.number)
			return false;
		return true;
	}


}