package com.korczak.kacper.mgr.refactoring.solid.after.dip;


public class Engine {

	@SuppressWarnings("unused")
	private Crankshaft crankshaft;
	@SuppressWarnings("unused")
	private CommonRail commonRail;
	@SuppressWarnings("unused")
	private Chamber chamber;

	public Engine(Crankshaft crankshaft, CommonRail commonRail, Chamber chamber) {
		this.crankshaft = crankshaft;
		this.commonRail = commonRail;
		this.chamber = chamber;
	}

	public void start() {
	}
}
