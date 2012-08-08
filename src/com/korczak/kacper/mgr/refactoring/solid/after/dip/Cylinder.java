package com.korczak.kacper.mgr.refactoring.solid.after.dip;

public class Cylinder {

	@SuppressWarnings("unused")
	private Piston piston;

	public Cylinder(Piston piston) {
		this.piston = piston;
	}
}
