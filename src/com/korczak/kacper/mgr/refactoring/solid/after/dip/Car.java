package com.korczak.kacper.mgr.refactoring.solid.after.dip;


public class Car {

	Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void run() {
		engine.start();
	}

}
