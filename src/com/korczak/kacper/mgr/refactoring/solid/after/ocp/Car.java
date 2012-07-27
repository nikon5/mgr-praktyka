package com.korczak.kacper.mgr.refactoring.solid.after.ocp;

public class Car {

	private Starterable starter;
	private Enginable engineA;

	public Car(Starterable starter, Enginable engineA) {
		super();
		this.starter = starter;
		this.engineA = engineA;
	}

	public void run() {
		starter.start();
		engineA.start();
	}
}
