package com.korczak.kacper.mgr.refactoring.legacycode.before.sproutclass;

public class Result {

	private String department;
	private String manager;

	public Result(String department, String manager) {
		this.department = department;
		this.manager = manager;
	}

	public String getDepartment() {
		return department;
	}

	public String getManager() {
		return manager;
	}
}
