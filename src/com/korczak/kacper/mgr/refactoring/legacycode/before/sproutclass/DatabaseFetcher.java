package com.korczak.kacper.mgr.refactoring.legacycode.before.sproutclass;

import java.util.ArrayList;
import java.util.List;

public class DatabaseFetcher {

	public List<Result> queryResults() {
		List<Result> fixedResultList = new ArrayList<Result>();
		fixedResultList.add(new Result("department1", "jan"));
		fixedResultList.add(new Result("departament2", "mateusz"));
		return fixedResultList;
	}

}
