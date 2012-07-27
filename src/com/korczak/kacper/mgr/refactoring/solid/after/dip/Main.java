package com.korczak.kacper.mgr.refactoring.solid.after.dip;

public class Main {

	public static void main() {
		Engine engine = new EngineFactory().getEngine();
		Car car = new Car(engine);
	}

}
