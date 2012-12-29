package com.korczak.kacper.mgr.refactoring.solid.before.dip;


public class Engine {

	private Crankshaft crankshaft;
	private CommonRail commonRail;
	private Chamber chamber;

	public Engine(Crankshaft crankshaft, CommonRail commonRail, Chamber chamber) {
		this.crankshaft = crankshaft;
		this.commonRail = commonRail;
		this.chamber = chamber;
	}

	public void start() {
	}

}
