package com.korczak.kacper.mgr.refactoring.tdd.before.replaceonedistinctionwithcomposite;

import java.util.Enumeration;
import java.util.Vector;

public class PartSet {

	private Vector<Part> partSet = new Vector<Part>();

	protected PartSet() {
		this.partSet = new Vector<Part>();
	}

	public float getPrice() {
		float price = 0.0f;

		for(Enumeration<Part> e = this.partSet.elements(); e.hasMoreElements();) {
			Part part = e.nextElement();
			price += part.getPrice();
		}

		return price ;
	}

	public void add(Part part) {
		this.partSet.add(part);
	}
}