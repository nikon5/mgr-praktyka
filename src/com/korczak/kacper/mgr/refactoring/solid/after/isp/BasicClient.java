package com.korczak.kacper.mgr.refactoring.solid.after.isp;

public class BasicClient {

	private BasicActions basicActions;

	public BasicClient(BasicActions basicActions) {
		this.basicActions = basicActions;
	}

	public void start() {
		basicActions.start();
	}

	public void stop() {
		basicActions.stop();
	}

	public void restart() {
		basicActions.restart();
	}
}
