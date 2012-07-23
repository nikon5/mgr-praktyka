package com.korczak.kacper.mgr.refactoring.legacycode.after.sproutclass;

public class QuaterlyReportTableHeaderGenerator implements HtmlGenerator{

	@Override
	public String generate() {
		return "<tr><td>Department</td><td>Manager</td></tr>";
	}
}
