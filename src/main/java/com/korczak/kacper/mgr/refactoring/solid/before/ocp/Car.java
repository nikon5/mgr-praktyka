package com.korczak.kacper.mgr.refactoring.solid.before.ocp;

public class Car {

	private StarterA starter;
	private EngineA engineA;

	public Car(StarterA starter, EngineA engineA) {
		super();
		this.starter = starter;
		this.engineA = engineA;
	}

	public void run() {
		starter.start();
		engineA.start();
	}
}
