package com.korczak.kacper.mgr.refactoring.tdd.before.replaceonedistinctionwithcomposite;

import java.util.Enumeration;
import java.util.Vector;

public class Product {

	private Vector<Part> singleParts = new Vector<Part>();
	private Vector<PartSet> collectedParts = new Vector<PartSet>();

	public void add(Part part) {
		singleParts.addElement(part);
	}

	public void add(PartSet partSet) {
		collectedParts.addElement(partSet);
	}

	public float getPrice() {
		float price = 0.0f;
		@SuppressWarnings("rawtypes")
		Enumeration e;

		for(e=singleParts.elements(); e.hasMoreElements();) {
			Part p = (Part)e.nextElement();
			price += p.getPrice();
		}

		for(e=collectedParts.elements(); e.hasMoreElements();) {
			PartSet set = (PartSet) e.nextElement();
			price += set.getPrice();
		}

		return price;
	}

}
