package com.korczak.kacper.mgr.refactoring.solid.before.dip;

import java.util.ArrayList;
import java.util.List;

public class Car {

	private Engine engine;

	public Car() {
		Piston piston1 = new Piston();
		Piston piston2 = new Piston();
		Piston piston3 = new Piston();
		Cylinder cylinder1 = new Cylinder(piston1);
		Cylinder cylinder2 = new Cylinder(piston2);
		Cylinder cylinder3 = new Cylinder(piston3);
		List<Cylinder> cylinders = new ArrayList<Cylinder>();
		cylinders.add(cylinder1);
		cylinders.add(cylinder2);
		cylinders.add(cylinder3);
		Crankshaft craftshank = new Crankshaft();
		CommonRail commonrail = new CommonRail();
		Chamber chamber = new Chamber(cylinders);
		this.engine = new Engine(craftshank, commonrail, chamber);
	}

	public void run() {
		engine.start();
	}
}
