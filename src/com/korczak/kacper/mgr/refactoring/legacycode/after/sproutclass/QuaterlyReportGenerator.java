package com.korczak.kacper.mgr.refactoring.legacycode.after.sproutclass;

import java.util.List;

import com.korczak.kacper.mgr.refactoring.legacycode.after.sproutclass.HtmlGenerator;
import com.korczak.kacper.mgr.refactoring.legacycode.after.sproutclass.QuaterlyReportTableHeaderGenerator;

public class QuaterlyReportGenerator implements HtmlGenerator{

	private DatabaseFetcher database;
	private QuaterlyReportTableHeaderGenerator headerGenerator;

	public QuaterlyReportGenerator() {
		this.database = new DatabaseFetcher();
	}

	public QuaterlyReportGenerator(QuaterlyReportTableHeaderGenerator tableHeaderGenerator) {
		this();
		this.headerGenerator = tableHeaderGenerator;
	}

	@Override
	public String generate() {

		List<Result> results = database.queryResults();

		String pageText = "";

		pageText += "<html><head><title>" + "Quaterly Report"
				+ "</title></head><body><table>";

		if (results.size() != 0) {

			pageText += this.headerGenerator.generate();

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
