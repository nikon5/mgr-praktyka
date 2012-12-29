package com.korczak.kacper.mgr.refactoring.legacycode.after.sproutclass;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import com.korczak.kacper.mgr.refactoring.legacycode.after.sproutclass.QuaterlyReportTableHeaderGenerator;

public class QuaterlyReportGeneratorTest {

	@Test
	public void canCreateQuaterlyReportGenerator() {
		new QuaterlyReportGenerator();
	}

	@Test
	public void canCreateQuaterlyReportGeneratorWithParameter() {
		QuaterlyReportTableHeaderGenerator tableHeaderGenerator = new QuaterlyReportTableHeaderGenerator();
		new QuaterlyReportGenerator(tableHeaderGenerator);
	}

	@Test
	public void shouldGenerateProperHeader() {
		String expected = "<tr><td>Department</td><td>Manager</td></tr>";
		QuaterlyReportTableHeaderGenerator quateryReportGenerator = new QuaterlyReportTableHeaderGenerator();

		String actual = quateryReportGenerator.generate();

		assertThat(actual, is(equalTo(expected)));
	}

}
