package com.korczak.kacper.mgr.refactoring.solid.after.dip;

import java.util.List;

public class Chamber {

	@SuppressWarnings("unused")
	private List<Cylinder> cylinders;

	public Chamber(List<Cylinder> cylinders) {
		this.cylinders = cylinders;
	}
}
