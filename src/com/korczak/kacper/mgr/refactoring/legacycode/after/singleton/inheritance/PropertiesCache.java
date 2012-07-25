package com.korczak.kacper.mgr.refactoring.legacycode.after.singleton.inheritance;

import com.korczak.kacper.mgr.refactoring.legacycode.after.singleton.inheritance.PropertiesCache;

public class PropertiesCache {

	private static PropertiesCache instance = new PropertiesCache();

	protected PropertiesCache() {

	}

	public static PropertiesCache getInstance() {
		return instance;
	}

	public static void setInstance(PropertiesCache propertiesCache) {
	    instance = propertiesCache;
	}

}
