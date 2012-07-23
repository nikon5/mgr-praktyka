package com.korczak.kacper.mgr.refactoring.legacycode.before.sproutclass;

import java.util.List;

public class QuaterlyReportGenerator{

	private DatabaseFetcher database;

	public QuaterlyReportGenerator() {
		this.database = new DatabaseFetcher();
	}

	public String generate() {

		List<Result> results = database.queryResults();

		String pageText = "";

		pageText += "<html><head><title>" + "Quaterly Report"
				+ "</title></head><body><table>";

		if (results.size() != 0) {

			for (Result result : results) {
				pageText += "<tr>";
				pageText += "<td>" + result.getDepartment() + "</td>";
				pageText += "<td>" + result.getManager() + "</td>";
				pageText += "</tr>";
			}
		} else {
			pageText += "No results for this period";
		}

		pageText += "</table>";
		pageText += "</body>";
		pageText += "</html>";

		return pageText;
	}

}
