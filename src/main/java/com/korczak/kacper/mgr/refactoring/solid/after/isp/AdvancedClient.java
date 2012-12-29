package com.korczak.kacper.mgr.refactoring.solid.after.isp;

public class AdvancedClient {

	private AdvancedActions advancedActions;
	private Instrumentable instrumentable;

	public AdvancedClient(AdvancedActions advancedActions, Instrumentable instrumentable) {
		this.advancedActions = advancedActions;
		this.instrumentable = instrumentable;
	}

	public void pause() {
		advancedActions.pause();
	}

	public void freez() {
		advancedActions.freez();
	}

	public void unfreez() {
		advancedActions.unfreez();
	}

	public void instrument() {
		instrumentable.instrument();
	}
}
